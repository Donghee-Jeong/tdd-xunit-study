import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun extends TestCase {
    public boolean wasRun;

    public WasRun(String name) {
        super(name);
        this.wasRun = false;
    }

    public void testMethod() {
        this.wasRun = true;
    }
}