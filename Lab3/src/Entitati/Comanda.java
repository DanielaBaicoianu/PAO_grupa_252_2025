package Entitati;

import Utile.CategorieClient;
import Utile.ClientUtils;
import Utile.Status;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static Utile.ClientUtils.idCurent;

public class Comanda {
    private final int idComanda;
    private List<Produs> produse;
    private LocalDateTime data;
    private Status status;

    public void setStatus(Status status) {
        this.status = status;
    }


    public Status getStatus() {
        return status;
    }

    public Comanda() {
        idComanda = idCurent;
        idCurent++;
        produse = new ArrayList<>();
        status = Status.NEPROCESAT;
        data = LocalDateTime.now();
    }

    public void addProdus(Produs produs){
        produse.add(produs);
    }
    @Override
    public String toString() {
        return "Comanda{" +
                "idComanda=" + idComanda +
                ", produse=" + produse +
                ", data=" + data +
                ", status=" + status +
                '}';
    }
}
