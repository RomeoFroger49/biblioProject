package model.Document;

public class DVD extends DocumentModel {
    @Override
    protected String getType() {
        return DocumentType.DVD.getType();
    }
}
