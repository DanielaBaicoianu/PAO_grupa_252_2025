package Utile;

import Entitati.Produs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilesUtils {
    public static List<Produs> citesteProduse(String numeFisier) throws IOException {
        List<Produs> listaProduse = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(numeFisier));
        String line;
        while ((line = br.readLine()) != null) {
            String[] vector = line.split(",");
            Produs produs = new Produs(vector[0], (double) Float.parseFloat(vector[1]));
            listaProduse.add(produs);
        }
        return listaProduse;
    }
}
