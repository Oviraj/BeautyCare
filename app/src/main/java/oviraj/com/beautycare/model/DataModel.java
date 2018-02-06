package oviraj.com.beautycare.model;

/**
 * Created by Jannat Mostafiz on 11/15/2017.
 */

public class DataModel {
    String itemName;
    String itemPrice;
    String itemImage;

    public DataModel(String itemName, String itemPrice, String itemImage) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemImage = itemImage;
    }
    public DataModel(){}

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }
}
