package strategy;

import model.Document.DocumentModel;

import java.util.ArrayList;
import java.util.List;

public class SearchByTitle implements SearchStrategy{
    @Override
    public List<DocumentModel> search(List<DocumentModel> documents, String keyword) {
        List<DocumentModel> result = new ArrayList<>();
        for (DocumentModel document : documents) {
            if (document.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(document);
            }
        }
        return result;
    }
}
