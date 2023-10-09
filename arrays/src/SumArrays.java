import java.util.Scanner;

public class SumArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto valores vai ter cada valor?");
        int n = scanner.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];

        System.out.println("Digite os valores do Array A:");
        for (int i= 0; i< n; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Digite os valores do Array B:");
        for (int i= 0; i< n; i++) {
            arr2[i] = scanner.nextInt();
        }

        System.out.println("Array Soma resultados:");
        for (int i= 0; i< arr1.length; i++) {
            System.out.println(arr1[i]+ arr2[i]);
        }
    }
}
