package InstrumentFinanciar;

import java.util.ArrayList;


public class PortofoliuGenerics<T> {
    ArrayList<T> portofoliu;

    public PortofoliuGenerics(ArrayList<T> portofoliu) {
        this.portofoliu = portofoliu;
    }

    public PortofoliuGenerics() {
        this.portofoliu = new ArrayList<T>();
    }

    public ArrayList<T> getPortofoliu() {
        return portofoliu;
    }

    public void setPortofoliu(ArrayList<T> portofoliu) {
        this.portofoliu = portofoliu;
    }

    public void appendInstrumentFinanciar(T instrument) {
        this.portofoliu.add(instrument);
    }

    public T getInstrumentFinanciar(int index) {
        return this.portofoliu.get(index);
    }
}
