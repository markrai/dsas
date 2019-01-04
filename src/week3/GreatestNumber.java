package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String stringInput = s.nextLine();
		int intArray[] = new int[stringInput.length()];
		for (int i = 0; i < stringInput.length(); i++) {
			int a = stringInput.charAt(i);
			intArray[i] = Character.getNumericValue(a);
		}

		sortDescending(stringInput);
	}

	public static String[] sortDescending(int[] stringArray) {
		
		
		List<String> myList =  new ArrayList<>();
		
		for (int i = 0; i < stringArray.length; i++) {
			myList.add(stringArray[i]);
		}
		
		
		
		Arrays.sort(intArray, Collections.reverseOrder());
		
		for (int ia: intArray) {
		System.out.println(ia);
		}
		return intArray;

	}
}
