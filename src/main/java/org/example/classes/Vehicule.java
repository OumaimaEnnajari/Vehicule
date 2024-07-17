package org.example.classes;

import org.example.Enums.Carburant;
import org.example.interfaces.Motorisation;

public abstract class Vehicule implements Motorisation {
    private String Mat;
    private int anne;
    private double prix;
    private Carburant typeCarb;
    private double cap_reservoir;
    private double qte_carb;

    public Vehicule(int anne, double prix, Carburant typeCarb, double cap_reservoir, double quantite_carburant) {
        this.anne = anne;
        this.prix = prix;
        this.typeCarb = typeCarb;
        if (cap_reservoir<=0)
            throw new RuntimeException("Capacité de reservoir doit etre >0");
        this.cap_reservoir = cap_reservoir;
        if (quantite_carburant<=0)
            throw new RuntimeException("LA quantité de reservoir doit etre >0");
        if (cap_reservoir<=quantite_carburant)
            throw new RuntimeException("La quantité carburant ne peut pas depasse la capacite du reservoir");
        this.qte_carb = quantite_carburant;
    }

    public String getMatricule() {
        return Mat;
    }

    public Carburant getTypeCarb() {
        return typeCarb;
    }

    public void setTypeCarb(Carburant typeCarb) {
        this.typeCarb = typeCarb;
    }

    public void setMatricule(String matricule) {
        Mat = matricule;
    }

    public int getAnne() {
        return anne;
    }

    public void setAnne(int anne) {
        this.anne = anne;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }


    @Override
    public Carburant typeCarburant() {
        return typeCarb;
    }

    @Override
    public void periodiciteVidange() {
        int periode=10;
        if(typeCarburant()==Carburant.DIESEL){
            periode=10;
        } else if (typeCarburant()==Carburant.ESSENCE) {
            periode=12;
        } else if (typeCarburant()==Carburant.GAZ) {
            periode=18;
        }

        System.out.println("La periodicite de vidange est : "+periode +" mois");
    }

    public double getCap_reservoir() {
        return cap_reservoir;
    }

    public void setCap_reservoir(double cap_reservoir) {
        this.cap_reservoir = cap_reservoir;
    }

    public double getQte_carb() {
        return qte_carb;
    }

    public void setQte_carb(double qte_carb) {
        this.qte_carb = qte_carb;
    }

    public void addCarburant(double carb) throws Exception{
        if (carb<0) throw new Exception("On ne peut pas ajouter un carburant négatif");
        else
            if (carb+ qte_carb >cap_reservoir)
                throw new Exception("Le carburant qu'on veut ajouter depasse la capacite maximale ");
        else
            System.out.println("Le carburant a ete ajouter avec succes");
    }
}
