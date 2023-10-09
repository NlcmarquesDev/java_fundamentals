import java.util.Scanner;

public class output {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um numero pf.");
        int x =  input.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        while(x != 4) {
            while (x <= 0 || x > 4) {
                System.out.println("Código errado , pf insira um novo digito");
                x = input.nextInt();
            }
            if(x == 1){
                alcool++;
            }
            if(x == 2){
                gasolina++;
            }
            if(x == 3){
                diesel++;
            }
            x = input.nextInt();

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("ALCOOL: " + alcool);
        System.out.println("GAsolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}
