package com.mobileapps.week1test;

public class Snake {

    private String Species="Serpentes";
    private String Phylum="Chordata";

    public void Hiss(){
        System.out.println("HISSSSSS");
    }
    public void Eat(){
        System.out.println("GULP!");
    }
    public void Sleep(){
        System.out.println("ZzZzZz");
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    public String getPhylum() {
        return Phylum;
    }

    public void setPhylum(String phylum) {
        Phylum = phylum;
    }
}
