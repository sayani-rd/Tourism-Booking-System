/*
 * Author Name: Sayani Raut Dessai
 * Roll No: 2647
 * Program: Payment - Multiple Inheritance via Interfaces + Hybrid
 */

/**
 * Payable interface - for payment
 */
interface Payable {

    /** Makes payment */
    void make_payment();
}

/**
 * Billable interface - for bill generation
 */
interface Billable {

    /** Generates bill */
    void generate_bill();
}

/**
 * Payment class - Implements Multiple Inheritance using two interfaces
 */
class Payment implements Payable, Billable {

    /** total_amount stores amount to be paid */
    double total_amount;

    /**
     * Constructor
     * @param total_amount amount to pay
     */
    Payment(double total_amount) {
        this.total_amount = total_amount;
    }

    /**
     * Makes payment
     */
    public void make_payment() {
        System.out.println("Payment of Rs." + total_amount + " is Successful!");
    }

    /**
     * Generates bill
     */
    public void generate_bill() {
        System.out.println("Bill Generated for Rs." + total_amount);
    }
}

/**
 * FinalBill - Hybrid Inheritance: TourPackage -> FinalBill implements Payable, Billable
 */
class FinalBill extends TourPackage implements Payable, Billable {

    /** discount stores discount amount */
    double discount = 1000;

    /**
     * Constructor
     * @param package_name name of package
     * @param total_price total price
     */
    FinalBill(String package_name, double total_price) {
        this.package_name = package_name;
        this.base_price = total_price;
    }

    /**
     * Implements Payable
     */
    public void make_payment() {
        System.out.println("Final Payment for " + package_name + " of Rs." + base_price + " Successful!");
    }

    /**
     * Implements Billable
     */
    public void generate_bill() {
        System.out.println("Final Bill: " + package_name + " | Payable: Rs." + (base_price - discount));
    }

    /**
     * Shows discount - own method for hybrid
     */
    void show_discount() {
        System.out.println("You got discount of Rs." + discount + " on " + package_name);
    }
}