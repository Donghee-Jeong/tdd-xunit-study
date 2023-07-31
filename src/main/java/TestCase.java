import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
    public String name;

    public TestCase(String name) {
        this.name = name;
    }

    public void run() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method declaredMethod = WasRun.class.getDeclaredMethod(name);
        declaredMethod.invoke(this);
    }
}
