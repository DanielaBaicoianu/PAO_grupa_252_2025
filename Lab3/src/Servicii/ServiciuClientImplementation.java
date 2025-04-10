package Servicii;

import Entitati.Client;
import Entitati.Comanda;

public class ServiciuClientImplementation implements ServiciuClient{
    private Client client;

    public ServiciuClientImplementation(Client client) {
        this.client = client;
    }

    @Override
    public void adaugaComanda(Comanda comandaCurenta) {
        client.adaugaComanda(comandaCurenta);
    }

    @Override
    public void procesareComanda(int numarComanda) {
        client.procesareComanda(numarComanda);
    }
}
