package ro.ase.acs.services;

import ro.ase.acs.main.IoC;
import ro.ase.acs.readers.Readable;
import ro.ase.acs.writers.Writeable;

public class Orchestrator {
    private Writeable writer;
    private Readable reader;
    private IoC ioCContainer;

    public Orchestrator(Writeable writer, Readable reader) {
        this.writer = writer;
        this.reader = reader;
    }

    public Orchestrator(IoC ioCContainer) {
        this.ioCContainer = ioCContainer;
        this.writer = this.ioCContainer.resolve(Writeable.class);
        this.reader = this.ioCContainer.resolve(Readable.class);
    }

    public void execute() {
        writer.write(reader.read());
    }

}