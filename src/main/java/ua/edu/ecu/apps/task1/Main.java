package ua.edu.ecu.apps.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student student = Student.builder()
                .firstName("Oles")
                .lastName("Dobosevych")
                .age(33)
                .grades(Arrays.asList(175, 120, 165))
                .height(175)
                .group("PCS")
                .build();
        System.out.println(student.getFirstName());
    }
}
