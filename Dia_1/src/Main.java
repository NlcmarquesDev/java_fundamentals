import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner firstNum =  new Scanner(System.in);
        System.out.println("Digite o primeiro numero?");
        double num1 = firstNum.nextDouble();
        Scanner secondNum =  new Scanner(System.in);
        System.out.println("Digite o segundo  numero?");
        double num2 = secondNum.nextDouble();
        double resultado = num1 + num2;
        System.out.println("o resultado é " + resultado);
    }
}
