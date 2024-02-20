import java.util.Random;

interface sharedConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}
class Question implements sharedConstants {
    Random rand = new Random();
    int ask(){
        int prob = (int) (rand.nextDouble() * 100);
        if (prob < 30)
            return NO;
        else if (prob < 60)
            return YES;
        else if (prob < 75)
            return LATER;
        else if (prob < 98)
            return SOON;
        else
            return NEVER;
    }
}
class AskMe implements sharedConstants {
    static void answer (int result){
        switch (result){
            case NO:
                System.out.printf("no");
                break;
            case YES:
                System.out.printf("yes");
                break;
            case MAYBE:
                System.out.printf("maybe");
                break;
            case LATER:
                System.out.printf("later");
                break;
            case SOON:
                System.out.printf("soon");
                break;
            case NEVER:
                System.out.printf("never");
                break;
        }
    }
    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        System.out.println();
        answer(q.ask());
        System.out.println();
        answer(q.ask());
        System.out.println();

    }
}