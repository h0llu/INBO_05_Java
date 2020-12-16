package Task2;

public final class TablesOrderManager {
    private Order[] orders;
    private int size;

    public TablesOrderManager() {
        size = 0;
    }

    public Order[] getOrders() {
        return orders;
    }

    public int getSize() {
        return size;
    }

    public void add(Order order) {
        Order[] newOrders = new Order[size + 1];
        for (int i = 0; i < size; i++) {
            newOrders[i] = orders[i];
        }
        newOrders[size++] = order;
        orders = newOrders;
    }
}