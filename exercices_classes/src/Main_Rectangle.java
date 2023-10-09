import java.util.Scanner;

public class Main_Rectangle {
    public static void main(String[] args) {
        System.out.println("Enter rectangle width and height:");
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        rect.width = input.nextDouble();
        rect.height = input.nextDouble();
        double area = rect.area();
        double perimeter = rect.perimeter();
        double diagonal = rect.diagonal();

        System.out.println("AREA: " + area);
        System.out.println("PERIMETER: " + perimeter);
        System.out.println("DIAGONAL: " + diagonal);


    }
}