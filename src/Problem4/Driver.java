package Problem4;

public class Driver {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new CommissionEmployee("John", "Doe", "111-11-1111", 5000, 0.06);
        employees[1] = new HourlyEmployee("Jane", "Smith", "222-22-2222", 20, 40);
        employees[2] = new SalariedEmployee("Jim", "Brown", "333-33-3333", 800);
        employees[3] = new BasePlusCommissionEmployee("Jack", "White", "444-44-4444", 4000, 0.04, 300);
        employees[4] = new SalariedEmployee("Jill", "Green", "555-55-5555", 900);

        double totalSalaries = 0;

        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Payment: " + employee.getPayment());
            totalSalaries += employee.getPayment();
        }

        System.out.println("Total Salaries of all employees: " + totalSalaries);
    }
}
