/*
 * Author: Sayani Raut dessai, Roll No: 2647
 * Program: Admin Module
 */
/**
 * Admin class 
 */
class Admin extends User {
    /** admin_id stores id of admin */
    String admin_id;

    /**
     * Constructor
     * @param user_name name
     * @param user_age age
     * @param admin_id id of admin
     */
    Admin(String user_name, int user_age, String admin_id) {
        super(user_name, user_age);
        this.admin_id = admin_id;
    }

    /** Displays admin login message */
    @Override
    void display_details() {
        System.out.println("\nAdmin Login Successful. Name: " + user_name);
    }
}