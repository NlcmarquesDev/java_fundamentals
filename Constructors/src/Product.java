public class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.productName = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }


    public double totalValueInStock(){
        return  quantity * price;
    };

    public int addProducts(int qty){
        return this.quantity += qty;
    };
    public int removeProducts(int qty){
        return this.quantity -= qty;
    };

}
