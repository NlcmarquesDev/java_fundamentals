import java.util.*;

public class calculater {
    public static void main(String[] args) {
        System.out.println("Digite o numero 1 o operador e o numero 2");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        String op = input.next();
        int num2 = input.nextInt();

        if(op.equals( "+")){
            sum(num1, num2);
        } else if (op.equals( "-")) {
            minus(num1, num2);
        } else if (op.equals( "*")) {
            multi(num1, num2);
        } else if (op.equals( "/")) {
            divide(num1, num2);
        }else{
            System.out.println("Nao inseriu bem a operacao ");
        }


    }

   static void sum(int a, int b){
        System.out.println( a + b);
    }
    static void multi(int a, int b){
        System.out.println( a * b);
    }
    static void minus(int a, int b){
        System.out.println( a - b);
    }
    static void divide(int a, int b){
        System.out.println( a / b);
    }
}
