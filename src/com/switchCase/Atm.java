package com.switchCase;
import java.util.*;
public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arrr[]=new int[n];
		for(int i=0;i<n;i++) {
			arrr[i]=sc.nextInt();
		}
		printer(arrr);
	}
	public static void printer(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+ " ");
		}
	}

}
