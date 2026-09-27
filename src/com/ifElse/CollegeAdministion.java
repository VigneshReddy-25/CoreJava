package com.ifElse;

import java.util.Scanner;

public class CollegeAdministion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rank = sc.nextInt();
        double percentage = sc.nextDouble();
        int age = sc.nextInt();

        if (rank <= 1000 && percentage >= 75) {
            if (age >= 17) {
                System.out.println("Admission Confirmed");
            } else {
                System.out.println("Age is below 17");
            }
        } else {
            if (rank > 1000) {
                System.out.println("Rank Not Eligible");
            } else {
                System.out.println("Percentage Not Eligible");
            }
        }

       
    }
}