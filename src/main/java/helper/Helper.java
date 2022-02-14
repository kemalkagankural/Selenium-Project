package helper;

import com.opencsv.exceptions.CsvException;


import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Helper {
    public static String csv;
    //Wait method
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //Writer to CSV
    public static void writeToCSV(String all) throws IOException {
        String csv = "bestseller.csv";
        FileWriter csvWriter=new FileWriter(csv);
        csvWriter.append(all.replace("[", "").replace("]", "").trim());
        csvWriter.flush();
        csvWriter.close();
    }

    //Reader to CSV
    public static String readToCSV(int categoryNumber) throws IOException, CsvException {
    FileReader fileReader = new FileReader("bestseller.csv");
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String line;
    List<String> lines = new ArrayList<>();
    while ((line = bufferedReader.readLine()) != null) {
        lines.add(line);
    }
        return lines.get(0).split(",")[categoryNumber];
    }
}
