package repository;

import config.DatabaseConfiguration;
import model.Student;
import model.University;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static constants.Constants.*;

public class StudentRepository {

    private final DatabaseConfiguration databaseConfiguration;

    public StudentRepository(DatabaseConfiguration databaseCon) {
        databaseConfiguration = databaseCon;
    }


    public List<Student> getAllStudents() throws SQLException {
        Statement statement = databaseConfiguration.getConnection().createStatement();
        List<Student> students = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL_STUDENTS_JOIN_UNIVERSITY);
        while (resultSet.next()) {
            University university = new University(resultSet.getString("universityName"), resultSet.getString("address"));
            Student student = new Student(university, resultSet.getString("firstName"),
                    resultSet.getString("lastName"),
                    resultSet.getString("groupId"),
                    resultSet.getString("yearStart"));
            students.add(student);
        }
        return students;
    }



    public List<Student> getStudentsByName(String firstName, String lastName) throws SQLException {
        PreparedStatement preparedStatement = databaseConfiguration.getConnection().prepareStatement(QUERY_GET_STUDENT_JOIN_UNIVERSITY_BY_NAME);
        preparedStatement.setString(1 , firstName);
        preparedStatement.setString(2 , lastName);
        List<Student> students = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            University university = new University(resultSet.getString("universityName"), resultSet.getString("address"));
            Student student = new Student(university, resultSet.getString("firstName"),
                    resultSet.getString("lastName"),
                    resultSet.getString("groupId"),
                    resultSet.getString("yearStart"));
            students.add(student);
        }
        return students;
    }


}
