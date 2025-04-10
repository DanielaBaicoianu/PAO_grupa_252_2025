package Entitati;

import Utile.CategorieClient;
import Utile.Status;

import java.util.ArrayList;
import java.util.List;

public class Client implements Comparable<Client>{
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

    public void procesareComanda(int numarComanda) {
        for(int i = 0; i < numarComanda; i++) {
            Comanda comanda = comenzi.get(i);
            comanda.setStatus(Status.PROCESAT);
            comenzi.set(i, comanda);
            System.out.println(comenzi.get(i).getStatus());

        }
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                ", comenzi=" + comenzi +
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
    public double getSumaTotala() {
        double sumaTotala = 0;
        for (Comanda comanda: this.comenzi) {
            sumaTotala += comanda.getSumaTotala();

        }
        return sumaTotala;
    }

    public List<Comanda> getComenzi() {
        return comenzi;
    }

    @Override
    public int compareTo(Client otherClient) {
        return Double.compare(this.getSumaTotala(), otherClient.getSumaTotala());
    }
}

