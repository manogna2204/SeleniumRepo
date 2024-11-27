package week3.day1;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {

		String word1 = "TestLeaf";

		String word2 = "LeafTest";

		int firstwordLength = word1.length();
		int secondwordLength = word2.length();

		if (firstwordLength != secondwordLength) {
			System.out.println("Lengths mismatch so strings are not Anagram");

		} else {

			char[] charArray = word1.toCharArray();

			char[] charArray1 = word2.toCharArray();

			// System.out.println(charArray1);

			Arrays.sort(charArray);
			Arrays.sort(charArray1);

			// System.out.println(charArray1);
			// System.out.println(charArray);
			
			//To compare arrays use Arrays.equals(var1, var2);

			if (Arrays.equals(charArray, charArray1)) {

				System.out.println("The given strings are Anagram");
			} else {
				System.out.println("The given strings are not Anagram");
			}
			
		}
	}

}
