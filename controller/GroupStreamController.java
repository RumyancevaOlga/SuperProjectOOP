package controller;

import data.GroupStream;
import service.GroupStreamServiceImpl;

public class GroupStreamController implements InterfaceController<GroupStream, Integer> {

    private final GroupStreamServiceImpl groupStreamServiceImpl;

    public GroupStreamController(GroupStreamServiceImpl groupStreamServiceImpl) {
        this.groupStreamServiceImpl = groupStreamServiceImpl;
    }

    @Override
    public GroupStream save(GroupStream groupStream) {
        return groupStreamServiceImpl.saveGroupStream(groupStream);
    }

    @Override
    public GroupStream find(Integer id) {
        return groupStreamServiceImpl.findGroupStreamById(id);
    }

}
