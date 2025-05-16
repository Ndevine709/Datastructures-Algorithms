import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Seating seating = new Seating(6, 6);
        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;
        int row;
        int col;

        do {
            System.out.println("-- Cineplex Booking System --");
            System.out.println("1. Reserve Your Seat");
            System.out.println("2. Cancel Your Seat");
            System.out.println("3. Display Seating Chart");
            System.out.println("4. Exit Program");
            System.out.println("Please enter your choice: ");
            
            try {
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Please enter the row number for the seat you would like to reserve: ");
                    row = scanner.nextInt();
                    System.out.println("Please enter the column number for the seat you would like to reserve: ");
                    col = scanner.nextInt();
                    seating.reserveSeat(row, col);
                    break;

                case 2:
                    System.out.println("Please enter the row number for the seat you would like to cancel: ");
                    row = scanner.nextInt();
                    System.out.println("Please enter the column number for the seat you would like to cancel: ");
                    col = scanner.nextInt();
                    seating.cancelSeat(row, col);
                    break;
                case 3:
                    seating.displaySeatingChart();
                    break;
                case 4:
                    System.out.println("Exiting program, have a good day!");
                    break;
                default:
                    System.out.println("Invalid choice, please enter a number between 1 - 4.");    

            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, your choice MUST be a valid integer");
            scanner.nextLine();
        }

        } while (userChoice != 4);
        scanner.close();
    }
}
