package Task_7;

public class Main {
    static void main(String[] args) {
        OnlineOrder onlineOrder = new OnlineOrder(1L,100.5,OrderStatus.PAID,"Ingress Academy");
        StoreOrder storeOrder = new StoreOrder(1L,100.5,OrderStatus.PAID,"Araz");

        onlineOrder.process();
        storeOrder.process();
    }
}
