import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCaseTest {
    @Test
    public void testRunning() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        WasRun test = new WasRun("testMethod");
        test.run();
        assertTrue(test.wasRun);
    }

    @Test
    public void testSetUp() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        WasRun test = new WasRun("testMethod");
        test.run();
        assertTrue(test.wasSetUp);
    }
}
