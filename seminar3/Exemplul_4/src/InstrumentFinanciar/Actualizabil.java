package InstrumentFinanciar;

public interface Actualizabil {
    public default void actualizare(Instrument instrument, Status stareNoua) {
        instrument.setStare(stareNoua);
    }
}
