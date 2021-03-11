package InstrumentFinanciar;


import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args) {
        Actiune actiuneALR = new Actiune("ALR", "Alro Slatina", 2.67, Status.TRANZACTIONABIL, 2.7F);
        Actiune actiuneBRD = new Actiune("BRD","Banca Romana pentru Dezvoltare", 12.78, Status.TRANZACTIONABIL, 2.8F);
        Actiune actiuneTLV = new Actiune("TLV", "Banca Transilvania", 7.34, Status.TRANZACTIONABIL,3F);
        Obligatiune obligatiuneTGN = new Obligatiune("TGN", "Transgaz", 254.5, Status.NETRANZACTIONABIL, 11F);
        Obligatiune obligtiuneBVB = new Obligatiune("BVB", "Bursa de Valori Bucuresti", 24.6, Status.NETRANZACTIONABIL, 11F);

        ArrayList<Instrument> lista = new ArrayList<Instrument>();
        lista.add(actiuneALR);
        lista.add(actiuneBRD);
        lista.add(actiuneTLV);
        lista.add(obligatiuneTGN);
        lista.add(obligtiuneBVB);

        FileWriter outFile = null;
        BufferedWriter writer = null;

        try {
            outFile = new FileWriter("instrumenteFinanciare.csv", false);
            writer = new BufferedWriter(outFile);

            for (Instrument i:lista) {
                System.out.println(i.toString());
                writer.write(i.toString());
                writer.newLine(); // writer.write("\r\n");
            }

            writer.close();
            outFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayDeque<Instrument> coada = new ArrayDeque<Instrument>();

        FileReader inFile = null;
        BufferedReader reader = null;

        try {
            inFile = new FileReader("instrumenteFinanciare.csv");
            reader = new BufferedReader(inFile);

            Scanner fileScanner = new Scanner(reader);
            while(fileScanner.hasNext()) {
                String linie = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(linie);
                lineScanner.useDelimiter(",");

                String clasaCitita = lineScanner.next();
                Class clasa = Class.forName(clasaCitita);

                Object local = clasa.getDeclaredConstructor().newInstance();
                if (local instanceof Instrument) {
                    local = ((Instrument) local).parseFromString(linie, ",");
                    coada.offerLast((Instrument) local);
                }
            }

            reader.close();
            inFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Instrument iter = null;
        while(!coada.isEmpty()) {
            iter = coada.pollFirst();
            System.out.println(iter.toString());
        }

        PortofoliuGenerics instrumente = new PortofoliuGenerics<Instrument>();
        instrumente.setPortofoliu(lista);
        instrumente.appendInstrumentFinanciar(actiuneALR);
        for (Instrument i:lista) {
            System.out.println(i.toString());
        }

    }
}
