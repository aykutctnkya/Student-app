package com.aykut.Studentapp.Controller;

import com.aykut.Studentapp.Entity.Student;
import com.aykut.Studentapp.Service.StudentService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }
    @GetMapping("/list")
    public List<Student> getAllStudents() {

        return studentService.getAllStudents();
    }
    @PostMapping("/add")
    @PreAuthorize("hasRole('Admin')")
    public Student saveStudent(@RequestBody Student student) {

        return studentService.saveStudent(student);
    }
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasRole('Admin')")
    public Student  deleteStudent(@PathVariable Long id) {

        return studentService.deleteStudentById(id);
    }
    @PostMapping("/edit/{id}")
    @PreAuthorize("hasRole('Admin')")
    public Student updateStudent(@PathVariable Long id,@RequestBody Student student) {

        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        return studentService.updateStudent(existingStudent);
    }
}
