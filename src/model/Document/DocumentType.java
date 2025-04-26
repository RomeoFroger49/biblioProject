package model.Document;

public enum DocumentType {
    DVD("DVD"),
    MAGAZINE("MAGAZINE"),
    BOOK("BOOK");

    private final String type;

    DocumentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
