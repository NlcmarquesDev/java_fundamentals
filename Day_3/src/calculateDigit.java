import java.util.Scanner;

public class calculateDigit {
    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.println("Digite um numero : ");
        int num = digit.nextInt();

        if(num >= 0 && num <= 9 )
            System.out.println("o seu numero tem  1 digito");
        else if(num >= 10 && num <= 99)
            System.out.println("o seu numero tem 2 digito");
        else if(num >= 100 && num <= 999)
            System.out.println("o seu numero tem 3 digito" );
        else if(num >= 1000 && num <= 9999)
            System.out.println("o seu numero tem 4 digito");
        else
            System.out.println("o seu numero tem  5 ou mais numeros");

//        if(num.length <=1 )
//            System.out.println("o seu numero tem :" + num.length);
//        else if(num.length == 2)
//            System.out.println("o seu numero tem :" + num.length);
//        else if(num.length == 3)
//            System.out.println("o seu numero tem :" + num.length);
//        else if(num.length == 4)
//            System.out.println("o seu numero tem :" + num.length);
//        else
//            System.out.println("o seu numero tem  5 ou mais numeros");
    }
}
