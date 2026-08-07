package Task_7;

public class StoreOrder extends Order{
    private String storeName;

    public StoreOrder(Long id, Double amount, OrderStatus status, String storeName) {
        super(id, amount, status);
        this.storeName = storeName;
    }

    public void process() {
        switch (status) {
            case CREATED:
                System.out.println("Store Order " + id + " created. "+storeName+ "Making this Store");
                break;
            case PAID:
                System.out.println("Store Order " + id + " paid ");
                break;
            case CANCELLED:
                System.out.println("Store order " + id +" cancelled ");
                break;
            case COMPLETED:
                System.out.println("Store order " + id + "completed");
                break;
        }
    }
}
