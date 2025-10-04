package metrics;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class PerformanceTracker {
    private long comparisons = 0;
    private long assignments = 0;
    private long elapsedTime = 0;

    public void startTimer() {
        // ничего не делает, просто маркер
    }

    public void stopTimer(Instant start, Instant end) {
        elapsedTime = Duration.between(start, end).toNanos();
    }

    public void incrementComparisons() {
        comparisons++;
    }

    public void incrementAssignments() {
        assignments++;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void exportToCSV(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append("Comparisons,Assignments,ElapsedTime(ns)\n");
            writer.append(comparisons + "," + assignments + "," + elapsedTime + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
