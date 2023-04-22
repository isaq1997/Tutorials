package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return  args -> {
          Student mathew=new Student(
                  "Matthew",
                  "Mathew@gmail.com",
                  LocalDate.of(2000, Month.MARCH,11)

          );
            Student logan=new Student(
                    "Logan",
                    "Logan@gmail.com",
                    LocalDate.of(2000, Month.MARCH,11)


            );
            Student bruce=new Student(
                    "Bruce",
                    "Bruce@gmail.com",
                    LocalDate.of(2010, Month.APRIL,4)


            );
            repository.saveAll(List.of(mathew,logan,bruce));

        };

    }
}
