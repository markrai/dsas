package week1.sumof2digits;

import java.util.Scanner;

public class APlusB {

	static int sumOfTwoDigits(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(sumOfTwoDigits(a, b));
		sumOfTwoDigits(a, b);
		s.close();

	}

}
