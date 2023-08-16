import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun extends TestCase {
    public boolean wasRun;
    public boolean wasSetUp;
    public String log;

    public WasRun(String name) {
        super(name);
        this.wasRun = false;
        this.log = "setUp ";
    }

    public void testMethod() {
        this.wasRun = true;
        this.log += "testMethod ";
    }

    public void testBrokenMethod() throws Exception {
        throw new Exception();
    }

    @Override
    public void setUp() {
        this.wasRun = false;
        this.wasSetUp = true;
    }

    @Override
    public void tearDown() {
        this.log += "tearDown ";
    }
}
