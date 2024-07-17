package org.example.classes;

import org.example.Enums.Carburant;

public class Camion extends Vehicule {
    static int nbCamion =1;

    public Camion(int anne, double prix, Carburant typeCarb, double cap_reservoir, double quantite_carburant) {
        super(anne, prix, typeCarb, cap_reservoir, quantite_carburant);
        String mat = "CAM" + String.valueOf(nbCamion);
        setMatricule(mat);
        nbCamion++;
    }
    @Override
    public String toString() {
        return "Camion{" +
                "Matricule='" + getMatricule() + '\'' +
                ", anne=" + getAnne() +
                ", prix=" + getPrix() +
                '}';
    }
}
