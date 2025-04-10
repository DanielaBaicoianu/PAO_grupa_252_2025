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
        Client client4 = new Client("Popescu Ion", "ion@gmail.com", 15, "Bucuresti");
        Client client5 = new Client("Ionescu George", "georg@gmail.com", 25, "Ploiesti");
        Client client6 = new Client("Ion Marcel", "marcel@yahoo.com", 30, "Constanta");
        List<Produs> produse = ProdusRepo.getProduse();

        Collections.sort(produse);

        //System.out.println(produse)   ;

        List<Comanda> comenzi = getComenzi();
        ServiciuClientImplementation serviciuClientImplementation = new ServiciuClientImplementation(client1);
        serviciuClientImplementation.adaugaComanda(comenzi.get(4));
        //serviciuClientImplementation.adaugaComanda(comenzi.get(5));
/*        System.out.println(client1);
        //serviciuClientImplementation.procesareComanda(3);
        System.out.println(client1);*/


        ServiciuClientImplementation serviciuClientImplementation1 = new ServiciuClientImplementation(client2);
        serviciuClientImplementation1.adaugaComanda(comenzi.get(2));
        //serviciuClientImplementation1.adaugaComanda(comenzi.get(3));


        ServiciuClientImplementation serviciuClientImplementation2 = new ServiciuClientImplementation(client3);
        serviciuClientImplementation2.adaugaComanda(comenzi.get(6));

        serviciuClientImplementation2 = new ServiciuClientImplementation(client4);
        serviciuClientImplementation2.adaugaComanda(comenzi.get(3));
        serviciuClientImplementation2 = new ServiciuClientImplementation(client5);
        serviciuClientImplementation2.adaugaComanda(comenzi.get(2));
        serviciuClientImplementation2 = new ServiciuClientImplementation(client6);
        serviciuClientImplementation2.adaugaComanda(comenzi.get(0));


        List<Client> clienti = new ArrayList<>();
        clienti.add(client1);
        clienti.add(client2);
        clienti.add(client3);
        clienti.add(client4);
        clienti.add(client5);
        clienti.add(client6);

        Collections.sort(clienti);

/*        for (Client client : clienti){
            System.out.println(client.getSumaTotala());
        }*/

        Map<String, List<Comanda>> gestionareClienti = new HashMap<>();
        for (Client client : clienti) {
            String key = client.getEmail();
            if (gestionareClienti.containsKey(key)) {
                List<Comanda> comenziPerClient = new ArrayList<>();
                comenziPerClient.addAll(gestionareClienti.get(key));
                comenziPerClient.addAll(client.getComenzi());
                gestionareClienti.put(key, comenziPerClient);
            } else gestionareClienti.put(key, client.getComenzi());
        }

        System.out.println(gestionareClienti);
    }
}

