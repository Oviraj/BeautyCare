package oviraj.com.beautycare.model;

/**
 * Created by Jannat Mostafiz on 11/20/2017.
 */

public class OfferData {
    String itemName;
    String itemPrice;
    String itemImage;
    String discount;
    String tillTime;

    public OfferData(String itemName, String itemPrice, String itemImage, String discount, String tillTime) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemImage = itemImage;
        this.discount = discount;
        this.tillTime = tillTime;
    }

    public OfferData() {
    }

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

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getTillTime() {
        return tillTime;
    }

    public void setTillTime(String tillTime) {
        this.tillTime = tillTime;
    }
}
