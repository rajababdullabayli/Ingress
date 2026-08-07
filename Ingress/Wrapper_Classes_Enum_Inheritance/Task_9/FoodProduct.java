package Task_9;

public class FoodProduct extends Product {
    public FoodProduct(String name, Double price, Integer stock, ProductCategory category) {
        super(name, price, stock, category);
    }

    @Override
    public Double calculateFinalPrice() {
        Double taxPrices = price + price*0.08;
        return taxPrices ;
    }
}
