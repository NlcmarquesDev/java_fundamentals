import java.util.Scanner;

public class Main_converter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is the dollar price");
        Converter stock = new Converter();
        stock.dollarPrice = input.nextDouble();
        System.out.print("How many dollars will be bought");
        stock.buy = input.nextDouble();

        double convertion = stock.convertReal( stock.dollarPrice, stock.buy);
        System.out.print("Amount to be paid in reais = " + convertion);
    }
}
