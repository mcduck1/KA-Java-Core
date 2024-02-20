package ex_4_4_9;

public class Thief implements MailService {
    int min;
    int stolenValue = 0;

    public Thief(int min) {
        this.min = min;
        this.stolenValue = 0;
    }

    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mp = (MailPackage) mail;
            Package pcg = mp.getContent();
            int price = pcg.getPrice();
            String content = pcg.getContent();
            if (price >= min) {
                stolenValue = stolenValue + price;
                Package newPackage = new Package("stones instead of " + content, 0);
                return new MailPackage(mp.getFrom(), mp.getTo(), newPackage);
            }
        }
        return mail;
    }

    public int getStolenValue() {
        return stolenValue;
    }
}