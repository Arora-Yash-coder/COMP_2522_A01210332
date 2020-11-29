package ca.bcit.comp2522.assignments.a5;

import java.util.Date;
import java.util.Objects;

public class InventoryItem {
    public Date IPD;
    public long SKU;
    public String desc;
    public String name;
    public double purchasePrice;
    public long serialVersionUID;
    public String type;

    public Date getIPD() {
        return IPD;
    }

    public void setIPD(Date IPD) {
        this.IPD = IPD;
    }

    public long getSKU() {
        return SKU;
    }

    public void setSKU(long SKU) {
        this.SKU = SKU;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InventoryItem)) return false;
        InventoryItem that = (InventoryItem) o;
        return getSKU() == that.getSKU() &&
                Double.compare(that.getPurchasePrice(), getPurchasePrice()) == 0 &&
                serialVersionUID == that.serialVersionUID &&
                Objects.equals(getIPD(), that.getIPD()) &&
                Objects.equals(getDesc(), that.getDesc()) &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getType(), that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIPD(), getSKU(), getDesc(), getName(), getPurchasePrice(), serialVersionUID, getType());
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "IPD=" + IPD +
                ", SKU=" + SKU +
                ", desc='" + desc + '\'' +
                ", name='" + name + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", serialVersionUID=" + serialVersionUID +
                ", type='" + type + '\'' +
                '}';
    }
}

interface Sellable{
    boolean isSellable();
    void setSellable(boolean b);
}
