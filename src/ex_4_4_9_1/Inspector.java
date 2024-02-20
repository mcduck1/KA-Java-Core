package ex_4_4_9_1;

import ex_4_4_9.MailPackage;
import ex_4_4_9.MailService;
import ex_4_4_9.Package;
import ex_4_4_9.Sendable;

public class Inspector implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() == MailPackage.class) {
            Package pac = ((MailPackage) mail).getContent();
            String content = pac.getContent();
            if (content.indexOf("stones instead of ") == 0) {
                throw new StolenPackageException();

            } else if (content.equals("weapons") || content.equals("banned substance")) {
                throw new IllegalPackageException();

            }

        }
        return mail;

    }

}
