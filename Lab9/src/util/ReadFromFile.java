package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

    public static String[] readDbInfoFromCsv(String fileName) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String[] dbInfo = bufferedReader.readLine().split(",");

        return dbInfo;

    }


}
