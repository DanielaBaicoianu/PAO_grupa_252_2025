package constants;

public class Constants {

    public static final String QUERY_GET_ALL_STUDENTS = "select * from lab9.student";

    public static final String QUERY_GET_ALL_STUDENTS_JOIN_UNIVERSITY = "SELECT * FROM lab9.student JOIN lab9.university ON student.universityId = university.universityId";

    public static final String QUERY_GET_STUDENT_JOIN_UNIVERSITY_BY_NAME
            = "SELECT * FROM lab9.student JOIN lab9.university ON student.universityId = university.universityId WHERE (student.firstName = ? AND student.lastName = ?)";

}
