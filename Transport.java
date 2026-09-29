/*
 * Author Name: Sayani Raut Dessai
 * Roll No: 2647
 * Program: Transport Module - Hierarchical
 */

/**
 * Transport - Parent for Hierarchical Inheritance
 */
class Transport {

    /** travel_type stores type like Bus or Flight */
    String travel_type = "Bus";

    /** travel_fare stores fare of transport */
    double travel_fare = 1000;

    /**
     * Displays transport details
     */
    void display_details() {
        System.out.println("Transport: " + travel_type + " | Fare: Rs." + travel_fare);
    }
}

/**
 * BusTransport - Child of Transport
 */
class BusTransport extends Transport {

    /**
     * Constructor
     */
    BusTransport() {
        travel_type = "Bus";
        travel_fare = 1000;
    }
}

/**
 * FlightTransport - Child of Transport
 */
class FlightTransport extends Transport {

    /**
     * Constructor
     */
    FlightTransport() {
        travel_type = "Flight";
        travel_fare = 8000;
    }
}