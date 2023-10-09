import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas e colunas voce quer definir?");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];


        for (int col = 0; col < n; col++){
            for (int row = 0; row < n; row++){
                matriz[row][col] = scanner.nextInt();
            }
        }
        System.out.println("Main Diagonal:");
        for (int i = 0; i < n; i++){
            System.out.print(matriz[i][i] + " ");
        }

        int counter = 0;
        for (int col = 0; col < n; col++){
            for (int row = 0; row < n; row++){
                if(matriz[row][col] < 0){
                    counter++;
                }
            }
        }
        System.out.println("Quantos numeroe negativos:" + counter);
    }
}