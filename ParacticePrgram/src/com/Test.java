package com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enther the Roll-Number");
		int roll = sc.nextInt();
		
		switch (roll) {
		case 10001:
			String rm = "Ram";
			if(rm.equals("Ram")) {
				System.out.println("Program for B.tech");
			}
			System.out.println("Invalid");
			break;
		case 10002:
			System.out.println("Program for MCA");
			break;
		case 10003:
			System.out.println("Program for MBA");
			break;
		case 10004:
			System.out.println("Program for M.tech");
			break;
		default:
			System.out.println("Please Enter the valid roll number " +roll);
		}

	}

}
