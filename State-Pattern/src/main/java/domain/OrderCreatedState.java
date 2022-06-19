package domain;

public class OrderCreatedState implements OrderState {
    @Override
    public void next(Context context) {
        context.setCurrentOrderState(new OrderDeliveredState());
    }

    @Override
    public void prev(Context context) {
        System.out.println("The package is in its root state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}
