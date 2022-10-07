package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       Cylindre Cylindre_bois = new Cylindre(10.4,42.5,"bois");

       double volume = Cylindre_bois.getVolume();
       String matiere = Cylindre_bois.getMatiere();

       System.out.println("Le Volume du cylindre est: " + volume + " Et la matiere est: "+ matiere);


    }
}