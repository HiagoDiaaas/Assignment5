package Problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] department = new DeptEmployee[5];

        department[0] = new Professor("Prof. John Doe", 120000, LocalDate.of(2015, 5, 20), 10);
        department[1] = new Professor("Prof. Jane Smith", 110000, LocalDate.of(2016, 6, 15), 8);
        department[2] = new Professor("Prof. Alan Turing", 115000, LocalDate.of(2014, 7, 10), 15);
        department[3] = new Secretary("Sec. Alice", 50000, LocalDate.of(2018, 3, 25), 200);
        department[4] = new Secretary("Sec. Bob", 45000, LocalDate.of(2019, 4, 30), 180);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to see the sum of all salaries in the department? (Y/N)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("Y")) {
            double totalSalary = 0;
            for (DeptEmployee emp : department) {
                totalSalary += emp.computeSalary();
            }
            System.out.println("Total Salary of all department employees: " + totalSalary);
        }
        scanner.close();
    }
}
