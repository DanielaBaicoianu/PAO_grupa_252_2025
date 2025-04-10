package Entitati;

public class Produs {
    private String nume;
    private Double pret;

    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public Double getPret() {
        return pret;
    }

    public Produs(String nume, Double pret) {
        this.nume = nume;
        this.pret = pret;
    }
}
