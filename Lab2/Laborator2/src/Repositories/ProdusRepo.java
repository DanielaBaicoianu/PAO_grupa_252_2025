package Repositories;
import Entitati.Produs;

import java.util.ArrayList;
import java.util.List;
public class ProdusRepo {
    public static List<Produs> produse;
    public static List<Produs> getProduse(){
        Produs prod1=new Produs("Tricou", 25.4);
        Produs prod2=new Produs("Pantaloni", 182.3);
        Produs prod3=new Produs("Gantere 2kg", 121.2);
        Produs prod4=new Produs("Gantere 5kg", 134.3);
        Produs prod5=new Produs("Saltea Yoga", 87.3);
        produse= new ArrayList<Produs>(List.of(new Produs[]{prod1, prod2, prod3, prod4, prod5}));
        return produse;
    }
}
