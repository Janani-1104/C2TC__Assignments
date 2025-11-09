package com.tnsif.assignmentsix;
import java.util.ArrayList;
import java.util.Scanner;


public class Studentscores {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of test scores: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter " + n + " test scores (space-separated): ");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        ArrayList<Student> scoreList = new ArrayList<>();

        for (int score : scores) {
            scoreList.add(new Student(score));
        }

        System.out.println("\nElements in the ArrayList:");
        for (Student s : scoreList) {
            s.display();
        }

        sc.close();
    }

}