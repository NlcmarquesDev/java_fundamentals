public class Product {
    public String productName;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return  quantity * price;
    };

    public int addProducts(int qty){
        return this.quantity += qty;
    };
    public int removeProducts(int qty){
        return this.quantity -= qty;
    };
    public String toString(){
        return productName;
    }

}
