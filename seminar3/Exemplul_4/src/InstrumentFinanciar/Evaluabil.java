package InstrumentFinanciar;

public interface Evaluabil {
    public default double valoare(Instrument instrument) {
        return instrument.getPretInstrument();
    }
}
