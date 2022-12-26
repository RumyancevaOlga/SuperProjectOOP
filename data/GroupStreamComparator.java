package data;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream>{

    @Override
    public int compare(GroupStream groups1, GroupStream groups2) {
        if (groups1.getListStudentGroup().size() > groups1.getListStudentGroup().size()) return 1;
        else if (groups1.getListStudentGroup().size() < groups1.getListStudentGroup().size()) return -1;
        else return 0;
    }
    
}
