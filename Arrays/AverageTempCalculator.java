import java.util.Scanner;

public class AverageTempCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collecting the number of days for the array from the user.
        System.out.println("Please enter the number of days you would like to calculate: ");
        int numDays = scanner.nextInt();

        // Initialize array, collect temperatures for each day, adding them to sum variable.
        double[] temps = new double[numDays];
        double sum = 0;

        for (int i = 0; i < numDays; i++) {
            System.out.println("Please enter the temperature for day " + (i + 1) + ": ");
            temps[i] = scanner.nextDouble();
            sum += temps[i];
        }

        // Simple average calculation & displaying the number of days above the calculated average
        double average = sum / numDays;
        System.out.printf("Average temperature for %d days: %.2f\n", numDays, average);

        int daysAboveAverage = 0;

        for (int i = 0; i < numDays; i++) {
            if (temps[i] > average) {
                daysAboveAverage ++;
            }
        }

        System.out.println("Days above calculated average temperature: " + daysAboveAverage);
        scanner.close();
    }
}
