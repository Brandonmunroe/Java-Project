package shopping;

/**
 * The shopping.ItemOrder class represents an order of a specific shopping.Item
 * with a specified quantity.
 */
public class ItemOrder {
    // The item being ordered
    private Item item;

    // Quantity of the item ordered
    private int quantity;

    /**
     * Constructs an shopping.ItemOrder with the given item and quantity.
     * @param item the shopping.Item being ordered
     * @param quantity the quantity ordered
     */
    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    /**
     * Returns the total price of this item order.
     * @return price of this order
     */
    public double getPrice() {
        return item.priceFor(quantity);
    }

    /**
     * Returns the item for this order.
     * @return the shopping.Item object
     */
    public Item getItem() {
        return item;
    }
}
