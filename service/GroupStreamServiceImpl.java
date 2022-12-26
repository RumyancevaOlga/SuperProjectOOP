package service;

import java.util.Collections;
import java.util.List;

import data.GroupStream;
import data.GroupStreamComparator;

public class GroupStreamServiceImpl {
    private List<GroupStream> groupStreams;

    public void sortGroupStream (List<GroupStream> groupStreams) {
        Collections.sort(groupStreams, new GroupStreamComparator());
    } 
}
