package org.example.model;

import jdk.jshell.Snippet;

import java.util.Objects;

public class Tribut extends Entity<Long>{
    private String name;
    private int distrikt;
    private String status;
    private int skillLevel;

    public Tribut(String name, int distrikt, String status, int skillLevel){
        this.name = name;
        this.distrikt = distrikt;
        this.status = status;
        this.skillLevel = skillLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistrikt() {
        return distrikt;
    }

    public void setDistrikt(int distrikt) {
        this.distrikt = distrikt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        return "Tribut{" +
                "name='" + name + '\'' +
                ", distrikt=" + distrikt +
                ", status='" + status + '\'' +
                ", skillLevel=" + skillLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tribut tribut = (Tribut) o;
        return distrikt == tribut.distrikt && skillLevel == tribut.skillLevel && Objects.equals(name, tribut.name) && Objects.equals(status, tribut.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distrikt, status, skillLevel);
    }
}
