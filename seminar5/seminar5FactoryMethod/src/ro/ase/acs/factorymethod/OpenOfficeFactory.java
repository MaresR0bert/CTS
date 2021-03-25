package ro.ase.acs.factorymethod;

public class OpenOfficeFactory implements DocumentFactory {
    public Document getDocument(DocumentType documentType, String fileName) throws NoSuchDocumentException {
        if(documentType == DocumentType.TEXT_EDITOR){
            return new OpenOfficeWord(fileName);
        } else if(documentType == DocumentType.SPREADSHEET){
            return new OpenOfficeSpreadsheet(fileName);
        }
        throw new NoSuchDocumentException();
    }
}
