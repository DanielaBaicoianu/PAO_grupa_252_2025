import Entitati.Client;
import Entitati.Comanda;
import Entitati.Produs;
import Repositories.ProdusRepo;
import Servicii.ServiciuClientImplementation;

import java.io.IOException;
import java.util.*;

import static Repositories.ComandaRepo.getComenzi;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IOException {
        Client client1 = new Client("Popescu Ion", "ion@gmail.com", 15, "Bucuresti");
        Client client2 = new Client("Ionescu George", "georg@gmail.com", 25, "Ploiesti");
        Client client3 = new Client("Ion Marcel", "marcel@yahoo.com", 30, "Constanta");
        List<Produs> produse = ProdusRepo.getProduse();
/*
        for (var prod : produse) {
            System.out.println(prod);
        }


*/

        List<Comanda> comenzi = getComenzi();
        ServiciuClientImplementation serviciuClientImplementation = new ServiciuClientImplementation(client1);
        serviciuClientImplementation.adaugaComanda(comenzi.get(2));
        serviciuClientImplementation.adaugaComanda(comenzi.get(3));
        serviciuClientImplementation.adaugaComanda( comenzi.get(4));
        serviciuClientImplementation.adaugaComanda(comenzi.get(5));
        serviciuClientImplementation.adaugaComanda(comenzi.get(6));
        System.out.println(client1);
        serviciuClientImplementation.procesareComanda(3);
        System.out.println(client1);
    }
}

