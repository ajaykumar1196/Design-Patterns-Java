import domain.Context;
import domain.OrderState;

public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();
        OrderState state1 = context.getCurrentOrderState();
        state1.printStatus();

        context.nextState();
        OrderState state2 = context.getCurrentOrderState();
        state2.printStatus();

        context.nextState();
        OrderState state3 = context.getCurrentOrderState();
        state3.printStatus();
    }
}
