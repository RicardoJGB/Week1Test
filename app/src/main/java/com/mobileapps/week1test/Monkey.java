package com.mobileapps.week1test;

public class Monkey {

    private String Species="M.Sphinx";
    private String Phylum="Chordata";

    public void Screech(){
        System.out.println("EEEEEEE");
    }
    public void Eat(){
        System.out.println("Chompity chomp");
    }
    public void Sleep(){
        System.out.println("*Snore*");
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
