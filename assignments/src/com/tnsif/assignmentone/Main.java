package com.tnsif.assignmentone;

import java.util.Scanner;

//Class Student with default constructor
class Student {
 // Default constructor
 Student() {
     System.out.println("Student object is created");
 }
}


//Class Commissions
class Commission {
 // Data Members
 String name;
 String address;
 String phone;
 double salesAmount;

 // Method to accept details of the sales employee
 void acceptDetails() {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Name: ");
     name = sc.nextLine();

     System.out.print("Enter Address: ");
     address = sc.nextLine();

     System.out.print("Enter Phone: ");
     phone = sc.nextLine();

     System.out.print("Enter Sales Amount: ");
     salesAmount = sc.nextDouble();
 }

 // Method to calculate commission
 void calculateCommission() {
     double commission;

     if (salesAmount >= 100000) {
         commission = salesAmount * 0.10;  // 10%
     } else if (salesAmount >= 50000) {
         commission = salesAmount * 0.05;  // 5%
     } else if (salesAmount >= 30000) {
         commission = salesAmount * 0.03;  // 3%
     } else {
         commission = 0;
     }

     System.out.println("\n--- Commission Details ---");
     System.out.println("Name: " + name);
     System.out.println("Address: " + address);
     System.out.println("Phone: " + phone);
     System.out.println("Sales Amount: " + salesAmount);
     System.out.println("Commission: " + commission);
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     // Create Student object (triggers default constructor)
	 Student s1 = new Student();


     // Create Commission object and call member methods
     Commission c1 = new Commission();
     c1.acceptDetails();
     c1.calculateCommission();
    
 }
}
