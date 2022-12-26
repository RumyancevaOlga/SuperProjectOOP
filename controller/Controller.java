package controller;

import java.util.List;

import data.StudentGroup;
import service.GroupStreamServiceImpl;
import service.StudentGroupServiceImpl;

public class Controller {
    private List<StudentGroupServiceImpl> studentGroupServiceImpls;

    public StudentGroup createStudentGroup(int groupNumber) {
        StudentGroupServiceImpl studentGroupServiceImpl = new StudentGroupServiceImpl();
        for (int i = 0; i < studentGroupServiceImpls.size(); i++) {
            if(groupNumber == studentGroupServiceImpls.get(i).getStudentGroup().getStudents().get(0).getGroupNumber())
            {
                studentGroupServiceImpl = studentGroupServiceImpls.get(i);
            }
        }
        return studentGroupServiceImpl.getStudentGroup();
    }

    public void removeStudent (String FIO) {
        for (int i = 0; i < studentGroupServiceImpls.size(); i++) {
            studentGroupServiceImpls.get(i).removeStudent(FIO);
        }
    }

    public void sortGroupStream (GroupStreamServiceImpl groupStreamServiceImpl) {
        sortGroupStream(groupStreamServiceImpl);
    }
}
