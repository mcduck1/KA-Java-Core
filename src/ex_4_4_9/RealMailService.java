package ex_4_4_9;

public class RealMailService implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        return mail;
    }
}
