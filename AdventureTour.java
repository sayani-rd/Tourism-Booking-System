/*
 * Author Name: Sayani Raut Dessai
 * Roll No: 2647
 * Program: Adventure Tour - Multilevel Inheritance
 */

/**
 * AdventureTour - Multilevel Inheritance: TourPackage -> DomesticTour -> AdventureTour
 */
class AdventureTour extends DomesticTour {

    /** activity_name stores adventure activity like Trekking */
    String activity_name = "Trekking";

    /**
     * Constructor
     */
    AdventureTour() {
        package_name = "Manali Adventure";
        base_price = 20000;
        total_duration = "4N/5D";
        show_inclusion();
    }

    /**
     * Displays adventure details
     */
    @Override
    void display_details() {
        System.out.println("Adventure Package: " + package_name + " | Price: Rs." + base_price + " | Duration: " + total_duration);
    }

    /**
     * Shows special activity for adventure
     */
    void show_activity() {
        System.out.println("Special Activity for " + package_name + " is " + activity_name);
    }
}