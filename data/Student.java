package data;

public class Student extends User implements Comparable<Student> {
    private int groupNumber;

    public Student(String FIO, int birthday, int passport, int groupNumber) {
        super(FIO, birthday, passport);
        this.groupNumber = groupNumber;
    }
    
    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public int compareTo(Student student) {
        if(student.getBirthday() < this.getBirthday()) return 1;
        if(student.getBirthday() > this.getBirthday()) return -1;
        return 0;
    }

}
