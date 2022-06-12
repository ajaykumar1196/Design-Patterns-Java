package Responsibility;

public class Lead extends Employee {

    @Override
    public boolean approveFunds(Double amount) {
        if (amount < 10_000) {
            System.out.println("Approved by Lead!");
            return true;
        }
        return sendToSupervisor(amount);
    }
}
