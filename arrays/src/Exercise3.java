import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        double[] numbers = new double[n];

        for (int i= 0; i <n ; i++) {
            System.out.println("Digite um numero:");
            numbers[i] = scanner.nextDouble();
        }

        double sum = 0;

        for (int i=0; i <numbers.length ; i++) {
            sum += numbers[i];
        }


        System.out.println("VALORES = " + numbers.toString());
        System.out.println("SOMA = " + sum);
        System.out.println("MEDIA = " + sum/numbers.length);
    }
}
