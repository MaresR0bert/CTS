package InstrumentFinanciar;

import java.util.Scanner;

public class Obligatiune extends Instrument implements Evaluabil, Actualizabil {
    private float cupon;

    public Obligatiune(String simbol, String nume, double pret, Status stare, float cupon) {
        super(simbol, nume, pret, stare);
        this.cupon = cupon;
    }

    public Obligatiune() {
        super();
        this.cupon = 0.0F;
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
        local.setCupon(lineScanner.nextFloat());

        return local;
    }

    public float getCupon() {
        return cupon;
    }

    public void setCupon(float cupon) {
        this.cupon = cupon;
    }

    @Override
    public double valoare(Instrument instrument) {
        return this.getPretInstrument() + this.cupon;
    }


    @Override
    public String toString() {
//        return "Obligatiune{" +
//                "cupon=" + cupon +
//                '}';
        return this.getClass().getName() + "," +
                this.getSimbolInstrument() + "," +
                this.getNumeInstrument() + "," +
                Double.toString(this.getPretInstrument()) + "," +
                this.getStareInstrument().toString() + "," +
                this.cupon;
    }

    @Override
    public void actualizare(Instrument instrument, Status stareNoua) {
        instrument.setStareInstrument(stareNoua);
    }
}
