package Responsibility;

public class Manager extends Employee {

    @Override
    public boolean approveFunds(Double amount) {
        if (amount < 500_000) {
            System.out.println("Approved by Manager!");
            return true;
        }
        return sendToSupervisor(amount);
    }
}
