import Responsibility.Employee;
import Responsibility.HR;
import Responsibility.Lead;
import Responsibility.Manager;

public class CoRDemo {
    public static void main(String[] args) {
        Employee hr = new HR();
        Employee manager = new Manager();
        Employee lead = new Lead();

        lead.setSupervisor(manager).setSupervisor(hr);

        lead.approveFunds(5_000.00);
        lead.approveFunds( 10_000.00);
        lead.approveFunds(1_000_000.00);
        lead.approveFunds( 3_000_000.00);

    }
}
