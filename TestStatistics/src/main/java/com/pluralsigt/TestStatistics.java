package com.pluralsigt;
import java.util.Arrays;
public class TestStatistics {

    public static void main(String args[]) {

        int[] testScores = {27, 22, 35, 48, 56, 64, 77, 81, 92, 19};

        double average = calculateAverage(testScores);

        Arrays.sort(testScores);
        int highestScore = testScores[testScores.length - 1];
        int lowestScore = testScores[0];

        System.out.println("The average is: " + average + "\nHigh score: " + highestScore + "\nLow Score: " + lowestScore);
    }
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
