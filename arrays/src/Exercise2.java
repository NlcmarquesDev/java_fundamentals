import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai querer digitar?");
        int n = scanner.nextInt();
        while(n > 10){
            System.out.println("Por favor digite outro numero?");
             n = scanner.nextInt();
        }
        int [] numbers = new int[n];
        for( int i = 0; i < n;i++){
            System.out.print("digite um numero:");
            numbers[i] = scanner.nextInt();
        }

        for(int i = 0; i < numbers.length; i++){
            if( numbers[i] < 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
