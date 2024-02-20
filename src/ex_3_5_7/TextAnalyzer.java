package ex_3_5_7;

public interface TextAnalyzer {
    Label processText(String text);

    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }
}
