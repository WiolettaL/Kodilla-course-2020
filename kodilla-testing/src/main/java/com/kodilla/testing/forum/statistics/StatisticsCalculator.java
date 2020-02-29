package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private int forumUsersCount;
    private int forumPostsCount;
    private int forumCommentsCount;
    private double avgUsersPosts;
    private double avgUsersComments;
    private double avgCommentsPerPosts;

    public int getForumUsersCount() {
        return forumUsersCount;
    }

    public int getForumPostsCount() {
        return forumPostsCount;
    }

    public int getForumCommentsCount() {
        return forumCommentsCount;
    }

    public double getAvgUsersPosts() {
        return avgUsersPosts;
    }

    public double getAvgUsersComments() {
        return avgUsersComments;
    }

    public double getAvgCommentsPerPosts() {
        return avgCommentsPerPosts;
    }

    public void calculateAdvStatistics(Statistics statistics){
        forumUsersCount = statistics.usersName().size();
        forumPostsCount = statistics.postsCount();
        forumCommentsCount = statistics.commentsCount();
        avgUsersPosts = calculateAvgUsersPosts();
        avgUsersComments = calculateAvgUsersComments();
        avgCommentsPerPosts = calculateAvgCommentsPerPost();
    }

    private int calculateAvgUsersPosts() {
        if(forumUsersCount > 0){
            return forumPostsCount/forumUsersCount;
        } else {
            return 0;
        }
    }

    private double calculateAvgUsersComments(){
        if(forumUsersCount > 0){
            return (double)forumCommentsCount/forumUsersCount;
        } else {
            return 0;
        }
    }

    private double calculateAvgCommentsPerPost(){
        if(forumPostsCount > 0){
            return (double)forumCommentsCount/forumPostsCount;
        } else {
            return 0;
        }
    }

    public void showStatistics(){
        System.out.println("Forum statistics:\nUsers in forum: " + forumUsersCount);
        System.out.println("Posts: " + forumPostsCount);
        System.out.println("Comments: " + forumCommentsCount);
        System.out.println("Average User posts: " + avgUsersPosts);
        System.out.println("Average User comments: " + avgUsersComments);
        System.out.println("Average comments per post: " + avgCommentsPerPosts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatisticsCalculator that = (StatisticsCalculator) o;

        return forumUsersCount == that.forumUsersCount;
    }

    @Override
    public int hashCode() {
        return forumUsersCount;
    }
}
