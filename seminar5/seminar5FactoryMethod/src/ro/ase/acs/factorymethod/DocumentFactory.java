package ro.ase.acs.factorymethod;

public interface DocumentFactory {
    public Document getDocument(DocumentType documentType, String fileName) throws NoSuchDocumentException;

}
