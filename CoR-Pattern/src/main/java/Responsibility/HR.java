package Responsibility;

public class HR extends Employee {

    @Override
    public boolean approveFunds(Double amount) {
        if (amount < 2_000_000) {
            System.out.println("Approved by HR!");
            return true;
        }
        return sendToSupervisor(amount);
    }
}
