package model.User;

import model.Document.DocumentModel;

import java.util.List;

public abstract class UserModel {
    protected int id;
    protected String username;
    protected List<DocumentModel> borrowedDocument;

    protected abstract void displayMenu();
}
