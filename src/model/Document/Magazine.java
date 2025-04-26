package model.Document;

public class Magazine extends DocumentModel {
    @Override
    protected String getType() {
        return DocumentType.MAGAZINE.getType();
    }
}
