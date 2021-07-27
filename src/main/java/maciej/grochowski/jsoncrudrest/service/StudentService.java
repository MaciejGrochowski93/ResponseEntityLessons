package maciej.grochowski.jsoncrudrest.service;

import maciej.grochowski.jsoncrudrest.model.Student;
import maciej.grochowski.jsoncrudrest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student getStudentById(int id) {
        return repository.findById(id).orElseThrow(null);
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
