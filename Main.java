import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. View Cart\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    cart.addItem(new Item(name, price));
                }
                case 2 -> {
                    System.out.print("Enter item name to remove: ");
                    String name = sc.nextLine();
                    cart.removeItem(name);
                }
                case 3 -> cart.viewCart();
                case 4 -> {
                    System.out.println("Checkout complete. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}
