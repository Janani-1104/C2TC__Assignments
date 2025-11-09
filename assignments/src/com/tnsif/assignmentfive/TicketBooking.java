package com.tnsif.assignmentfive;

public class TicketBooking {
    // Private attributes
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Default constructor
    public TicketBooking() {}

    // Parameterized constructor
    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // -------------------------------------
    // Overloaded Methods for Payments
    // -------------------------------------

    // 1️⃣ Cash Payment
    public void makePayment(Double amount) {
        displayBookingDetails();
        System.out.printf("Amount %.1f paid in cash\n", amount);
    }

    // 2️⃣ Wallet Payment
    public void makePayment(Double amount, String walletNumber) {
        displayBookingDetails();
        System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
    }

    // 3️⃣ Credit Card Payment
    public void makePayment(String cardHolderName, Double amount, String creditCardType, String ccv) {
        displayBookingDetails();
        System.out.println("Holder name: " + cardHolderName);
        System.out.printf("Amount %.1f paid using %s card\n", amount, creditCardType);
        System.out.println("CCV: " + ccv);
    }

        private void displayBookingDetails() {
        System.out.println("\n--- Receipt ---");
        System.out.println("Stage event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("Number of seats: " + noOfSeats);
    }
}