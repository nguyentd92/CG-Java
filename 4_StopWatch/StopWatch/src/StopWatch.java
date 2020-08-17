public class StopWatch {
    long startTime, endTime;

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StopWatch() {
    }

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
    }

    public void showTime() {
        long time = endTime - startTime;
        System.out.printf("Time: %f", (double)time / 1000000000);
    }
}
