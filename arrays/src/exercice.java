import java.util.Scanner;

public class exercice {
    public static void main(String[] args) {
        System.out.println("Quantos produtos quer inserir?");
        Scanner input = new Scanner(System.in);
        int products = input.nextInt();


        Product[] product = new Product[products];

        for (int i = 0; i < products;i++) {
            System.out.println("Insira o nome e o preco do Produto number"+ (i+1)+  ":");
            String name  =  input.next();
            double price = input.nextDouble();
            product[i] = new Product(name, price);
        }

        double sum = 0;

        for(int j = 0; j < products; j++){
            sum += product[j].getPrice();
        }

        System.out.println("Average Price = " + sum/products);
    }
}
