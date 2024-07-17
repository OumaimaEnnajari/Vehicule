package org.example.classes;

import org.example.Enums.Carburant;

import java.util.Vector;

public class Parc {
    private Vector<Vehicule> VAC = new Vector<Vehicule>();
    static int nbVoiture=0;
    static int nbCar=0;
    static int nbCamion=0;
    private int nbMaxVoiture;
    private int nbMaxAutoCar;
    private int nbMaxCamion;

    public Parc( int nbMaxVoiture, int nbMaxAutoCar, int nbMaxCamion) {

        this.nbMaxVoiture = nbMaxVoiture;
        this.nbMaxAutoCar = nbMaxAutoCar;
        this.nbMaxCamion = nbMaxCamion;
    }

    public Voiture creerVoiture(int anne, double prix, Carburant typeCarb, double cap_reservoir, double quantite_carburant)
    {
        return new Voiture(anne,prix,typeCarb,cap_reservoir,quantite_carburant);
    }
    public Camion creerCamion(int anne, double prix, Carburant typeCarb, double cap_reservoir, double quantite_carburant){
        return new Camion(anne,prix,typeCarb,cap_reservoir,quantite_carburant);
    }

    public boolean AddVehicule(Vehicule V) throws Exception{
        if (VAC.contains(V)) throw new Exception("Le vehicule existe déja dans le Parc");

            if(V instanceof Voiture){
                if (nbMaxVoiture<=nbVoiture) throw new Exception("Le parc est plein");
                nbVoiture ++;
                VAC.add(V);
                return true;
            } else if (V instanceof Camion) {
                if (nbMaxCamion<=nbCamion) throw new Exception("Le parc est plein");
                nbCamion++;
                VAC.add(V);
                return true;
            } else if (V instanceof Autocar) {
                if (nbMaxAutoCar<=nbCar) throw new Exception("Le parc est plein");
                nbCar++;
                VAC.add(V);
                return true;
            }
        return false;
        
    }
    public boolean VehiculeOut(Vehicule V) throws Exception{
        if (!VAC.contains(V)) throw new Exception("Le vehicule n'existe pas dans ce park");
        VAC.remove(V);
        if(V instanceof Voiture){
            nbVoiture --;
            return true;
        } else if (V instanceof Camion) {
            nbCamion--;
            return true;
        } else if (V instanceof Autocar) {
            nbCar--;
            return true;
        }
        return false;

    }
    
}
