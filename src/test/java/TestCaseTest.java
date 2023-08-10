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
}
