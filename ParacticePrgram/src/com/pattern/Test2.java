package com.pattern;

import java.util.Iterator;

public class Test2 {

	public static void show(int t) {
		int i, j;
		// outer loop to handle number of rows
		for (i = 0; i < t; i++) {

			// inner loop to handle number of columns
			for (j = 0; j < t; j++) {

				if (i == 0 || j == 0 || i == t - 1 || j == t - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int t = 6;
		show(t);

	}

}
