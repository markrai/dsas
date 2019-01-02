package week2.greatest_common_divisor;

import java.util.Scanner;

public class gcd {

	static int result = 0;
	long firstNumber;
	long secondNumber;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String stringInput = s.nextLine();
		String[] stringArray = stringInput.split(" ");
		int[] intArray = new int[2];

		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}

		calculateGCD(intArray[0], intArray[1]);
	}

	static public float calculateGCD(long firstNumber, long secondNumber) {

		long largerNumber;
		long smallerNumber;
		long r = 0;
		long q = 0;

		if (firstNumber < secondNumber) {
			largerNumber = secondNumber;
			smallerNumber = firstNumber;
		} else {
			largerNumber = firstNumber;
			smallerNumber = secondNumber;
		}

		if (largerNumber % smallerNumber == 0) {
			q = (largerNumber / smallerNumber);
			System.out.println("The GCD is: " + q);
		} else {

			r = largerNumber % smallerNumber;

			while (r != 0) {

				q = (largerNumber / smallerNumber);
				if (smallerNumber == 1) {
					System.out.println(r);

					return r;

				}
				r = largerNumber % smallerNumber;
				if (r == 0) {
					System.out.println(smallerNumber + " is the GCD");
				}
				largerNumber = smallerNumber;
				smallerNumber = r;

			}
		}

		return result;
	}

}
