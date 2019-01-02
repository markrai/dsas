package week2.lcm;

import java.util.Scanner;

public class lcm {

	static long gcd;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String stringInput = s.nextLine();
		String[] stringArray = stringInput.split(" ");
		int[] intArray = new int[2];

		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}

		calculateGCD(intArray[0], intArray[1]);
		findLCM(intArray[0], intArray[1]);
	}

	public static long findLCM(long firstNumber, long secondNumber) {
		long lcm = 0;
		long gcd = calculateGCD(firstNumber, secondNumber);

		long a = firstNumber / gcd;
		lcm = a * secondNumber;
		System.out.println(lcm);
		return lcm;

	}

	static public long calculateGCD(long firstNumber, long secondNumber) {

		long largerNumber;
		long smallerNumber;
		long r = 0;
		long q = 0;

		if (firstNumber == 1 || secondNumber == 1) {
			return 1;
		}

		if (firstNumber == secondNumber) {
			return firstNumber;
		}

		if (firstNumber < secondNumber) {
			largerNumber = secondNumber;
			smallerNumber = firstNumber;
		} else {
			largerNumber = firstNumber;
			smallerNumber = secondNumber;
		}

		if (largerNumber % smallerNumber == 0) {
			q = (largerNumber / smallerNumber);
			return q;

		} else {

			r = largerNumber % smallerNumber;

			while (r != 0) {

				q = (largerNumber / smallerNumber);
				if (smallerNumber == 1) {
					return r;

				}
				r = largerNumber % smallerNumber;
				if (r == 0) {
					return smallerNumber;
				}
				largerNumber = smallerNumber;
				smallerNumber = r;

			}
		}

		return r;
	}

}