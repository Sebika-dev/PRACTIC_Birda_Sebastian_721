package org.example.model;

import java.util.Objects;

public class SponsorGeschenk extends Entity<Long>{
    private int tributID;
    private String itemName;
    private int value;
    private int day;

    public SponsorGeschenk(int tributID, String itemName, int value, int day){
        this.tributID = tributID;
        this.itemName = itemName;
        this.value = value;
        this.day = day;
    }

    public int getTributID() {
        return tributID;
    }

    public void setTributID(int tributID) {
        this.tributID = tributID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "SponsorGeschenk{" +
                "tributID=" + tributID +
                ", itemName='" + itemName + '\'' +
                ", value=" + value +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SponsorGeschenk that = (SponsorGeschenk) o;
        return tributID == that.tributID && value == that.value && day == that.day && Objects.equals(itemName, that.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tributID, itemName, value, day);
    }
}
