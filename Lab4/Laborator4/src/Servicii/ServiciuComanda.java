package Servicii;

import Entitati.Comanda;
import Entitati.Produs;

public class ServiciuComanda {

    Comanda comanda;
    public ServiciuComanda(Comanda comanda){
        this.comanda = comanda;
    }
    public void adaugareProdusComanda(Produs produs){
        this.comanda.addProdus(produs);
    }
}
