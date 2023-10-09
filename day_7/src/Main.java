import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        System.out.println("Digite um numero");
        int input1 = num1.nextInt();


        Scanner num2 = new Scanner(System.in);
        System.out.println("Digite um numero");
        int input2 = num2.nextInt();

        Scanner num3 = new Scanner(System.in);
        System.out.println("Digite um numero");
        int input3 = num3.nextInt();
        System.out.println(input1 + " " + input2 + " " + input3 + " ");
    }
}