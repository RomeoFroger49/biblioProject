package strategy;

import model.Document.DocumentModel;

import java.util.List;

public interface SearchStrategy {
    List<DocumentModel> search(List<DocumentModel> documents, String keyword);
}