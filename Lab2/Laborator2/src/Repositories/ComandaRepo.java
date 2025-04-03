package Repositories;

import Entitati.Comanda;
import Entitati.Produs;

import java.util.ArrayList;
import java.util.List;

import static Repositories.ProdusRepo.getProduse;

public class ComandaRepo {
    public static List<Comanda> getComenzi() {
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

        comenzi.add(comanda);
        comenzi.add(comanda2);

        return comenzi;

    }
}
