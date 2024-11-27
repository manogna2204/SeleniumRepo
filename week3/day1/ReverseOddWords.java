package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {

		String text = "I am a software tester";

		String split[] = text.split(" ");

		for (int i = 0; i < split.length; i++) {
			
			if (i%2 != 0) {
				
				char[] wordSplit = split[i].toCharArray();
				String concatstr = "";
				for(int j=wordSplit.length-1; j>=0; j-- ) {
					concatstr = concatstr + wordSplit[j];
				}
				
				split[i] = concatstr;
			}
			
			

		}

		// using join method of string class to display the text as required
		text = String.join(" ", split);
		System.out.println(text);

	}

}
