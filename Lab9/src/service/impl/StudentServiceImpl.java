package service.impl;

import model.Student;
import repository.StudentRepository;
import service.StudentService;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public void setStudentRepository(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        try {
            return studentRepository.getAllStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
        return null;
    }

    @Override
    public List<Student> getStudentsByName(String firstName, String lastName) {
        try {
            return studentRepository.getStudentsByName(firstName, lastName);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return  null;
    }
}
