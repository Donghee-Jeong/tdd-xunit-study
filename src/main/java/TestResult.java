public class TestResult {
    private int runCount;

    public TestResult() {
        this.runCount = 0;
    }

    public void testStarted() {
        this.runCount++;
    }

    public String summary() {
        return String.format("%d run, 0 failed", runCount);
    }
}
