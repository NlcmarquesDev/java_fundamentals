import java.util.Scanner;

public class exercice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a number?");
        int num = input.nextInt();
        if (num % 2 == 0) {
            if (num >= 2 && num <= 5) {
                System.out.println("A");
            } else if (num >= 6 && num <= 20) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }

        } else{
            System.out.println("Impar");
        }
    }
}
