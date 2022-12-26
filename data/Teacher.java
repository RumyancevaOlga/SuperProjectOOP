package data;

public class Teacher extends User {
    private String department;

    public Teacher(String FIO, int birthday, int passport, String department) {
        super(FIO, birthday, passport);
        this.department = department;
    }
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
