/*
 * Author: Sayani Raut dessai, Roll No: 2647
 * Program: User Module 
 */
/**
 * User class 
 */
class User {
    /** user_name stores name of user */
    String user_name;
    /** user_age stores age of user */
    int user_age;
    /**
     * Constructor for User
     * @param user_name name of user
     * @param user_age age of user
     */
    User(String user_name, int user_age) {
        this.user_name = user_name;
        this.user_age = user_age;
    }
    /**
     * Displays user details
     */
    void display_details() {
        System.out.println("User: " + user_name + " Age: " + user_age);
    }
}