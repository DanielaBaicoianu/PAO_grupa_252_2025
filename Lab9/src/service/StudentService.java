package service;

import model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    List<Student> getStudentsByName(String firstName, String lastName);

}
