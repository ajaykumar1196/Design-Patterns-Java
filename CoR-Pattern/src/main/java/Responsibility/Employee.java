package Responsibility;

public abstract class Employee {
    private Employee supervisor;

    public Employee setSupervisor(Employee employee) {
        this.supervisor = employee;
        return employee;
    }

    public abstract boolean approveFunds(Double amount);

    public boolean sendToSupervisor(Double amount) {
        if (supervisor == null) {
            System.out.println("Not Approved!");
            return false;
        }
        return supervisor.approveFunds(amount);
    }

}
