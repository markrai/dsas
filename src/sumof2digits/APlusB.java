package sumof2digits;

import java.util.Scanner;

public class APlusB {

	static int firstInteger;
	static int secondInteger;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		firstInteger = s.nextInt();
		secondInteger = s.nextInt();
		
		s.close();

	}

	static int sumOfTwoDigits(int first, int second) {
		return first + second;

	}

}
