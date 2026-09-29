/*
 * Author Name: Sayani Raut Dessai
 * Roll No: 2647
 * Program: Domestic Tour - Single Inheritance
 */

/**
 * DomesticTour - Single Inheritance from TourPackage
 */
class DomesticTour extends TourPackage {

    /** total_duration stores duration like 3N/4D */
    String total_duration = "3N/4D";

    /**
     * Constructor - sets name and calls parent method
     */
    DomesticTour() {
        package_name = "Goa Beach Tour";
        base_price = 12000;
        show_inclusion();
    }

    /**
     * Displays domestic tour details
     */
    @Override
    void display_details() {
        System.out.println("Domestic Package: " + package_name + " | Price: Rs." + base_price);
    }

    /**
     * Shows duration of domestic tour
     */
    void show_duration() {
        System.out.println("Duration for " + package_name + " is " + total_duration);
    }
}