package com.example.demo.Student;




import java.time.LocalDate;

public class Student {
    private Long id;
    private  String name;
    private String email;
    private LocalDate dob;
    private Integer age;


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
