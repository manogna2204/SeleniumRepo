package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {

		String word = "changeme";
		char[] convertedString = word.toCharArray();
		// c,h,a,n,g,e,m,e

		int length = convertedString.length;
		System.out.println(convertedString);

		for (int i = 0; i <= length - 1; i++) {
			
			//if condition to check the odd index
			if (i % 2 != 0) {
				
				//string. valueOf method used to convert that character into a string 
				// charAt(0) is used to return the character which is always 0 here as there is only one letter.
				convertedString[i] = String.valueOf(convertedString[i]).toUpperCase().charAt(0);

			}

		}
		System.out.println("Converted the odd index to uppercase:" + String.valueOf(convertedString));

	}

}
