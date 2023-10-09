// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class calc {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);


        if(args[0].equals("sum")) {
            sum(x,y);
        } else if (args[0].equals("minus")){
            minus( x,y);
        }else if(args[0].equals("multiplicate")){
            multiplicate(x,y);
        }else if(args[0].equals("divide")){
            divide(x,y);
        }else{
            System.out.println("You didin't insert the calculate form! ");
        }


    }

    static void sum(int a, int b){
        System.out.println( a +b );
    }
    static void minus(int a, int b){
        System.out.println( a - b );
    }
    static void multiplicate(int a, int b){
        System.out.println( a  * b );

    }
    static void divide (int a, int b){
        System.out.println( a / b );

    }


}