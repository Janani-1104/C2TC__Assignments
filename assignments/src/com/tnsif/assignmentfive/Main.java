package com.tnsif.assignmentfive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🎟️ Welcome to the Stage Show Ticket Booking System 🎭");
        System.out.println("--------------------------------------------------");

        // Read booking details
        System.out.println("Enter booking details in CSV format (stageEvent,customer,noOfSeats):");
        String bookingInput = sc.nextLine(); // e.g., Magic show,Lunu,43
        String[] parts = bookingInput.split(",");

        String stageEvent = parts[0].trim();
        String customer = parts[1].trim();
        Integer noOfSeats = Integer.parseInt(parts[2].trim());

        // Create TicketBooking object
        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        // Choose payment mode
        System.out.println("\nSelect Payment Mode:");
        System.out.println("1. Cash Payment");
        System.out.println("2. Wallet Payment");
        System.out.println("3. Credit Card Payment");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the amount to pay: ");
                Double cashAmount = sc.nextDouble();
                booking.makePayment(cashAmount);
                break;

            case 2:
                System.out.print("Enter the amount to pay: ");
                Double walletAmount = sc.nextDouble();
                sc.nextLine(); // consume newline
                System.out.print("Enter your wallet number: ");
                String walletNumber = sc.nextLine();
                booking.makePayment(walletAmount, walletNumber);
                break;

            case 3:
                sc.nextLine(); // consume newline
                System.out.print("Enter cardholder name: ");
                String cardHolder = sc.nextLine();
                System.out.print("Enter the amount to pay: ");
                Double cardAmount = sc.nextDouble();
                sc.nextLine(); // consume newline
                System.out.print("Enter credit card type (e.g., Master/Visa): ");
                String cardType = sc.nextLine();
                System.out.print("Enter CCV number: ");
                String ccv = sc.nextLine();
                booking.makePayment(cardHolder, cardAmount, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice ❌");
        }

        System.out.println("\n✅ Transaction completed. Thank you for booking!");
        sc.close();
    }
}