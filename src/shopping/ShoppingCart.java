package shopping;

import java.util.ArrayList;

public class ShoppingCart {
    // List of item orders in the shopping cart
    private ArrayList<ItemOrder> orders;

    // Indicates whether discount is applied
    private boolean discount;

    /**
     * Constructs an empty shopping.ShoppingCart.
     */
    public ShoppingCart() {
        orders = new ArrayList<ItemOrder>();
        discount = false;
    }

    /**
     * Adds an shopping.ItemOrder to the cart.
     * If an order for the same item already exists, it is replaced.
     * @param order the shopping.ItemOrder to add
     */
    public void add(ItemOrder order) {

        // Check if item already exists in the cart
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getItem().equals(order.getItem())) {
                // Replace existing order
                orders.set(i, order);
                return;
            }
        }

        // Otherwise, add as a new order
        orders.add(order);
    }

    /**
     * Sets whether a discount should be applied.
     * @param value true for discount, false for no discount
     */
    public void setDiscount(boolean value) {
        discount = value;
    }

    /**
     * Computes and returns the total price of the shopping cart.
     * @return total cost
     */
    public double getTotal() {
        double total = 0.0;

        // Add prices of all item orders
        for (ItemOrder order : orders) {
            total += order.getPrice();
        }

        // Apply 10% discount if selected
        if (discount) {
            total = total * 0.9;
        }

        return total;
    }
}
