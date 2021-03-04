package ro.ase.acs.main;

import ro.ase.acs.readers.ConsoleReader;
import ro.ase.acs.services.Orchestrator;
import ro.ase.acs.writers.FileWriter;
import ro.ase.acs.writers.Writeable;
import ro.ase.acs.readers.Readable;

public class Main {
    public static void main(String[] args) {
        IoC ioCContainer = new IoC();
        ioCContainer.register(Writeable.class, FileWriter.class);
        ioCContainer.register(Readable.class, ConsoleReader.class);

        Orchestrator orchestrator = new Orchestrator(ioCContainer);
        orchestrator.execute();
    }
}