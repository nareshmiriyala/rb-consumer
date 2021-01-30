package au.com.dellnaresh.rbconsumer.domain

class Order {
    String orderId
    String name

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
