import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Store store;
    private Admin admin;
    private Scanner scanner;

    public Menu(Store store) {
        this.store = store;
        this.admin = new Admin();
        this.scanner = new Scanner(System.in);
    }

    public void displayMainMenu() {
        boolean running = true;

        while (running) {
            System.out.println("\n-- Admin Menu --");
            System.out.println("1. Create Customer Account");
            System.out.println("2. Remove Customer Account");
            System.out.println("3. Add Product to Inventory");
            System.out.println("4. Remove Product from Inventory");
            System.out.println("5. Restock Product in Inventory");
            System.out.println("6. Show Product Inventory");
            System.out.println("7. Show Customer List");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer

                switch (choice) {
                    case 1:
                        createCustomerAccount();
                        break;
                    case 2:
                        removeCustomerAccount();
                        break;
                    case 3:
                        addProductToInventory();
                        break;
                    case 4:
                        removeProductFromInventory();
                        break;
                    case 5:
                        restockProductInInventory();
                        break;
                    case 6:
                        showInventory();
                        break;
                    case 7:
                        showCustomerList();
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        running = false; // Exit the loop and terminate the program
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        scanner.close();
    }

    private void createCustomerAccount() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        admin.createCustomerAccount(name, store);
    }

    private void removeCustomerAccount() {
        System.out.print("Enter customer name to remove: ");
        String name = scanner.nextLine();
        admin.removeCustomerAccount(name, store);
    }

    private void addProductToInventory() {
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        admin.addProductToInventory(productName, quantity, store);
    }

    private void removeProductFromInventory() {
        System.out.print("Enter product name to remove: ");
        String productName = scanner.nextLine();
        admin.removeProductFromInventory(productName, store);
    }

    private void restockProductInInventory() {
        System.out.print("Enter product name to restock: ");
        String productName = scanner.nextLine();
        System.out.print("Enter quantity to add: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        admin.restockProductInInventory(productName, quantity, store);
    }

    private void showInventory() {
        store.showInventory();
    }

    private void showCustomerList() {
        admin.showCustomers(store);
    }
}
