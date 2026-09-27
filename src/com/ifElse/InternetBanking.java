package com.ifElse;

import java.util.Scanner;

public class InternetBanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        double amount = sc.nextDouble();
        boolean accountStatus = sc.nextBoolean();

        if (accountStatus) {
            if (balance >= amount) {
                System.out.println("Transaction Successful");
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Account Blocked");
        }

        sc.close();
    }
}