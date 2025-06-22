package UndoRedo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UndoRedo<String> history = new UndoRedo<String>();
        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("Undo/Redo Assignment");

        do {
            System.out.println("1. Add to list");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. See current state");
            System.out.println("5. See latest state");
            System.out.println("6. Exit program");
            System.out.println("Make your choice: ");
            choice = scanner.nextLine();
            System.out.println();

            switch (choice) {
                case "1":
                    System.out.println();
                    System.out.println("Please enter an item: ");
                    String item = scanner.nextLine();
                    history.addState(item);
                    System.out.println();
                    System.out.println("Item added");
                    break;

                case "2":
                    history.undo();
                    System.out.println();
                    break;

                case "3":
                    history.redo();
                    System.out.println();
                    break;

                case "4":
                    System.out.println(history.getCurrentState());
                    System.out.println();
                    break;

                case "5":
                    System.out.println(history.getLatestState());
                    System.out.println();
                    break;

                case "6":
                    System.out.println();
                    System.out.println("Exiting program...");
                    break;
            
                default:
                    System.out.println("Invalid choice");
                    System.out.println();
                    break;
            }
        } while (!choice.equals("6"));
        scanner.close();
    }
}
