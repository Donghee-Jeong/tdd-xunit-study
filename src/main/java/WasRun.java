import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun extends TestCase {
    public boolean wasRun;
    public boolean wasSetUp;

    public WasRun(String name) {
        super(name);
        this.wasRun = false;
    }

    public void testMethod() {
        this.wasRun = true;
    }

    public void setUp() {
        this.wasRun = false;
        this.wasSetUp = true;
    }
}
