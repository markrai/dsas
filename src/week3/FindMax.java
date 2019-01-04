package week3;

/* input: string of single digit numbers.
 * converts to: an array of ints.
 * output: the maximum digit from that array.
 */

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String stringInput = s.nextLine();

		stringToIntArray(stringInput);
	}

	public static void stringToIntArray(String stringInput) {
		int intArray[] = new int[stringInput.length()];
		for (int i = 0; i < stringInput.length(); i++) {
			int a = stringInput.charAt(i);
			intArray[i] = Character.getNumericValue(a);
		}
		findMax(intArray);
	}

	public static int findMax(int[] intArray) {
		int max = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > max || intArray[i] == max) {
				max = intArray[i];
			}
		}
		System.out.println(max);
		return max;
	}
}