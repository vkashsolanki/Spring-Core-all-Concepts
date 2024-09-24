package com.pattern;

import java.util.Iterator;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 6; i++) {
			System.out.println("this outer loop*"+ i);
			
			for (int j = 0; j < 5; j++) {
				System.out.println("++++++++++++++++++++");
				System.out.println("thi iiner loop *" +j);
			}
			
		}
	}

}
