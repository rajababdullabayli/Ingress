package Task_9;

public class Product {
    protected String name;
    protected Double price;
    protected Integer stock;
    protected ProductCategory category;

    public Product(String name, Double price, Integer stock, ProductCategory category) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public Double calculateFinalPrice() {
        return price;
    }

    public void buy(Integer quantity) {
        if (quantity > stock) {
            System.out.println("Error: There is not enough " + name + " in stock");
        } else {
            stock = stock - quantity;
            Double totalCost = calculateFinalPrice() * quantity;
            System.out.println("Success purchase: "+ quantity +" number " + " received. Total amount: "+totalCost+" Remaining Stock "+stock);
        }
    }
}
