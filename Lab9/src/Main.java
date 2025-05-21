import config.DatabaseConfiguration;
import repository.StudentRepository;
import service.StudentService;
import service.impl.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {
        DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration();
        StudentRepository studentRepository = new StudentRepository(databaseConfiguration);
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.setStudentRepository(studentRepository);

        System.out.println(studentService.getAllStudents());

        System.out.println(studentService.getStudentsByName("Andreea", "Panait"));




    }
}