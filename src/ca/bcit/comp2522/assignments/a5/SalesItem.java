package ca.bcit.comp2522.assignments.a5;

public class SalesItem extends InventoryItem {
    double salePrice;
    long salesId;
    boolean sellable;
    long serialVersionUID;
    boolean sold;

    public  SalesItem() {

    }

    public SalesItem(double salePrice, long salesId, boolean sellable, long serialVersionUID, boolean sold) {
        this.salePrice = salePrice;
        this.salesId = salesId;
        this.sellable = sellable;
        this.serialVersionUID = serialVersionUID;
        this.sold = sold;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public long getSalesId() {
        return salesId;
    }

    public void setSalesId(long salesId) {
        this.salesId = salesId;
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

    @Override
    public String toString() {
        return "SalesItem{" +
                "salePrice=" + salePrice +
                ", salesId=" + salesId +
                ", sellable=" + sellable +
                ", serialVersionUID=" + serialVersionUID +
                ", sold=" + sold +
                ", IPD=" + IPD +
                ", SKU=" + SKU +
                ", desc='" + desc + '\'' +
                ", name='" + name + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", serialVersionUID=" + serialVersionUID +
                ", type='" + type + '\'' +
                '}';
    }
}
