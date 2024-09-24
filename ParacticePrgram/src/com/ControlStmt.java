package com;

import java.util.Scanner;

public class ControlStmt {

	int i = 18;

	void show() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enther the Age");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("For voting");
		} else {
			System.out.println("Not Eligible");
		}
	}

	public static void main(String[] args) {

		ControlStmt s = new ControlStmt();
		s.show();
	}

}
