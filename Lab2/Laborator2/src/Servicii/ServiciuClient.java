package Servicii;
import Entitati.Client;
import Entitati.Comanda;
public class ServiciuClient {
    public void adaugaComanda(Client clientCurent, Comanda comandaCurenta){
         clientCurent.adaugaComanda(comandaCurenta);
    }
}
