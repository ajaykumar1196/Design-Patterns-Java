package domain;

public class OrderDeliveredState implements OrderState {
    @Override
    public void next(Context context) {
        context.setCurrentOrderState(new OrderReceivedState());
    }

    @Override
    public void prev(Context context) {
        context.setCurrentOrderState(new OrderCreatedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }
}
