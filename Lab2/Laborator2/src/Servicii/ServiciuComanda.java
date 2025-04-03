package Servicii;

import Entitati.Comanda;
import Entitati.Produs;

public class ServiciuComanda {
    public void adaugareProdusComanda(Comanda comanda, Produs produs){
        comanda.addProdus(produs);
    }
}
