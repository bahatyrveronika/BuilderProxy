package ua.edu.ecu.apps.task2;

import java.time.LocalDate;

import lombok.Getter;
@Getter
public class Client {
    private static int counter;
    private int id = counter++;
    private String name;
    private LocalDate dob;
    private String sex;
    private String email;

    public Client(String name, LocalDate dob, String sex, String email) {
        this.name = name;
        this.dob = dob;
        this.sex = sex;
        this.email = email;
        
    }

    public String getName() {
        return this.name;
    }

}
