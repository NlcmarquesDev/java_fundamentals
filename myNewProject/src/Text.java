import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = input.nextDouble();
        x.b  = input.nextDouble();
        x.c = input.nextDouble();

        System.out.println("Enter the measures of triangle y:");
        y.a  = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

       double triangle1 = x.area();
       double triangle2 = y.area();

        System.out.println("Triangle X: " + triangle1);
        System.out.println("Triangle Y: " + triangle2);

        String biggest = (triangle1 > triangle2)? "X" : "Y";
        System.out.println("Larger area: " + biggest);

    }
}
