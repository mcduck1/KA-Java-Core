package ex_3_5_7;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    // change back public to protected
    abstract protected String[] getKeywords();
    // change back public to protected
    abstract protected Label getLabel();

    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
