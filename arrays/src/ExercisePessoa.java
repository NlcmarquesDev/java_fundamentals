import java.util.Scanner;

public class ExercisePessoa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas");
        int n = scanner.nextInt();

        Pessoa[] pessoa = new Pessoa[n];

        for(int i=0; i< n; i++){
            System.out.println("Dados da "+ i+1  +"a pessoa:");
            System.out.print("Nome");
            String nome = scanner.next();
            System.out.print("Idade:");
            int age = scanner.nextInt();
            System.out.print("Altura:");
            double height = scanner.nextDouble();

            pessoa[i]= new Pessoa(nome, age, height);
        }

        //altura media das pessoas

        double totalHeight = 0;
        int less16 = 0;

        for (int i=0; i< pessoa.length; i++){
             totalHeight += pessoa[i].getHeight();

             if(pessoa[i].getAge() < 16){
                 less16++;
                 System.out.println(pessoa[i].getName());
             }
        }

        System.out.println("Altura média: " + totalHeight/pessoa.length);
        System.out.println("Pessoas com menos de 16 anos: " + (less16*100)/pessoa.length+ "%");


        // percentyagem de menores de 16 anos

        // apresnetar os nomes dessas pessoas <16 anos




    }



}
