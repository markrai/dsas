package week2.fibonacci;

public class ForLoop {

	static long x = 0;
	static long y = 1;
	static long z = 1;
	static long UpTill = 100; // specify how many places should the sequence count up to?

	public static void main(String[] args) {

		System.out.println(x + " ");

		for (long i = 2; i <= UpTill; i++) {

			System.out.println(z + " ");
			z = x + y;
			x = y;
			y = z;

		}

	}

}
