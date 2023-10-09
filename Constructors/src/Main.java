import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the account number: " );
        int accountNumber = input.nextInt();
        System.out.println("Enter account holder: " );
        String nameAccount = input.next();
        Conta user1 = new Conta(accountNumber, nameAccount);
        System.out.print("Is there a initial deposit (y/n)? " );
        String deposit = input.next();


        if( deposit.equals("y") ){
            System.out.print("Enter initial deposit value: " );
            double amount = input.nextDouble();
             user1.balance(amount);
            System.out.print("Account data: " );
            System.out.println("Account: " + user1.getAccountNumber()+ ", Holder " + user1.getNameAccount() + ", Balance $ " + user1.getAmount());
        }else if(deposit.equals("n") ){
            System.out.print("Account data: " );
            System.out.println("Account: " + user1.getAccountNumber()+ ", Holder " + user1.getNameAccount() + ", Balance $ " + user1.getAmount());
        }else{
            System.out.print("Letter incorrect, please insert  (y/n) for a initial deposit? " );
            deposit = input.next();
        }

        System.out.print("Enter a deposit value: " );
        double newAmount = input.nextDouble();
        user1.balance(newAmount);
        System.out.print("Updated Account data: " );
        System.out.println("Account: " + user1.getAccountNumber()+ ", Holder " + user1.getNameAccount() + ", Balance $ " + user1.getAmount());

        System.out.print("Enter a withdraw value: " );
        double withdraw = input.nextDouble();
        user1.withdraw(withdraw);

        System.out.print("Updated Account data: " );
        System.out.println("Account: " + user1.getAccountNumber()+ ", Holder" + user1.getNameAccount() + ", Balance $ " + user1.getAmount());



//
//        System.out.println("Enter the number of products to be added in stock:");
//        int newQty = input.nextInt();
//        tv.addProducts(newQty);
//        System.out.println("Product data: " + tv.getProductName()+ ", $" + tv.getPrice() + ", " + tv.getQuantity() + " Units: " + ", Total: $" + tv.totalValueInStock());
//
//        System.out.println("Enter the number of products to be removed from stock:");
//        int removeQty = input.nextInt();
//        tv.removeProducts(removeQty);
//
//
//        System.out.println("Product data: " + tv.getProductName()+ ", $" + tv.getPrice() + ", " + tv.getQuantity() + " Units: " + ", Total: $" + tv.totalValueInStock());
    }
}