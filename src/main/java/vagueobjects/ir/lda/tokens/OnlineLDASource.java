package vagueobjects.ir.lda.tokens;

import vagueobjects.ir.lda.online.demo.DocumentData;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shredinger
 * Date: 11/23/13
 * Time: 5:44 PM
 * Project: IntelligentSearch
 */
public interface OnlineLDASource {
    List<DocumentData> getDocumentsData();

    String getTokenById(int i);

    int[][] getTokenIds();

    int[][] getTokenCounts();

    int size();

    int getTokenCount();
}