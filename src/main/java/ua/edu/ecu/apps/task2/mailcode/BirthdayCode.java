package ua.edu.ecu.apps.task2.mailcode;

import ua.edu.ecu.apps.task2.Client;

public class BirthdayCode implements MailCode {
    @Override
    public String generate(Client client) {
        return String.format("Dear %s! Happy Birthday!", client.getName());
    }
}
