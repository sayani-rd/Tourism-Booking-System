/*
 * Author Name: Sayani Raut Dessai
 * Roll No: 2647
 * Program: International Tour - Hierarchical
 */

/**
 * InternationalTour - Hierarchical Inheritance from TourPackage
 */
class InternationalTour extends TourPackage {

    /**
     * Constructor
     */
    InternationalTour() {
        package_name = "Dubai Trip";
        base_price = 60000;
        show_inclusion();
    }

    /**
     * Displays international tour details
     */
    @Override
    void display_details() {
        System.out.println("International Package: " + package_name + " | Price: Rs." + base_price);
    }

    /**
     * Shows visa info for international tour
     */
    void show_visa_info() {
        System.out.println("Visa is Included for " + package_name);
    }
}