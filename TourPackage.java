/*
 * Author Name: Sayani Raut Dessai
 * Roll No: 2647
 * Program: TourPackage Base
 */

/**
 * TourPackage - Base class for all packages
 */
class TourPackage {

    /** package_name stores name of tour package */
    String package_name = "Generic Tour";

    /** base_price stores base price of package */
    double base_price = 10000;

    /**
     * Displays package details
     */
    void display_details() {
        System.out.println("Package: " + package_name + " | Price: Rs." + base_price);
    }

    /**
     * Shows what is included
     */
    void show_inclusion() {
        System.out.println("Includes basic stay for " + package_name);
    }
}