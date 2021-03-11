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

    public float getCupon() {
        return cupon;
    }

    public void setCupon(float cupon) {
        this.cupon = cupon;
    }

    @Override
    public double valoare(Instrument instrument) {
        return this.getPret() + this.cupon;
    }

    @Override
    public Object dinString(String linie, String separator) {
        Scanner lineScanner = new Scanner(linie);
        lineScanner.useDelimiter(separator);

        String numeClasa = lineScanner.next();
        System.out.println("Clasa citita " + numeClasa);

        Obligatiune local = new Obligatiune();
        local.setSimbol(lineScanner.next());
        local.setNume(lineScanner.next());
        local.setPret(lineScanner.nextDouble());
        local.setStare(Status.valueOf(lineScanner.next()));
        local.setCupon(lineScanner.nextFloat());

        return local;
    }

    @Override
    public String toString() {
//        return "Obligatiune{" +
//                "cupon=" + cupon +
//                '}';
        return this.getClass().getName() + "," +
                this.getSimbol() + "," +
                this.getNume() + "," +
                Double.toString(this.getPret()) + "," +
                this.getStare().toString() + "," +
                this.cupon;
    }
}
