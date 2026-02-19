package shopping;

import java.text.NumberFormat;
//Data Members
public class Item {
   private String name;
    private double price;
    private int bulkQuantity;
    private double bulkPrice;
    private boolean hasBulk;


    //Constructor
    public Item(String name, double price){
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.name = name;
        this.price = price;
        this.hasBulk = false;

    }
    //Constructor with Bulk
    public Item(String name, double price,int bulkQuantity, double bulkPrice){
        if (price < 0 || bulkQuantity < 0 || bulkPrice < 0){
            throw new IllegalArgumentException("Values cannot be negative");
        }
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
        this.hasBulk = true;
    }

    public double priceFor(int quantity){
        if(quantity < 0){
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        // If item does not have bulk pricing
        if(!hasBulk){
            return quantity * price;
        }
        // Calculate how many bulk sets are used
        int bulkSets = quantity / bulkQuantity;
        // Calculate leftover items
        int remainder = quantity % bulkQuantity;
        // Total price = bulk sets + leftover single items
        return (bulkSets * bulkPrice ) + (remainder * price);
    }
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String result = name + ", " + nf.format(price);

        // Add bulk pricing info if applicable
        if (hasBulk) {
            result += " (" + bulkQuantity + " for " + nf.format(bulkPrice) + ")";
        }

        return result;
    }
}
