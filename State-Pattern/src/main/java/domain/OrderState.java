package domain;

public interface OrderState {
    void next(Context context);
    void prev(Context context);
    void printStatus();
}
