/*
 * Author Name: Sayani Raut Dessai
 * Roll No: 2647
 * Program: Tourism Booking System with All 5 Inheritance
 */

import java.util.Scanner;

/**
 * Main class - Entry point of Tourism Booking System
 * Shows menu for all 5 inheritance types
 */
public class TourismBookingSystem {

    /** sc_obj is scanner object to take input from user */
    static Scanner sc_obj = new Scanner(System.in);

    /**
     * Displays introduction message about program purpose
     */
    static void display_introduction() {
        System.out.println(" TOURISM BOOKING SYSTEM - INHERITANCE DEMO\n");
    }

    /**
     * Prints main menu options
     */
    static void print_menu() {
        System.out.println("\n TOURISM SYSTEM - INHERITANCE DEMO MENU\n");
        System.out.println("1. Single Inheritance       (TourPackage -> DomesticTour)");
        System.out.println("2. Multilevel Inheritance    (TourPackage -> DomesticTour -> AdventureTour)");
        System.out.println("3. Hierarchical Inheritance  (TourPackage -> DomesticTour / InternationalTour)");
        System.out.println("4. Multiple Inheritance      (interfaces: Payable, Billable)");
        System.out.println("5. Hybrid Inheritance        (TourPackage -> FinalBill implements Payable, Billable)");
        System.out.println("6. Run All Demos + Booking Simulation");
        System.out.println("0. Exit Program");
        System.out.print("Enter your choice: ");
    }

    /**
     * Reads user choice safely
     * @return choice entered by user
     */
    static int read_choice() {
        while (!sc_obj.hasNextInt()) {
            System.out.print("Please enter a number: ");
            sc_obj.next();
        }
        int val = sc_obj.nextInt();
        sc_obj.nextLine();
        return val;
    }

    /**
     * Demo for Single Inheritance
     */
    static void demo_single() {
        System.out.println(" Single Inheritance: TourPackage -> DomesticTour ");
        DomesticTour d = new DomesticTour();
        d.display_details();
        d.show_duration();
    }

    /**
     * Demo for Multilevel Inheritance
     */
    static void demo_multilevel() {
        System.out.println(" Multilevel Inheritance: TourPackage -> DomesticTour -> AdventureTour ");
        AdventureTour a = new AdventureTour();
        a.display_details();
        a.show_duration();
        a.show_activity();
    }

    /**
     * Demo for Hierarchical Inheritance
     */
    static void demo_hierarchical() {
        System.out.println(" Hierarchical Inheritance: TourPackage -> DomesticTour / InternationalTour ");
        DomesticTour d = new DomesticTour();
        d.display_details();
        d.show_duration();

        System.out.println();

        InternationalTour i = new InternationalTour();
        i.display_details();
        i.show_visa_info();
    }

    /**
     * Demo for Multiple Inheritance
     */
    static void demo_multiple() {
        System.out.println(" Multiple Inheritance via Interfaces: Payable, Billable ");
        Payment p = new Payment(25000);
        p.make_payment();
        p.generate_bill();
    }

    /**
     * Demo for Hybrid Inheritance
     */
    static void demo_hybrid() {
        System.out.println(" Hybrid Inheritance: TourPackage -> FinalBill implements Payable, Billable ");
        FinalBill fb = new FinalBill("Goa Special", 15000);
        fb.display_details();
        fb.make_payment();
        fb.generate_bill();
        fb.show_discount();
    }

    /**
     * Demo for All + Booking flow
     */
    static void demo_all_booking() {
        System.out.println(" Complete Tourism Booking Flow ");
        DomesticTour pkg = new DomesticTour();
        pkg.display_details();

        StandardHotel h = new StandardHotel();
        h.display_details();

        BusTransport t = new BusTransport();
        t.display_details();

        double total = pkg.base_price + h.hotel_price + t.travel_fare;
        FinalBill bill = new FinalBill(pkg.package_name, total);
        bill.make_payment();
        bill.generate_bill();
        System.out.println("Booking Confirmed for " + pkg.package_name);
    }

    /**
     * Main method - menu driven program to demo all 5 inheritance types
     * @param args command line arguments
     */
    public static void main(String[] args) {
        display_introduction();
        int choice = -1;
        do {
            print_menu();
            choice = read_choice();
            System.out.println();

            switch (choice) {
                case 1:
                    demo_single();
                    break;
                case 2:
                    demo_multilevel();
                    break;
                case 3:
                    demo_hierarchical();
                    break;
                case 4:
                    demo_multiple();
                    break;
                case 5:
                    demo_hybrid();
                    break;
                case 6:
                    demo_single();
                    System.out.println();
                    demo_multilevel();
                    System.out.println();
                    demo_hierarchical();
                    System.out.println();
                    demo_multiple();
                    System.out.println();
                    demo_hybrid();
                    System.out.println();
                    demo_all_booking();
                    break;
                case 0:
                    System.out.println("Thank you for using Tourism Booking System. Visit Again!");
                    break;
                default:
                    System.out.println("You have entered an invalid value for main_choice. Kindly enter a value between 0 and 6");
            }
            System.out.println();
        } while (choice != 0);

        sc_obj.close();
    }
}