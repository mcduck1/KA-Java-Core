package ex_4_4_9_1;

import ex_4_4_9.MailMessage;
import ex_4_4_9.MailService;
import ex_4_4_9.Sendable;

import java.util.logging.Logger;

public class Spy implements MailService {

    private Logger LOGGER;

    public Spy(Logger logger) {
        LOGGER = logger;

    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() == MailMessage.class) {
            MailMessage mailMessage = (MailMessage) mail;
            String from = mailMessage.getFrom();
            String to = mailMessage.getTo();
            if (from.equals("Austin Powers") || to.equals("Austin Powers")) {
                LOGGER.warning("Detected target mail correspondence: from " + from + " to " + to + " \"" + mailMessage.getMessage() + "\"");

            } else {
                LOGGER.info("Usual correspondence: from " + from + " to " + to + "");

            }

        }
        return mail;

    }

}
