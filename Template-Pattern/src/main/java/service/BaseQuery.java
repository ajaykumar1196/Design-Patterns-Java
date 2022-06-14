package service;

public abstract class BaseQuery {

    // Template method
    public final void execute() {
        openConnection();
        query();
        closeConnection();
    }

    // Open DB connection
    // Can be public also if we want to override
    private void openConnection() {
        System.out.println("Opened DB connection");
    }

    // Open DB connection
    public abstract void query();

    // Close DB connection
    // Can be public also if we want to override
    private void closeConnection() {
        System.out.println("Closed DB connection");
    }

}
