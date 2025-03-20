package Entitati;

import Utile.CategorieClient;

public class Client {
    private String nume;
    private String email;
    private int varsta;
    private String adresa;
    private int numarComenzi;
    private CategorieClient categorie;

    public Client(String nume, String email, int varsta, String adresa, int numarComenzi) {
        this.nume = nume;
        this.email = email;
        this.varsta = varsta;
        this.adresa = adresa;
        this.numarComenzi = numarComenzi;
        this.categorie = obtineCategoria();
    }

    private CategorieClient obtineCategoria() {
        if (this.numarComenzi >= 15)
            return CategorieClient.PREMIUM;
        if (this.numarComenzi >= 5)
            return CategorieClient.SILVER;
        return CategorieClient.BASIC;
    }
    public String getNume(){
        return this.nume;
    }
    public String getCategorie(){
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
    public void plaseazaComanda(){
        this.numarComenzi++;
        this.categorie = obtineCategoria();
    }

    public void seteazaNrComenzi(int nrComenzi){
        this.numarComenzi = nrComenzi;
        this.categorie = obtineCategoria();
    }
}

