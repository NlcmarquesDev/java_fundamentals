public class Main {
    public static void main(String[] args) {
        productList("bananas", 2.39);
        productList("laranjas", 2.21);
    }
    public static void productList(String productName, double productValue){
        System.out.println(productName + " tem o valor de " + productValue);
    }
}