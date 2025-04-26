package strategy;

import model.Document.DocumentModel;

import java.util.ArrayList;
import java.util.List;

public class SearchByType implements SearchStrategy {

    @Override
    public List<DocumentModel> search(List<DocumentModel> documents, String keyword) {
        List<DocumentModel> result = new ArrayList<>();
        for (DocumentModel document : documents) {
            if (document.getDocumentType().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(document);
            }
        }
        return result;
    }
}
