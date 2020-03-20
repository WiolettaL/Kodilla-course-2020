package com.kodilla.good.patterns.challenges.Allegro;

public class User {

    private String userName;
    private String userSurname;
    private String login;

    public User(String userName, String userSurname, String login) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.login = login;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (userSurname != null ? !userSurname.equals(user.userSurname) : user.userSurname != null) return false;
        return login.equals(user.login);
    }

    @Override
    public int hashCode() {
        return login.hashCode();
    }
}
