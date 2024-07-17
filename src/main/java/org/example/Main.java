package org.example;

import org.example.Enums.Carburant;
import org.example.classes.*;

import java.util.Vector;

public class Main {
    public static void main(String[] args) throws Exception {

        Voiture V1 = new Voiture(2010,10000, Carburant.DIESEL,50,20.5);
        Voiture V2 = new Voiture(2020,100000, Carburant.ESSENCE,60,10.5);
        Autocar A1 =new Autocar(2000,150000,Carburant.GAZ,150,50);
        Autocar A2 = new Autocar(2010, 100000, Carburant.DIESEL, 70, 60.5);
        Camion C2 = new Camion(2015, 15000, Carburant.ESSENCE, 60, 18.0);
        Camion C1 = new Camion(2020, 20000, Carburant.GAZ, 200, 25.0);


        Parc P=new Parc(10,5,5);
        Voiture V7 = V1 ;
         P.AddVehicule(V1);
         P.AddVehicule(V2);
        P.AddVehicule(C1);
        P.AddVehicule(C2);
        P.AddVehicule(A1);
        P.AddVehicule(A2);
        P.AddVehicule(V2);
         P.VehiculeOut(V1);
    }
}