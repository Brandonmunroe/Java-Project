package shopping;

import java.util.ArrayList;

public class Catalog {
    // Name of the catalog
    private String name;

    // List of items in the catalog
    private ArrayList<Item> items;

    /**
     * Constructs a shopping.Catalog with the given name.
     * @param name the name of the catalog
     */
    public Catalog(String name) {
        this.name = name;
        items = new ArrayList<Item>();
    }

    /**
     * Adds an item to the catalog.
     * @param item the shopping.Item to add
     */
    public void add(Item item) {
        items.add(item);
    }

    /**
     * Returns the number of items in the catalog.
     * @return catalog size
     */
    public int size() {
        return items.size();
    }

    /**
     * Returns the item at the specified index.
     * @param index position of item (0-based)
     * @return the shopping.Item at that index
     */
    public Item get(int index) {
        return items.get(index);
    }

    /**
     * Returns the name of the catalog.
     * @return catalog name
     */
    public String getName() {
        return name;
    }
}
