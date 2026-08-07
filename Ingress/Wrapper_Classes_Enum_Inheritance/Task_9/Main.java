package Task_9;

public class Main {
    static void main(String[] args) {
        Product phone = new ElectronicProduct("Samsung S26 Ultra",4000.0,8,ProductCategory.ELECTRONICS);
        Product jacket = new ClothingProduct("Prado",200.0,40,ProductCategory.CLOTHING);
        Product apple = new FoodProduct("Apple",2.5,800,ProductCategory.FOOD);

        System.out.println(phone.name+" Final Price: "+ phone.calculateFinalPrice());
        System.out.println(jacket.name+" Final Price: "+ jacket.calculateFinalPrice());
        System.out.println(apple.name+" Final Price: "+ apple.calculateFinalPrice());

        jacket.buy(30);
        jacket.buy(10);
    }
}
