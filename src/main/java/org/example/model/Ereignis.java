package org.example.model;

import java.util.Objects;

public class Ereignis extends Entity<Long>{
    private int tributID;
    private int points;
    private int day;
    private String EventTyp;

    public Ereignis(int tributID, int points, int day, String eventTyp){
        this.tributID = tributID;
        this.points = points;
        this.day = day;
        EventTyp = eventTyp;
    }

    public int getTributID() {
        return tributID;
    }

    public void setTributID(int tributID) {
        this.tributID = tributID;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getEventTyp() {
        return EventTyp;
    }

    public void setEventTyp(String eventTyp) {
        EventTyp = eventTyp;
    }

    @Override
    public String toString() {
        return "Ereignis{" +
                "tributID=" + tributID +
                ", points=" + points +
                ", day=" + day +
                ", EventTyp='" + EventTyp + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ereignis ereignis = (Ereignis) o;
        return tributID == ereignis.tributID && points == ereignis.points && day == ereignis.day && Objects.equals(EventTyp, ereignis.EventTyp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tributID, points, day, EventTyp);
    }
}
