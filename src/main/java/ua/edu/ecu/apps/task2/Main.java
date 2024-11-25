package ua.edu.ecu.apps.task2;
import java.time.LocalDate;

import ua.edu.ecu.apps.task2.mailcode.BirthdayCode;
import ua.edu.ecu.apps.task2.mailcode.MailCode;


public class Main {

    public static void main(String[] args) {
        Client client = new Client("Ілюшичка Широков", LocalDate.of(1990, 5, 15), "Male", "twix.play.com@gmail.com");

        MailCode mailCode;
        mailCode = new BirthdayCode();

        MailInfo mailInfo = new MailInfo(client, mailCode);

        MailSender mailSender = new MailSender("nikabagatyr3005@gmail.com", "neeivgvoqhcfiiey");
        mailSender.sendMail(mailInfo);
    }
}
