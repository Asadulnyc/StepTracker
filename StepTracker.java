public class StepTracker {
    private int minimum;
    private int days;
    private int active;
    private int totalSteps;

    public StepTracker(int days) {
        minimum = days;
    }

    public void addDailySteps(int steps) {
        days++;
        if (steps>minimum) active++;
        totalSteps += steps;
    }

    public int activeDays() {
        return active;
    }

    public double averageSteps() {
        if (totalSteps==0) return 0.0;

        return (double) totalSteps/days;
    }
}