package java_learning.lld.design_patterns.behavioral.state_pattern;

enum OrderStateType {
    PLACED,
    PREPARING,
    DELIVERY,
    CANCELLED,
    DELIVERED;

}

class OrderContext {
    private OrderState currentState;

    public OrderContext() {
        this.currentState = new OrderPlacedState();
        System.out.println("Your order is placed.");
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void next() {
        this.currentState.next(this);
    }

    public void cancel() {
        this.currentState.cancel(this);
    }

}

interface OrderState {

    void next(OrderContext context);

    void cancel(OrderContext context);

    String getName();

}

class OrderPlacedState implements OrderState {

    @Override
    public void next(OrderContext context) {
        context.setState(new PreparingState());
        System.out.println("Order is now being prepared");
    }

    @Override
    public void cancel(OrderContext context) {
        context.setState(new CancelledState());
        System.out.println("Order Has been cancelled!");
    }

    @Override
    public String getName() {
        return OrderStateType.PLACED.name();
    }

}

class PreparingState implements OrderState {

    @Override
    public void next(OrderContext context) {
        context.setState(new OutForDeliveryState());
        System.out.println("Order is now out for delivery.");
    }

    @Override
    public void cancel(OrderContext context) {
        context.setState(new CancelledState());
        System.out.println("Order Has been cancelled!");
    }

    @Override
    public String getName() {
        return OrderStateType.PREPARING.name();
    }

}

class OutForDeliveryState implements OrderState {

    @Override
    public void next(OrderContext context) {
        context.setState(new DeliveredState());
        System.out.println("Your order is delivered");
    }

    @Override
    public void cancel(OrderContext context) {
        context.setState(new CancelledState());
        System.out.println("Order Has been cancelled!");
    }

    @Override
    public String getName() {
        return OrderStateType.DELIVERY.name();
    }

}

class DeliveredState implements OrderState {

    @Override
    public void next(OrderContext context) {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Cannot cancelled a delivered order.");
    }

    @Override
    public String getName() {
        return OrderStateType.DELIVERED.name();
    }

}

class CancelledState implements OrderState {

    @Override
    public void next(OrderContext context) {
        System.out.println("Cancelled order cannot move to next state.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Order is already cancelled!");
    }

    @Override
    public String getName() {
        return OrderStateType.CANCELLED.name();
    }

}

public class OrderMain {

    public static void main(String[] args) {
        OrderContext order = new OrderContext();
        order.next();
        order.next();
        order.next();
        order.next();
        order.next();
        order.cancel();
        order.next();
    }

}
