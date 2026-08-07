package Task_9;

public class ClothingProduct extends Product{
    public ClothingProduct(String name, Double price, Integer stock, ProductCategory category) {
        super(name, price, stock, category);
    }

    @Override
    public Double calculateFinalPrice() {
        Double disCountedPrice = price - price*0.1;
        Double taxPrice = disCountedPrice + disCountedPrice*0.18;
        return taxPrice;
    }
}
