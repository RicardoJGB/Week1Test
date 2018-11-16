package com.mobileapps.week1test;

public class Animal {

    private String AnimalName;
    private boolean Mammal;
    private String Order;

    public String getAnimalName() {
        return AnimalName;
    }

    public void setAnimalName(String animalName) {
        this.AnimalName = animalName;
    }

    public boolean isMammal() {
        return Mammal;
    }

    public void setMammal(boolean mammal) {
        Mammal = mammal;
    }

    public String getOrder() {
        return Order;
    }

    public void setOrder(String order) {
        this.Order = order;
    }
}
