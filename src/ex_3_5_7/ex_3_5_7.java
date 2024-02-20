package ex_3_5_7;
public class ex_3_5_7 {
    public static void main (String[] args) {

        String[] badWords = {"плохой", "отстой"};

        SpamAnalyzer spamA = new SpamAnalyzer(badWords);
        NegativeTextAnalyzer negativeTA = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tooLongTA = new TooLongTextAnalyzer(67);
        TextAnalyzer[] analyzers = {spamA, negativeTA, tooLongTA};
        System.out.println(checkLabels(analyzers, "Хороший текст для теста.")); //ok
        System.out.println(checkLabels(analyzers, "Плохой текст для теста, так как это :( ужас.")); //negative
        System.out.println(checkLabels(analyzers, "Плохой текст для теста, полный отстой.")); //spam
        System.out.println(checkLabels(analyzers, "И это все, что вы хотели написать в комментариях. Да ну, вообще..."));
    }
    public static TextAnalyzer.Label checkLabels(TextAnalyzer[] analyzers, String text) {
        TextAnalyzer.Label label;
        for (TextAnalyzer analyzer : analyzers) {
            label = analyzer.processText(text);
            if (label != TextAnalyzer.Label.OK) {
                return label;
            }
        }
        return TextAnalyzer.Label.OK;
    }
}
