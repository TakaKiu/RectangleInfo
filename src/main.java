import java.util.Scanner;

class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width;
        do {
            System.out.print("Enter the width of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid width: ");
                scanner.next();
            }
            width = scanner.nextDouble();
        } while (width <= 0);

        double height;
        do {
            System.out.print("Enter the height of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid height: ");
                scanner.next();
            }
            height = scanner.nextDouble();
        } while (height <= 0);

        double area = width * height;

        double perimeter = 2 * (width + height);

        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);
    }
}