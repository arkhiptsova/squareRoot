package FeetNumber;

import java.text.DecimalFormat;

/*
Mila 
Java application that prints even numbers and their SquareRoot from 0 up to 20 
using the sqrt method in the Math class. Using a for loop to produce the output results. 
SquareRoot.java
*/
public class SquareRoot {
	// main method that outputs results
	public static void main(String[] args) {
		int i=0;
		System.out.println(" Number         "+  "SquareRoot ");
		DecimalFormat four = new DecimalFormat("#0.0000");
		for (i=0; i<21; i++) {
			if (i % 2 == 0) { //if loop for even numbers 
		System.out.println("  "+i+"              " + four.format(sqrt(i)));
		}
		}
	}
		
	//method that calculates Square number
	public static double sqrt (int i) {
		double result;
		result = Math.sqrt(i);
	return 	result;
	}
	}


