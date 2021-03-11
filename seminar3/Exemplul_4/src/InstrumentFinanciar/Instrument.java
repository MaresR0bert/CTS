package InstrumentFinanciar;


import java.util.Scanner;

public class Instrument implements Evaluabil {
    private String simbol;
    private String nume;
    private double pret;
    private Status stare;

    public Instrument(String simbol, String nume, double pret, Status stare) {
        this.simbol = simbol;
        this.nume = nume;
        this.pret = pret;
        this.stare = stare;
    }

    public Instrument() {
        this.simbol = null;
        this.nume = null;
        this.pret = 0.0F;
        this.stare = Status.NECUNOSCUT;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public Status getStare() {
        return stare;
    }

    public void setStare(Status stare) {
        this.stare = stare;
    }

    @Override
    public Object dinString(String linie, String separator) {
        Scanner lineScanner = new Scanner(linie);
        lineScanner.useDelimiter(separator);

        String numeClasa = lineScanner.next();
        System.out.println("Clasa citita " + numeClasa);

        Instrument local = new Instrument();
        local.setSimbol(lineScanner.next());
        local.setNume(lineScanner.next());
        local.setPret(lineScanner.nextDouble());
        local.setStare(Status.valueOf(lineScanner.next()));

        return local;
    }

    @Override
    public String toString() {
//        return "Instrument{" +
//                "simbol='" + simbol + '\'' +
//                ", nume='" + nume + '\'' +
//                ", pret=" + pret +
//                '}';
        return this.getClass().getName() + "," +
                this.simbol + "," +
                this.nume + "," +
                Double.toString(this.pret) + "," +
                stare.toString();
    }
}
