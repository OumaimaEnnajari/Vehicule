package org.example.classes;

import org.example.Enums.Carburant;
import org.example.interfaces.Decapotable;

public class Voiture extends Vehicule implements Decapotable {
    static int nbVoiture =1;
    private boolean toitPlie=true;

    public Voiture(int anne, double prix, Carburant typeCarb, double cap_reservoir, double quantite_carburant) {
        super(anne, prix, typeCarb, cap_reservoir, quantite_carburant);
        String mat = "VT" + String.valueOf(nbVoiture);
        setMatricule(mat);
        nbVoiture++;
    }


    @Override
    public String toString() {
        return "Voiture{" +
                "Matricule='" + getMatricule() + '\'' +
                ", anne=" + getAnne() +
                ", prix=" + getPrix() +
                '}';
    }

    @Override
    public void replieLeToit() {
        toitPlie=(!toitPlie);
    }
}
