package factory;

import model.Document.*;

public class DocumentFactory {

    public DocumentModel getDocuments(String documentType) {
        if (documentType.equalsIgnoreCase(DocumentType.DVD.getType())) return new DVD();
        if (documentType.equalsIgnoreCase(DocumentType.BOOK.getType())) return new Book();
        if (documentType.equalsIgnoreCase(DocumentType.MAGAZINE.getType())) return new Magazine();
        return null;
    }
}
