import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
    public String name;

    public TestCase(String name) {
        this.name = name;
    }

    public void run(TestResult result) {
        result.testStarted();
        setUp();
        try {
            Method declaredMethod = WasRun.class.getDeclaredMethod(name);
            declaredMethod.invoke(this);
        } catch (Exception e) {
            result.testFailed();
        }
        tearDown();
    }

    public void setUp() {

    }

    public void tearDown() {

    }
}
