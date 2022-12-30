package data;

public class Teacher extends User {
    private String department;

    public Teacher(String fio, int birthday, int passport, String department) {
        super(fio, birthday, passport);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
