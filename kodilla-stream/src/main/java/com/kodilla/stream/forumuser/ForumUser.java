package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userNumber;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int publishedPosts;

    public ForumUser(final int userNumber, final String userName, final char userSex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int publishedPosts) {
        this.userNumber = userNumber;
        this.userName = userName;
        this.sex = userSex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.publishedPosts = publishedPosts;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        return dateOfBirth.equals(forumUser.dateOfBirth);
    }

    @Override
    public int hashCode() {
        int result = userNumber;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (int) sex;
        result = 31 * result + dateOfBirth.hashCode();
        result = 31 * result + publishedPosts;
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userIdentificator=" + userNumber +
                ", userName='" + userName + '\'' +
                ", userSex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}
