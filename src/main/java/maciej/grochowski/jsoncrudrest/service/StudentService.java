package maciej.grochowski.jsoncrudrest.service;

import maciej.grochowski.jsoncrudrest.excepction.StudentNotFoundException;
import maciej.grochowski.jsoncrudrest.model.Student;
import maciej.grochowski.jsoncrudrest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

//    private Map<Integer, Student> secondRepository = Arrays.asList(
//            new Student[]{
//                    new Student(1, "Maciej", "Grochowski", 2213),
//                    new Student(2, "Maciej", "Maciejewski", 3232),
//                    new Student(3, "Andrzej", "Andrzejewski", 4543)
//            }).stream()
//            .collect(Collectors.toConcurrentMap(student -> student.getID(), Function.identity()));

    public Optional<Student> getStudentById(int id)  {
        return repository.findById(id);
    }

    public Student addStudent(Student student) {
        return repository.save(student);
    }

    public Student updateStudent(Student student, int id) {
        return repository.save(student);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
