package Problem1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle("Red", 3, 4);
        shapes[1] = new Circle("Blue", 5);
        shapes[2] = new Square("Green", 2);
        shapes[3] = new Rectangle("Yellow", 7, 8);

        printTotal(shapes);
    }

    public static void printTotal(Shape[] shapes) {
        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Total Area of all Shapes: " + totalArea);
        System.out.println("Total Perimeter of all Shapes: " + totalPerimeter);
    }

}
