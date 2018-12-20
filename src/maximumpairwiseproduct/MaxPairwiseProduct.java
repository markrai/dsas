package maximumpairwiseproduct;

import java.util.Scanner;

public class MaxPairwiseProduct {

	static int largest = 0;
	static int product = 0;
	static int initialNumber = 0;

	public static void main(String[] args) {

		String input;

		int[] inputIntArray = new int[100];

		Scanner s1 = new Scanner(System.in);
		initialNumber = s1.nextInt();

		Scanner s2 = new Scanner(System.in);
		input = s2.nextLine();

		String[] inputStringArray = input.split(" ");

		for (int i = 0; i < inputStringArray.length; i++) {

			int n = Integer.parseInt(inputStringArray[i]);

			if (n == initialNumber) {

			} else {

				inputIntArray[i] = Integer.parseInt(inputStringArray[i]);
			}
		}

		findMaxProd(initialNumber, inputIntArray);

	}

	static int findMaxProd(int initialNumber, int[] input) {
		largest = input[0]; // start at first element of array

		for (int i : input) {
			if (i > largest) {
				largest = i;
			}
		}

		product = largest * initialNumber;

		System.out.println(product);
		return product;
	}

}
