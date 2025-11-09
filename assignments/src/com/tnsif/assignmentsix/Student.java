package com.tnsif.assignmentsix;

public class Student {
	private int score;

    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void display() {
        System.out.println(score);
    }

}