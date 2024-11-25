package ua.edu.ecu.apps.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ua.edu.ecu.apps.task2.mailcode.MailCode;

@AllArgsConstructor @Getter
public class MailInfo {
    private Client client;
    private MailCode MailCode;

    public String generate() {
        return MailCode.generate(client);
    }
}
