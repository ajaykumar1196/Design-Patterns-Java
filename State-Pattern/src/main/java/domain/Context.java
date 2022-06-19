package domain;

public class Context {

    private OrderState currentOrderState;

    public Context() {
        this.currentOrderState = new OrderCreatedState();
    }

    public void nextState(){
        currentOrderState.next(this);
    }

    public void prevState(){
        currentOrderState.prev(this);
    }

    public void printCurrentStatus() {
        currentOrderState.printStatus();
    }

    public OrderState getCurrentOrderState() {
        return currentOrderState;
    }

    public void setCurrentOrderState(OrderState currentOrderState) {
        this.currentOrderState = currentOrderState;
    }
}
