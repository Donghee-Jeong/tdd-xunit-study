import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCaseTest {

    @Test
    public void testTemplateMethod() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        WasRun test = new WasRun("testMethod");
        test.run();
        assert("setUp testMethod tearDown ".equals(test.log));
    }

    @Test
    public void testResult() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        WasRun test = new WasRun("testMethod");
        TestResult result = test.run();
        assert ("1 run, 0 failed".equals(result.summary()));
    }

    @Test
    public void testFailedResult() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        WasRun test = new WasRun("testBrokenMethod");
        TestResult result = test.run();
        assert ("1 run, 1 failed".equals(result.summary()));
    }

    @Test
    void testFailedResultFormatting() {
        TestResult result = new TestResult();
        result.testStarted();
        result.testFailed();
        assert ("1 run, 1failed".equals(result.summary()));
    }
}
