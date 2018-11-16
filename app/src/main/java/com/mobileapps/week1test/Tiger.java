package com.mobileapps.week1test;

public class Tiger extends Animal {

    private String Species = "Chordae";
    private String Phylum = "Felidae";

    public void Roar(){
        System.out.println("The tiger goes GRRRR!!");
        }

    public void Eat() {
        System.out.println("Chomp chomp");
    }
    public void Sleep(){
        System.out.println("ZZZZ");
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
