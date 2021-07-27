package maciej.grochowski.jsoncrudrest.repository;

import maciej.grochowski.jsoncrudrest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
