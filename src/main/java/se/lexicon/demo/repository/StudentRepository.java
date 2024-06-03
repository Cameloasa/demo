package se.lexicon.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.demo.entity.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student, Long> {
}
