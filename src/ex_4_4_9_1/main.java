package ex_4_4_9_1;

import ex_4_4_9.*;
import ex_4_4_9.Package;

import java.util.logging.Logger;

public class main {
    public static void main(String[] args) {
        MailService spy = new Spy(Logger.getLogger(Class.class.getName()));
        MailService thief = new Thief(10);
        MailService inspector = new Inspector();
        MailService[] msArray = {spy, thief, inspector};
        MailMessage mail1 = new MailMessage("Romeo", "Juliet", "I love you!");
        MailMessage mail2 = new MailMessage("Austin Powers", "James Bond", "Big secret!");
        MailPackage mail3 = new MailPackage("Romeo", "Juliet", new ex_4_4_9.Package("Flowers", 15));
        MailPackage mail4 = new MailPackage("Romeo", "Juliet", new ex_4_4_9.Package("Flowers", 25));
        MailPackage mail5 = new MailPackage("Austin Powers", "James Bond", new Package("weapons", 5));
        UntrustworthyMailWorker umw = new UntrustworthyMailWorker(msArray);
        try {
            umw.processMail(mail1);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            umw.processMail(mail2);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            umw.processMail(mail3);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            umw.processMail(mail4);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        try {
            umw.processMail(mail5);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        System.out.println("Thief have stolen $" + ((Thief) thief).getStolenValue() + "!");
    }
}

/*

2) Spy – шпион, который логгирует о всей почтовой переписке, которая проходит через его руки. Объект конструируется

от экземпляра Logger, с помощью которого шпион будет сообщать о всех действиях. Он следит только за объектами класса

MailMessage и пишет в логгер следующие сообщения (в выражениях нужно заменить части в фигурных скобках на значения

полей почты):

2.1) Если в качестве отправителя или получателя указан "Austin Powers", то нужно написать в лог сообщение с

уровнем WARN: Detected target mail correspondence: from {from} to {to} "{message}"

2.2) Иначе, необходимо написать в лог сообщение с уровнем INFO: Usual correspondence: from {from} to {to}

*/

/*

3) Thief – вор, который ворует самые ценные посылки и игнорирует все остальное. Вор принимает в конструкторе

переменную int – минимальную стоимость посылки, которую он будет воровать. Также, в данном классе должен

присутствовать метод getStolenValue, который возвращает суммарную стоимость всех посылок, которые он своровал.

Воровство происходит следующим образом: вместо посылки, которая пришла вору, он отдает новую, такую же, только с

нулевой ценностью и содержимым посылки "stones instead of {content}".

*/

/*

4) Inspector – Инспектор, который следит за запрещенными и украденными посылками и бьет тревогу в виде исключения,

если была обнаружена подобная посылка. Если он заметил запрещенную посылку с одним из запрещенных содержимым

("weapons" и "banned substance"), то он бросает IllegalPackageException. Если он находит посылку, состаящую из

камней (содержит слово "stones"), то тревога прозвучит в виде StolenPackageException. Оба исключения вы должны

объявить самостоятельно в виде непроверяемых исключений.

*/



