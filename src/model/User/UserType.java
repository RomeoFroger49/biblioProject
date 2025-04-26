package model.User;

public enum UserType {
    ADMIN("Admin"),
    READER("Reader");

    private final String type;

    UserType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
