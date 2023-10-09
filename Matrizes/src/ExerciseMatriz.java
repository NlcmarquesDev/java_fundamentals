import java.util.Scanner;

public class ExerciseMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o numero de linhas");
        int m = scanner.nextInt();
        System.out.println("Selecione o numero de Colunas");
        int n = scanner.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            System.out.println("Insira os numeros para a linha " + (i+1));
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Selecione o numero que quer encontrar");
        int find = scanner.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if( mat[i][j] == find ) {

                    System.out.println("Position " + i +"," + j + ":");
                    if(  j > 0) {
                        System.out.println("Left: " + (mat[i])[j-1]);
                    }
                    if( j < mat[i].length -1) {
                        System.out.println("Right: " + (mat[i])[j+1]);
                    }
                    if( i < mat.length -1 ) {
                        System.out.println("Down: " + (mat[i+1])[j]);
                    }
                    if( i > 0   ) {
                        System.out.println("Up: " + (mat[i-1])[j]);
                    }
                }
            }
        }
    }
}
