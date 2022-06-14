import service.BaseQuery;
import service.InsertQuery;
import service.SelectQuery;

public class TemplateDemo {
    public static void main(String[] args) {
        BaseQuery insertQuery = new InsertQuery();
        insertQuery.execute();
        System.out.println("============================");
        BaseQuery selectQuery = new SelectQuery();
        selectQuery.execute();

    }
}
