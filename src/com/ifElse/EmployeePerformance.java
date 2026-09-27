package com.ifElse;

import java.util.Scanner;

public class EmployeePerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("Outstanding");
        } else if (score >= 80) {
            System.out.println("Excellent");
        } else if (score >= 70) {
            System.out.println("Good");
        } else if (score >= 60) {
            System.out.println("Average");
        } else {
            System.out.println("Needs Improvement");
        }

        sc.close();
    }
}