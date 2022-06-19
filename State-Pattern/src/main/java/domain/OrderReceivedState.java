package domain;

public class OrderReceivedState implements OrderState {
    @Override
    public void next(Context context) {
        System.out.println("This package is already received by a client.");
    }

    @Override
    public void prev(Context context) {
        context.setCurrentOrderState(new OrderDeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("This package is already received by a client.");
    }
}
