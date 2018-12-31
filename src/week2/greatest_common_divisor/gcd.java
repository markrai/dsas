package week2.greatest_common_divisor;

import java.util.Scanner;

public class gcd {

	static int result = 0;
	long firstNumber;
	long secondNumber;
	static long limit;

	static public float calculateGCD(long firstNumber, long secondNumber) {

		if (firstNumber < secondNumber) {
			limit = firstNumber;
		} else {
			limit = secondNumber;
		}

		for (int i = 1; i < limit; i++) {
			long result = firstNumber % i;
			System.out.println(firstNumber + " divided into: " + i + " gives us the remainder:" + result);
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String stringInput = s.nextLine();
		String[] stringArray = stringInput.split(" ");
		int[] intArray = null;

		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}

		calculateGCD(intArray[0], intArray[1]);
	}

}
