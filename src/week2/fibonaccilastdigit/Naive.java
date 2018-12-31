package week2.fibonaccilastdigit;

import java.util.Scanner;

public class Naive {

	static long lastDigit;

	private static long getFibonacciLastDigitNaive(int n) {
		if (n <= 1)
			return n;

		int prev = 0;
		int current = 1;
		int prevPrev = 0;

		for (int i = 0; i < n - 1; ++i) {
			prevPrev = prev;
			prev = current;
			current = prevPrev + current;
		}

		lastDigit = Math.abs(current % 10);
		System.out.println(lastDigit);
		return lastDigit;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		getFibonacciLastDigitNaive(n);

	}
}
