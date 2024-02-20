package ex_4_4_9;

public class UntrustworthyMailWorker implements MailService {
    private MailService[] ms;
    private final RealMailService rms = new RealMailService();

    public UntrustworthyMailWorker(MailService[] ms) {
        this.ms = ms;
    }

    public RealMailService getRealMailService() {
        return rms;
    }

    public Sendable processMail(Sendable mail) {
        Sendable processed = mail;
        for (int i = 0; i < ms.length; i++) {
            processed = ms[i].processMail(processed);
        }
        return rms.processMail(processed);
    }
}


//    private final RealMailService rms = new RealMailService(); // class might be changed to interface
//    private MailService[] mailServices;
//
//    public UntrustworthyMailWorker (MailService[] mailServices) {
//        this.mailServices = mailServices;
//    }
//    public RealMailService getRealMailService() {
//        return rms;
//    }
//    public Sendable processMail(Sendable mail) {
//        Sendable processed = mail;
//        for (int i = 0; i < mailServices.length; i++) {
//            processed = mailServices[i].processMail(processed);
//        }
//        return rms.processMail(processed);
//    }
//}