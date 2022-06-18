package za.ac.cput.school_management.service.student.impl;
/*
 * @author Adecel Rusty Mabiala
 * @StudentNumber 219197229
 * @Project Term-2
 * @Group 31
 * @Role Team Leader and Developer
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.factory.student.StudentFactory;
import za.ac.cput.school_management.repository.student.StudentRepository;
import za.ac.cput.school_management.service.student.StudentService;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;

    @Autowired
    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student student) {
        Student saves = StudentFactory
                .build(student.getStudentId(), student.getEmail(),
                        student.getName());
        System.out.println("Inserted" + saves);
        return this.repository.save(saves);
    }

    @Override
    public Optional<Student> read(String studentId) {
        return this.repository.findById(studentId);
    }

    @Override
    public void delete(Student student) {
        this.repository.delete(student);
    }

    @Override
    public List<Student> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<Student> findByStudentId(String studentId) {
        return this.repository.findByStudentId(studentId);
    }

    @Override
    public void deleteById(String studentId) {
        Optional<Student> student = read(studentId);
        if (student.isPresent())
            delete(student.get());
    }

    @Override
    public Optional<Student> findByEmail(String email) {
        return this.repository.findByEmail(email);
    }

}
