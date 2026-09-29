/*
 * Author Name: Sayani Raut Dessai
 * Roll No: 2647
 * Program: Hotel Module - Hierarchical
 */

/**
 * Hotel - Parent for Hierarchical Inheritance
 */
class Hotel {

    /** hotel_type stores type like Standard or Deluxe */
    String hotel_type = "Generic Hotel";

    /** hotel_price stores price per night */
    double hotel_price = 2000;

    /**
     * Displays hotel details
     */
    void display_details() {
        System.out.println("Hotel: " + hotel_type + " | Price: Rs." + hotel_price);
    }
}

/**
 * StandardHotel - Child of Hotel
 */
class StandardHotel extends Hotel {

    /**
     * Constructor
     */
    StandardHotel() {
        hotel_type = "Standard Hotel";
        hotel_price = 2000;
    }
}

/**
 * DeluxeHotel - Child of Hotel
 */
class DeluxeHotel extends Hotel {

    /**
     * Constructor
     */
    DeluxeHotel() {
        hotel_type = "Deluxe Hotel";
        hotel_price = 5000;
    }
}