package com.tnsif.assignmentfour;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int hours = sc.nextInt();
        double costPerHour = sc.nextDouble();

        Airfare airfare;

        if (choice == 1) {
            airfare = new AirIndia(hours, costPerHour);
        } else if (choice == 2) {
            airfare = new KingFisher(hours, costPerHour);
        } else if (choice == 3) {
            airfare = new Indigo(hours, costPerHour);
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        airfare.display();
        sc.close();
    }
}
