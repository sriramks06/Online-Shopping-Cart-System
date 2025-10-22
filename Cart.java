import java.util.*;

public class Cart {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.name + " added to cart.");
    }

    public void removeItem(String name) {
        for (Item i : items) {
            if (i.name.equalsIgnoreCase(name)) {
                items.remove(i);
                System.out.println(name + " removed from cart.");
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }
        System.out.println("\n--- CART CONTENTS ---");
        double total = 0;
        for (Item i : items) {
            System.out.println(i.name + " - ₹" + i.price);
            total += i.price;
        }
        System.out.println("Total: ₹" + total);
    }
}
