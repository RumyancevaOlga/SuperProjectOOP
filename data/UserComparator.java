package data;

import java.util.Comparator;

public class UserComparator implements Comparator<User>{

    @Override
    public int compare(User user1, User user2) {
        int compare = user1.getFIO().compareTo(user2.getFIO());
        if (compare < 0) return -1;
        else if (compare > 0) return 1;
        else return 0;
    }
}
