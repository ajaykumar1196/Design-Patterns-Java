import java.util.Arrays;
import java.util.List;

public enum Singleton {
    INSTANCE;

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public List<String> getNames() {
        return Arrays.asList("Jane", "Joe");
    }
}
