public class Clients {
   String name;
   int age;
   int balance;

    Clients(){
        balance = 10;
    }

    void  newAccount(  ) {
        System.out.println( name + " Account Created!");
        System.out.println("New Balance is "+ balance +" euros");
//        double saldo = 10.0 ;
    };
}
