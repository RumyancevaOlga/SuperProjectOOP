package comparators;

import java.util.Comparator;

import data.User;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        int compare = user1.getFio().compareTo(user2.getFio());
        if (compare < 0)
            return -1;
        else if (compare > 0)
            return 1;
        else
            return 0;
    }
}
