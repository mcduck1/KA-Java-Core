package ex_4_4_9;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {
    Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            MailMessage message = (MailMessage) mail;
            String from = message.getFrom();
            String to = message.getTo();
            String messageContent = message.getMessage();
            if (from.equals("Austin Powers") || to.equals("Austin Powers")) {
                logger.log(Level.WARNING, "Detected target mail correspondence: from " + from + " to " + to + " \"" + messageContent + "\"");
            } else {
                logger.log(Level.INFO, "Usual correspondence: from " + from + " to " + to);
            }
        }
        return mail;
    }
}