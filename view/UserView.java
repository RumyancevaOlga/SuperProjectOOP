package view;

import java.util.List;
import data.User;

public abstract class UserView {
    abstract User findTheBest(List<User> userlist);

    public void showTheBest(List<User> userList) {
        System.out.println(findTheBest(userList));
    }
}
