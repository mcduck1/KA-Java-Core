package ex_3_5_7;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String [] keywords;
    private Label label;

    public NegativeTextAnalyzer() {
        this.keywords = new String[3];
        this.keywords[0] = ":(";
        this.keywords[1] = "=(";
        this.keywords[2] = ":|";
        label = Label.NEGATIVE_TEXT;
    }

    // change back public to protected
    protected String[] getKeywords() {
        return keywords;
    }

    public Label getLabel () {
        return label;
    }
}
