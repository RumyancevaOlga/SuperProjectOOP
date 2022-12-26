package service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import data.Student;
import data.StudentGroup;
import data.UserComparator;
import util.ReaderFromTxt;

public class StudentGroupServiceImpl implements StudentGroupService{

    @Override
    public StudentGroup getStudentGroup() {
        StudentGroup studentGroup = new StudentGroup(ReaderFromTxt.readTeacher(), ReaderFromTxt.readStudents());
        return studentGroup;
    }

    public void removeStudent(String FIO) {
        for (int i = 0; i < getStudentGroup().getStudents().size(); i++) {
            if (FIO.equals(getStudentGroup().getStudents().get(i).getFIO())) {
                this.getStudentGroup().getStudents().remove(i);
            }
        }
    }

    public void sortStudents(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudents());
    }

    public void sortStudentsToFIO(List<Student> students) {
        Collections.sort(students, new UserComparator());
    //     Collections.sort(students, new Comparator<Student>() {
    //         public int compare(Student student1, Student student2) {
    //             return student1.getFIO().compareTo(student2.getFIO());
    //         }
    //    }); 
    }
}
