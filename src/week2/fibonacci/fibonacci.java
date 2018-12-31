package fibonacci;

import java.util.Scanner;

// F0 = 0, F1 = 1, F2 = 1, F3 = 3...
// 0 1 1 2 3 5 8 13

public class fibonacci {

	static int n;

	static long prevPrev = 1;
	static long prev = 1;
	static long now = 0;

	static int input;
	static long output;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		input = s.nextInt();
		calculateFibonacci(input);

	}

	static long calculateFibonacci(int input) {
		if (input == 1) {
			System.out.println("1");
			return 1;
		} else if (input == 2) {
			System.out.println("1");
			return 1;
		}

		for (int i = 2; i < input; i++) {

			now = prevPrev + prev;
			// System.out.println(now);
			prevPrev = prev;
			prev = now;
		}

		output = now;
		System.out.println(output);
		return output;

	}

}
