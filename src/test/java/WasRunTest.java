import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

public class WasRunTest {

    @Test
    public void wasRun() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        WasRun test = new WasRun("testMethod");
        System.out.println(test.wasRun);
        test.run();
        System.out.println(test.wasRun);
    }
}
