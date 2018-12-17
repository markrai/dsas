package maximumpairwiseproduct;

import java.util.Scanner;

public class MaxPairwiseProduct {

	int product = 0;

	static int findMaxProd(int[] input) {
		int max = input[0];
		for (int i : input) {

			if (i > max) {
				max = i;
			}

		}
		System.out.println(max);
		return max;
	}

	public static void main(String[] args) {

		int[] input = new int[10];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < input.length; i++) {
			
			

			
		}
		int input = s.nextInt();
		findMaxProd(input);

	}

}
