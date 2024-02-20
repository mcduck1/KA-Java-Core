package ex_4_4_9;

class IllegalPackageException extends RuntimeException {
}

class StolenPackageException extends RuntimeException {
}

public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mp = (MailPackage) mail;
            Package pcg = mp.getContent();
            String illegal = pcg.getContent();
            if (illegal.contains("weapons") || illegal.contains("banned substance")) {
                throw new IllegalPackageException();
            }
            if (illegal.contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
