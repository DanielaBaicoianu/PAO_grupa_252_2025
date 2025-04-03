package Entitati;

import Utile.CategorieClient;

import java.util.ArrayList;
import java.util.List;

public class Client<T> {
    private String nume;
    private String email;
    private int varsta;
    private String adresa;
    private int numarComenzi;
    private CategorieClient categorie;
    private List<Comanda> comenzi;

    public Client(String nume, String email, int varsta, String adresa) {
        this.nume = nume;
        this.email = email;
        this.varsta = varsta;
        this.adresa = adresa;
        this.numarComenzi = 0;
        this.categorie = obtineCategoria();
        comenzi = new ArrayList<>();
    }

    private CategorieClient obtineCategoria() {
        if (this.numarComenzi >= 15)
            return CategorieClient.PREMIUM;
        if (this.numarComenzi >= 5)
            return CategorieClient.SILVER;
        return CategorieClient.BASIC;
    }

    public String getNume() {
        return this.nume;
    }

    public String getCategorie() {
        return this.categorie.toString();
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                ", varsta=" + varsta +
                ", adresa='" + adresa + '\'' +
                ", numarComenzi=" + numarComenzi +
                ", categorie=" + categorie +
                '}';
    }

    public void adaugaComanda(Comanda comandaNoua) {
        comenzi.add(comandaNoua);
        numarComenzi += 1;
    }

    public void seteazaNrComenzi(int nrComenzi) {
        this.numarComenzi = nrComenzi;
        this.categorie = obtineCategoria();
    }
}

