import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Product tv = new Product();
        Product phone = new Product();
        System.out.println("Enter product data: " );
        System.out.println("Name: " );
        tv.productName = input.next();
        System.out.println("Price: " );
        tv.price = input.nextDouble();
        System.out.println("Quantity in Stock: " );
        tv.quantity = input.nextInt();

        System.out.println("Product data: " + tv.productName+ ", $" + tv.price + ", " + tv.quantity + " Units: " + ", Total:  $" + tv.totalValueInStock());
        System.out.println("Product data: " + tv.toString()+ ", $" + tv.price + ", " + tv.quantity + " Units: " + ", Total:  $" + tv.totalValueInStock());


        System.out.println("Enter the number of products to be added in stock:");
        int newQty = input.nextInt();
        tv.addProducts(newQty);
        System.out.println("Product data: " + tv.productName+ ", $" + tv.price + ", " + tv.quantity + " Units: " + ", Total: $" + tv.totalValueInStock());

        System.out.println("Enter the number of products to be removed from stock:");
        int removeQty = input.nextInt();
        tv.removeProducts(removeQty);


        System.out.println("Product data: " + tv.productName+ ", $" + tv.price + ", " + tv.quantity + " Units: " + ", Total: $" + tv.totalValueInStock());

    }


}