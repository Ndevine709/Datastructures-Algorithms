import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter(20);
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("--- Animal Shelter System ---");

        while (isRunning) {
            System.out.println("1. Enqueue a Dog");
            System.out.println("2. Enqueue a Cat");
            System.out.println("3. Dequeue Any");
            System.out.println("4. Dequeue a Dog");
            System.out.println("5. Dequeue a Cat");
            System.out.println("6. Exit Program");
            System.out.print("Please enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number: ");
                scanner.next();
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Please enter a dogs name: ");
                    String dogName = scanner.nextLine();
                    shelter.enqueue(new Dog(dogName));
                    System.out.println("Dog added: " + dogName);
                    break;
                case 2:
                    System.out.println("Please enter a cats name: ");
                    String catName = scanner.nextLine();
                    shelter.enqueue(new Cat(catName));
                    System.out.println("Cat added: " + catName);
                    break;
                case 3:
                    printResults("Dequeue Any", shelter.dequeueAny());
                    break;
                case 4:
                    printResults("Dequeue Dog", shelter.dequeueDog());
                    break;
                case 5:
                    printResults("Dequeue Cat", shelter.dequeueCat());
                    break;
                case 6:
                    isRunning = false;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }

    private static void printResults(String method, Animal animal) {
        if (animal == null) {
            System.out.println(method + ": No animal available");
        } else {
            System.out.println(method + ": " + animal.getName());
        }
    }
}
