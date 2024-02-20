package ex_3_5_7;

public class SpamAnalyzer extends KeywordAnalyzer {
    // change back public to private
    public String[] keywords;
    public Label label;

    public SpamAnalyzer(String [] keywords) {
        this.keywords = keywords;
        label = Label.SPAM;
    }

    // change back public to protected
    protected String[] getKeywords() {
        return keywords;
    }
    // change back public to protected
    protected Label getLabel () {
        return label;
    }
}