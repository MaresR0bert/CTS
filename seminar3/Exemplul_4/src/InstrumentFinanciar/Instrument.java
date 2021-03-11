package InstrumentFinanciar;


import java.util.Scanner;

public class Instrument implements Evaluabil, ParceableFromString {
    private String simbolInstrument;
    private String numeInstrument;
    private double pretInstrument;
    private Status stareInstrument;

    public Instrument(String simbolInstrument, String numeInstrument, double pretInstrument, Status stareInstrument) {
        this.simbolInstrument = simbolInstrument;
        this.numeInstrument = numeInstrument;
        this.pretInstrument = pretInstrument;
        this.stareInstrument = stareInstrument;
    }

    public Instrument() {
        this.simbolInstrument = null;
        this.numeInstrument = null;
        this.pretInstrument = 0.0F;
        this.stareInstrument = Status.NECUNOSCUT;
    }

    public String getSimbolInstrument() {
        return simbolInstrument;
    }

    public void setSimbolInstrument(String simbolInstrument) {
        this.simbolInstrument = simbolInstrument;
    }

    public String getNumeInstrument() {
        return numeInstrument;
    }

    public void setNumeInstrument(String numeInstrument) {
        this.numeInstrument = numeInstrument;
    }

    public double getPretInstrument() {
        return pretInstrument;
    }

    public void setPretInstrument(double pretInstrument) {
        this.pretInstrument = pretInstrument;
    }

    public Status getStareInstrument() {
        return stareInstrument;
    }

    public void setStareInstrument(Status stareInstrument) {
        this.stareInstrument = stareInstrument;
    }

    @Override
    public Object dinString(String linie, String separator) {
        Scanner lineScanner = new Scanner(linie);
        lineScanner.useDelimiter(separator);

        String numeClasa = lineScanner.next();
        System.out.println("Clasa citita " + numeClasa);

        Instrument local = new Instrument();
        local.setSimbolInstrument(lineScanner.next());
        local.setNumeInstrument(lineScanner.next());
        local.setPretInstrument(lineScanner.nextDouble());
        local.setStareInstrument(Status.valueOf(lineScanner.next()));

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
                this.simbolInstrument + "," +
                this.numeInstrument + "," +
                Double.toString(this.pretInstrument) + "," +
                stareInstrument.toString();
    }
}
