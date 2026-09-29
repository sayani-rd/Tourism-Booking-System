/*
 * Author: Sayani Raut dessai, Roll No: 2647
 * Program: Customer Module
 */

/**
 * Customer class 
 */
class Customer extends User {
    /** customer_id stores unique id of customer */
    String customer_id;

    /**
     * Constructor
     * @param user_name name
     * @param user_age age
     * @param customer_id id of customer
     */
    Customer(String user_name, int user_age, String customer_id) {
        super(user_name, user_age);
        this.customer_id = customer_id;
    }

    /** Displays customer welcome message */
    @Override
    void display_details() {
        System.out.println("\nWelcome Customer " + user_name + " | Your ID is " + customer_id);
    }
}