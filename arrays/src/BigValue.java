import java.util.Scanner;

public class BigValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = scanner.nextInt();
        }

        int bigInt =numbers[0];
        int bigIndex = 0;
        for (int i = 0; i < numbers.length; i++) {

                if (numbers[i] > bigInt ) {
                    bigInt = numbers[i];
                    bigIndex = i;
                }

        }

        System.out.println("Maior numero : " + bigInt);
        System.out.println("Posicao do maior numero : " + bigIndex);

    }
}
