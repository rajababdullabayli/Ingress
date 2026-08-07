package Task_7;

public class Order {
    protected Long id;
    protected Double amount;
    protected OrderStatus status;

    public Order(Long id, Double amount, OrderStatus status) {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }

    public void process(){
        System.out.println("Order is processing.");
    }
}
