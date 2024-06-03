package se.lexicon.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.lexicon.demo.entity.Student;
import se.lexicon.demo.repository.StudentRepository;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class MyCommandLineRunner {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student Joe = new Student(
                    "Joe Doe",
                    "joedoe@test.com",
                    LocalDate.of(2020,1,1),
                    24);


            Student Mariam = new Student(
                    "Mariam Done",
                    "mariamdone@test.com",
                    LocalDate.of(2019,2,2),
                    25);


            repository.saveAll(List.of(Joe, Mariam));
        };


    }

}
