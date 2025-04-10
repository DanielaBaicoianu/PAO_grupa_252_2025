package Repositories;

import Entitati.Produs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Utile.Constante.NUME_FISIER;
import static Utile.FilesUtils.citesteProduse;

public class ProdusRepo {
    public static List<Produs> produse;

    public static List<Produs> getProduse() throws IOException {
        return citesteProduse(NUME_FISIER);
    }
}
