package Servicii;

import Entitati.Comanda;

public interface ServiciuClient {

    void adaugaComanda(Comanda comandaCurenta);

    void procesareComanda(int numarComanda);

}
