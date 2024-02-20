package ex_3_5_7;

public class TooLongTextAnalyzer implements TextAnalyzer {
    int maxLength;

    public TooLongTextAnalyzer(int ml) {
        this.maxLength = ml;
    }

    public Label processText(String text) {
        if (text.length() > maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}