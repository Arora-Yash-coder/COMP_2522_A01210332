package ca.bcit.comp2522.assignments.a5;

import java.util.Date;
import java.util.Objects;
import java.util.concurrent.locks.Condition;

public class Rental extends RentalItem{
    public String comments;
    public Condition conditionAfter;
    public Condition conditionBefore;
    public Date date;
    public long rentalID;
    public long serialVersionUID;

    public Rental() {

    }

    public Rental(Condition currentCondition, Rental[] items, long rentalID, double rentalPrice, boolean sellable, long serialVersionUID, boolean sold) {
        super(currentCondition, items, rentalID, rentalPrice, sellable, serialVersionUID, sold);
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Condition getConditionAfter() {
        return conditionAfter;
    }

    public void setConditionAfter(Condition conditionAfter) {
        this.conditionAfter = conditionAfter;
    }

    public Condition getConditionBefore() {
        return conditionBefore;
    }

    public void setConditionBefore(Condition conditionBefore) {
        this.conditionBefore = conditionBefore;
    }

    public long getRentalID() {
        return rentalID;
    }

    public void setRentalID(long rentalID) {
        this.rentalID = rentalID;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rental)) return false;
        if (!super.equals(o)) return false;
        Rental rental = (Rental) o;
        return getRentalID() == rental.getRentalID() &&
                serialVersionUID == rental.serialVersionUID &&
                Objects.equals(getComments(), rental.getComments()) &&
                Objects.equals(getConditionAfter(), rental.getConditionAfter()) &&
                Objects.equals(getConditionBefore(), rental.getConditionBefore()) &&
                Objects.equals(getDate(), rental.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getComments(), getConditionAfter(), getConditionBefore(), getDate(), getRentalID(), serialVersionUID);
    }

    @Override
    public String toString() {
        return "Rental{" +
                "comments='" + comments + '\'' +
                ", conditionAfter=" + conditionAfter +
                ", conditionBefore=" + conditionBefore +
                ", date=" + date +
                ", rentalID=" + rentalID +
                ", serialVersionUID=" + serialVersionUID +
                ", currentCondition=" + currentCondition +
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
