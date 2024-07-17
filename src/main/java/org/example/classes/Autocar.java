package org.example.classes;

import org.example.Enums.Carburant;

public class Autocar extends Vehicule{
    static int nbCar =1;

    public Autocar(int anne, double prix, Carburant typeCarb, double cap_reservoir, double quantite_carburant) {
        super(anne, prix, typeCarb, cap_reservoir, quantite_carburant);
        String mat = "CAR" + String.valueOf(nbCar);
        setMatricule(mat);
        nbCar++;
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
