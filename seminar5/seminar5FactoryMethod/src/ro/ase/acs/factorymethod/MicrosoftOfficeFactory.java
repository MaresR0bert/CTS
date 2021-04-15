package ro.ase.acs.factorymethod;

public class MicrosoftOfficeFactory implements DocumentFactory {
    @Override
    public Document getDocument(DocumentType documentType, String fileName) throws NoSuchDocumentException {
        if(documentType == DocumentType.TEXT_EDITOR){
            return new WordDocument(fileName);
        } else if(documentType == DocumentType.SPREADSHEET){
            return new ExcelDocument(fileName);
        }
        throw new NoSuchDocumentException();
    }
}
