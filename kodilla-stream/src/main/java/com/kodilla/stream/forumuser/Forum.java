package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Annie Pear", 'F', 1987, 5, 12, 23));
        userList.add(new ForumUser(2, "India Street", 'F', 1976, 1, 22, 111));
        userList.add(new ForumUser(3, "Adam Major", 'M', 1980, 3, 16, 324));
        userList.add(new ForumUser(4, "Elizabeth Stan", 'F', 1991, 6, 1, 67));
        userList.add(new ForumUser(5, "Dominique Chat", 'M', 1981, 2, 23, 19));
        userList.add(new ForumUser(6, "Jacob Painter", 'M', 1990, 8, 18, 223));
        userList.add(new ForumUser(7, "Elvis Precel", 'M', 1988, 2, 3, 143));
    }

        public List<ForumUser> getUserList() {
            return new ArrayList<>(userList);
        }

    }



