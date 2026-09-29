/*
 * Author: Sayani Raut dessai, Roll No: 2647
 * Program: Booking Record - For Admin to see who booked what
 */

/**
 * BookingRecord - Stores who booked what
 */
class BookingRecord {
    /** customer_name stores name of customer who booked */
    String customer_name;

    /** package_name stores name of booked package */
    String package_name;

    /** hotel_type stores hotel booked */
    String hotel_type;

    /** transport_type stores transport booked */
    String transport_type;

    /** total_amount stores total paid amount */
    double total_amount;

    /**
     * Constructor for BookingRecord
     * @param customer_name name of customer
     * @param package_name package name
     * @param hotel_type hotel type
     * @param transport_type transport type
     * @param total_amount total amount
     */
    BookingRecord(String customer_name, String package_name, String hotel_type, String transport_type, double total_amount) {
        this.customer_name = customer_name;
        this.package_name = package_name;
        this.hotel_type = hotel_type;
        this.transport_type = transport_type;
        this.total_amount = total_amount;
    }

    /** Displays booking record details */
    void display_details() {
        System.out.println("Customer: " + customer_name + " | Package: " + package_name);
        System.out.println("Hotel: " + hotel_type + " | Transport: " + transport_type + " | Paid: Rs." + total_amount);
    }
}