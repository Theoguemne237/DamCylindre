package org.example;
/*
* @auteur Theodore
* classe utilise pour comprendre les methodes et les classes
* */

public class Cylindre {
     private float volume = 0.0f;
     private double hauteur = 0.0f;

     public double diametre =0.0d;
     private String matiere;

    public String getMatiere() {
        return matiere;
    }
    //Constructeur

    public Cylindre(double hauteur, double diametre, String matiere) {
        this.hauteur = hauteur;
        this.diametre = diametre;
        this.matiere = matiere;
    }

    //Declaration des getter et setter
    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    //public float getVolume() {
      //  return volume;
    //}

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getDiametre() {
        return diametre;
    }

    public void setDiametre(double diametre) {
        this.diametre = diametre;
    }
/*
* Methode de calcul du volume d'un cylindre avec parametres
*   */

    public double getVolume( double hauteur, double diametre){
        return hauteur * diametre * diametre * Math.PI/4;
    }
/*
* @param
* Methode pour calcul d'un Volume de cylindre sans parametre*/
    public double getVolume(){
        return this.hauteur * this.diametre * this.diametre * Math.PI/4;
    }
}







