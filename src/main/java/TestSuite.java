import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    private List<TestCase> tests;

    public TestSuite() {
        this.tests = new ArrayList<>();
    }

    public void add(TestCase test) {
        this.tests.add(test);
    }

    public void run(TestResult result) {
        for (TestCase test : tests) {
            test.run(result);
        }
    }
}
