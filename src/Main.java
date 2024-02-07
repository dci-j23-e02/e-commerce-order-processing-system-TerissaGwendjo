import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Display menu options
            System.out.println("Choose an option:");
            System.out.println("1. Add Product");
            System.out.println("2. Create Order");
            System.out.println("3. List Orders");
            System.out.println("4. Update Order Status");
            System.out.println("5. Exit");

            // Read user input
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    createOrder();
                    break;
                case 3:
                    listOrders();
                    break;
                case 4:
                    updateOrderStatus();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addProduct() {
        // Implement logic to add a product
        System.out.println("Adding a product...");
    }

    private static void createOrder() {
        // Implement logic to create an order
        System.out.println("Creating an order...");
    }

    private static void listOrders() {
        // Implement logic to list orders
        System.out.println("Listing orders...");
    }

    private static void updateOrderStatus() {
        // Implement logic to update order status
        System.out.println("Updating order status...");
    }
}

