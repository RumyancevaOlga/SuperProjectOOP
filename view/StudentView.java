package view;

import java.util.List;

import dto.User;

public class StudentView extends UserView {

    @Override
    User findTheBest(List<User> userlist) {
        return userlist.get(0);
    }

}
