package strategy;

import model.Document.DocumentModel;

import java.util.ArrayList;
import java.util.List;

public class SearchByAuthor implements SearchStrategy{
    @Override
    public List<DocumentModel> search(List<DocumentModel> documents, String keyword) {
        List<DocumentModel> result = new ArrayList<>();
        for (DocumentModel document : documents) {
            if (document.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(document);
            }
        }
        return result;
    }
}
