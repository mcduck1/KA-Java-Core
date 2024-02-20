package ex_4_4_9_1;

import ex_4_4_9.MailService;
import ex_4_4_9.RealMailService;
import ex_4_4_9.Sendable;

public class UntrustworthyMailWorker implements MailService {

    private final MailService realMailService = new RealMailService();

    private MailService[] mailServices;

    public UntrustworthyMailWorker(MailService[] services) {
        mailServices = services;

    }

    public MailService getRealMailService() {
        return realMailService;

    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable processed = mail;
        for (int i = 0; i < mailServices.length; i++) {
            processed = mailServices[i].processMail(processed);

        }
        return realMailService.processMail(mail);

    }

}
