package model;

public class University {

    private String universityName;

    private String address;

    public University(String universityName, String address) {
        this.universityName = universityName;
        this.address = address;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
