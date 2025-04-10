package Repositories;

import Entitati.Comanda;
import Entitati.Produs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Repositories.ProdusRepo.getProduse;

public class ComandaRepo {
    public static List<Comanda> getComenzi() throws IOException {
        List<Comanda> comenzi = new ArrayList<>();
        Comanda comanda = new Comanda();
        List<Produs> produseRepo = getProduse();
        comanda.addProdus(produseRepo.get(0));
        comanda.addProdus(produseRepo.get(1));
        comanda.addProdus(produseRepo.get(2));
        comanda.addProdus(produseRepo.get(3));

        Comanda comanda2 = new Comanda();
        comanda2.addProdus(produseRepo.get(0));
        comanda2.addProdus(produseRepo.get(4));
        comanda2.addProdus(produseRepo.get(4));

        Comanda comanda3 = new Comanda();
        comanda3.addProdus(produseRepo.get(0));
        comanda3.addProdus(produseRepo.get(4));
        comanda3.addProdus(produseRepo.get(4));

        Comanda comanda4 = new Comanda();
        comanda4.addProdus(produseRepo.get(0));
        comanda4.addProdus(produseRepo.get(4));
        comanda4.addProdus(produseRepo.get(4));

        Comanda comanda5 = new Comanda();
        comanda5.addProdus(produseRepo.get(0));
        comanda5.addProdus(produseRepo.get(4));
        comanda5.addProdus(produseRepo.get(4));

        Comanda comanda6 = new Comanda();
        comanda6.addProdus(produseRepo.get(0));
        comanda6.addProdus(produseRepo.get(4));
        comanda6.addProdus(produseRepo.get(4));

        Comanda comanda7 = new Comanda();
        comanda7.addProdus(produseRepo.get(0));
        comanda7.addProdus(produseRepo.get(4));
        comanda7.addProdus(produseRepo.get(4));

        comenzi.add(comanda);
        comenzi.add(comanda2);
        comenzi.add(comanda3);
        comenzi.add(comanda4);
        comenzi.add(comanda5);
        comenzi.add(comanda6);
        comenzi.add(comanda7);

        return comenzi;

    }
}
