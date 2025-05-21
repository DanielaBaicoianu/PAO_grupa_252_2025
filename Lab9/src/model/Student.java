package model;

public class Student {

    private University university;

    private String firstName;
    private String lastName;
    private String groupId;
    private String yearStart;

    public Student(University university, String firstName, String lastName, String groupId, String yearStart) {
        this.university = university;
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupId = groupId;
        this.yearStart = yearStart;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getYearStart() {
        return yearStart;
    }

    public void setYearStart(String yearStart) {
        this.yearStart = yearStart;
    }

    @Override
    public String toString() {
        return "Student{" +
                  university.toString() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupId='" + groupId + '\'' +
                ", yearStart='" + yearStart + '\'' +
                '}';
    }
}
