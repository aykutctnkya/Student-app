package com.aykut.Studentapp.Service;

import com.aykut.Studentapp.Entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    Student deleteStudentById(Long id);
}
