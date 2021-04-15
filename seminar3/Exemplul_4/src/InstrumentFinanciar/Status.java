package InstrumentFinanciar;

public enum Status {
    TRANZACTIONABIL("TRANZACTIONABIL"),
    NETRANZACTIONABIL("NETRANZACTIONABIL"),
    NECUNOSCUT("NECUNOSCUT");

    private String valoare;

    Status(String valoare) {
        this.valoare = valoare;
    }
}
