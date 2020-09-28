package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(0,"John Smith", 'M', LocalDate.of(1999,12,4),54));
        userList.add(new ForumUser(1,"Dorothy Newman", 'F', LocalDate.of(1995,6,23),145));
        userList.add(new ForumUser(2,"John Wolkowitz", 'M', LocalDate.of(1990,3,28), 0));
        userList.add(new ForumUser(3,"Lucy Riley",'F', LocalDate.of(1995,8,12), 28));
        userList.add(new ForumUser(4,"Owen Rogers", 'M',LocalDate.of(2000,11,8), 1));
        userList.add(new ForumUser(5,"Matilda Davies", 'F',LocalDate.of(2001,8,23),75));
        userList.add(new ForumUser(6,"Declan Booth", 'M', LocalDate.of(2002,5, 16), 63));
        userList.add(new ForumUser(7,"Corinne Foster", 'F',LocalDate.of(1993,8,3),34));
        userList.add(new ForumUser(8,"Khloe fry", 'M',LocalDate.of(1997,2,13), 43));
        userList.add(new ForumUser(9,"Martin Valenzuela", 'M', LocalDate.of(2004,7,21), 76));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
