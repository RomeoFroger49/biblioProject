package model.Document;

public class Book extends DocumentModel {
    @Override
    protected String getType() {
        return DocumentType.BOOK.getType();
    }
}
