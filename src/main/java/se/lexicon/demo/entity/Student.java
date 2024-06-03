package se.lexicon.demo.entity;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "age")


public class Student {


    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
}
