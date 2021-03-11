package InstrumentFinanciar;

import java.util.Scanner;

public class Actiune extends Instrument implements Evaluabil, Actualizabil {
    private float procentDividend;

    public Actiune(String simbol, String nume, double pret, Status stare, float procentDividend) {
        super(simbol, nume, pret, stare);
        this.procentDividend = procentDividend;
    }

    public Actiune() {
        super();
        this.procentDividend = 0.0F;
    }

    @Override
    public Object parseFromString(String linie, String separator) {
        Scanner lineScanner = new Scanner(linie);
        lineScanner.useDelimiter(separator);

        String numeClasa = lineScanner.next();
        System.out.println("Clasa citita " + numeClasa);

        Actiune local = new Actiune();
        local.setSimbolInstrument(lineScanner.next());
        local.setNumeInstrument(lineScanner.next());
        local.setPretInstrument(lineScanner.nextDouble());
        local.setStareInstrument(Status.valueOf(lineScanner.next()));
        local.setProcentDividend(lineScanner.nextFloat());

        return local;
    }

    public float getProcentDividend() {
        return procentDividend;
    }

    public void setProcentDividend(float procentDividend) {
        this.procentDividend = procentDividend;
    }

    @Override
    public double valoare(Instrument instrument) {
        return this.getPretInstrument() +
                (this.getPretInstrument() * this.procentDividend / 100.0F);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "," +
                this.getSimbolInstrument() + "," +
                this.getNumeInstrument() + "," +
                this.getPretInstrument() + "," +
                this.getStareInstrument().toString() + "," +
                this.procentDividend;
    }

    @Override
    public void actualizare(Instrument instrument, Status stareNoua) {
        instrument.setStareInstrument(stareNoua);
    }
}
