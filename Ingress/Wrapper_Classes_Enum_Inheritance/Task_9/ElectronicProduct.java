package Task_9;

public class ElectronicProduct extends Product{
    public ElectronicProduct(String name, Double price, Integer stock, ProductCategory category) {
        super(name, price, stock, category);
    }

    @Override
    public Double calculateFinalPrice() {
        Double taxPrices = price + price*0.18;
        return taxPrices ;
    }
}
