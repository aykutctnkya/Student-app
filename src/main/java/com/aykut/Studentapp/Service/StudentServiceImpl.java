package com.aykut.Studentapp.Service;

import com.aykut.Studentapp.Dao.StudentRepository;
import com.aykut.Studentapp.Entity.Student;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }
    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public Student deleteStudentById(Long id) {
        studentRepository.deleteById(id);
        return null;
    }
}
