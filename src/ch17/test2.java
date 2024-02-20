package ch17;

public class test2 {
    public static void main(String[] args) {
        String str = """
                text block with 
                multiple lines are easy now""";
        boolean yIsVowel = true;
        char ch = 'b';
        boolean isVowel = switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            case 'y', 'Y' -> {
                if (yIsVowel)
                    yield true;
                else
                    yield false;
            }
            default -> false;
        };
        if (isVowel) System.out.println(ch + " is a vowel");
        else System.out.println(ch + " is not a vowel");
        System.out.println(str);
    }
}
