import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCaseTest {

    TestResult result;

    @BeforeEach
    void setUp() {
        result = new TestResult();
    }

    @Test
    public void testTemplateMethod() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        WasRun test = new WasRun("testMethod");
        test.run(result);
        assert("setUp testMethod tearDown ".equals(test.log));
    }

    @Test
    public void testResult() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        WasRun test = new WasRun("testMethod");
        test.run(result);
        assert ("1 run, 0 failed".equals(result.summary()));
    }

    @Test
    public void testFailedResult() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        WasRun test = new WasRun("testBrokenMethod");
        test.run(result);
        assert ("1 run, 1 failed".equals(result.summary()));
    }

    @Test
    void testFailedResultFormatting() {
        result.testStarted();
        result.testFailed();
        assert ("1 run, 1 failed".equals(result.summary()));
    }

    @Test
    void testSuite() {
        TestSuite suite = new TestSuite();
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testBrokenMethod"));
        suite.run(result);
        assert ("2 run, 1 failed".equals(result.summary()));
    }
}
