import Entitati.Client;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Popescu Ion", "ion@gmail.com", 15, "Bucuresti", 2);
        Client client2 = new Client("Ionescu George", "georg@gmail.com", 25, "Ploiesti", 7);
        Client client3 = new Client("Ion Marcel", "marcel@yahoo.com", 30, "Constanta", 19);
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);

        Client[] listaClienti = {client1, client2, client3};
        for (Client client : listaClienti) {
            System.out.println(client.getNume() + " " + client.getCategorie());
        }

        client1.plaseazaComanda();
        client1.plaseazaComanda();
        client1.plaseazaComanda();0
        System.out.println(client1);


    }
}
