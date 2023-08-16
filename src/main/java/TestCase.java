import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
    public String name;

    public TestCase(String name) {
        this.name = name;
    }

    public TestResult run() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        TestResult result = new TestResult();
        result.testStarted();
        setUp();
        Method declaredMethod = WasRun.class.getDeclaredMethod(name);
        declaredMethod.invoke(this);
        tearDown();
        return result;
    }

    public void setUp() {

    }

    public void tearDown() {

    }
}
