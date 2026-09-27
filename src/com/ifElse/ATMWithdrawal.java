package com.ifElse;

import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int enteredPin = sc.nextInt();
        int correctPin = sc.nextInt();
        double balance = sc.nextDouble();
        double amount = sc.nextDouble();

        if (enteredPin == correctPin) {
            if (balance >= amount) {
                System.out.println("Collect Your Cash");
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Invalid PIN");
        }

        sc.close();
    }
}