import java.util.Scanner;

public class Oldeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas vove vai querer digitar?");
        int n = scanner.nextInt();
        String [] name = new String[n];
        int [] age = new int[n];

        for (int i =0 ; i < n ; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("NOME: ");
                name[i] = scanner.next();
                System.out.print("IDADE: ");
            age[i] = scanner.nextInt();
        }

        int bigAge = age[0];
        int indexAge = 0;

        for (int i = 0; i < age.length; i++) {
            if(age[i] > bigAge){
                bigAge = age[i];
                indexAge = i;
            }
        }

        System.out.println("Pessoa mais velha: " + name[indexAge]);
    }
}
