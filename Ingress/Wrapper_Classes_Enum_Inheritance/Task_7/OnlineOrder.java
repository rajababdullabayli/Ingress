package Task_7;

public class OnlineOrder extends Order {
    private String deliveryAddress;

    public OnlineOrder(Long id, Double amount, OrderStatus status, String deliveryAddress) {
        super(id, amount, status);
        this.deliveryAddress = deliveryAddress;
    }

    public void process() {
        switch (status) {
            case CREATED:
                System.out.println("Online Order " + id + " created. Make the payment.");
                break;
            case PAID:
                System.out.println("Online Order " + id + " paid " + "Sending to the" + deliveryAddress);
                break;
            case CANCELLED:
                System.out.println("Online order " + id +" Cancelled ");
                break;
            case COMPLETED:
                System.out.println("Online order " + id + " "+ deliveryAddress+ "delivered to address");
                break;
        }
    }
}
