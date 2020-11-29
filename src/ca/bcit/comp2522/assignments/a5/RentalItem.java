package ca.bcit.comp2522.assignments.a5;

import java.util.concurrent.locks.Condition;

public class RentalItem extends InventoryItem{

    public Condition currentCondition;
    public Rental[] items;
    public long rentalID;
    public double rentalPrice;
    public boolean sellable;
    public long serialVersionUID;
    public boolean sold;

    public RentalItem() {

    }

    public RentalItem(Condition currentCondition, Rental[] items, long rentalID, double rentalPrice, boolean sellable, long serialVersionUID, boolean sold) {
        this.currentCondition = currentCondition;
        this.items = items;
        this.rentalID = rentalID;
        this.rentalPrice = rentalPrice;
        this.sellable = sellable;
        this.serialVersionUID = serialVersionUID;
        this.sold = sold;
    }

    public Condition getCurrentCondition() {
        return currentCondition;
    }

    public void setCurrentCondition(Condition currentCondition) {
        this.currentCondition = currentCondition;
    }

    public Rental[] getItems() {
        return items;
    }

    public void setItems(Rental[] items) {
        this.items = items;
    }

    public long getRentalID() {
        return rentalID;
    }

    public void setRentalID(long rentalID) {
        this.rentalID = rentalID;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public boolean isSellable() {
        return sellable;
    }

    public void setSellable(boolean sellable) {
        this.sellable = sellable;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
}
