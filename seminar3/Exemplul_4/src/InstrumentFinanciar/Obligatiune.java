package InstrumentFinanciar;

import java.util.Scanner;

public class Obligatiune extends Instrument implements Evaluabil, Actualizabil {
    private float cuponObligatiune;

    public Obligatiune(String simbol, String nume, double pret, Status stare, float cuponObligatiune) {
        super(simbol, nume, pret, stare);
        this.cuponObligatiune = cuponObligatiune;
    }

    public Obligatiune() {
        super();
        this.cuponObligatiune = 0.0F;
    }

    @Override
    public Object parseFromString(String linie, String separator) {
        Scanner lineScanner = new Scanner(linie);
        lineScanner.useDelimiter(separator);

        String numeClasa = lineScanner.next();
        System.out.println("Clasa citita " + numeClasa);

        Obligatiune local = new Obligatiune();
        local.setSimbolInstrument(lineScanner.next());
        local.setNumeInstrument(lineScanner.next());
        local.setPretInstrument(lineScanner.nextDouble());
        local.setStareInstrument(Status.valueOf(lineScanner.next()));
        local.setCuponObligatiune(lineScanner.nextFloat());

        return local;
    }

    public float getCuponObligatiune() {
        return cuponObligatiune;
    }

    public void setCuponObligatiune(float cuponObligatiune) {
        this.cuponObligatiune = cuponObligatiune;
    }

    @Override
    public double valoare(Instrument instrument) {
        return this.getPretInstrument() + this.cuponObligatiune;
    }


    @Override
    public String toString() {
        return this.getClass().getName() + "," +
                this.getSimbolInstrument() + "," +
                this.getNumeInstrument() + "," +
                Double.toString(this.getPretInstrument()) + "," +
                this.getStareInstrument().toString() + "," +
                this.cuponObligatiune;
    }

    @Override
    public void actualizare(Instrument instrument, Status stareNoua) {
        instrument.setStareInstrument(stareNoua);
    }
}
