package ro.ase.acs.main;

import ro.ase.acs.factorymethod.*;

public class NewMain {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new OpenOfficeFactory();
        try {
            Document document = documentFactory.getDocument(DocumentType.SPREADSHEET,"studenti");
            document.open();
            Document document2 = documentFactory.getDocument(DocumentType.TEXT_EDITOR,"proiect");
            document2.open();
        } catch (NoSuchDocumentException e) {
            e.printStackTrace();
        }

    }
}
