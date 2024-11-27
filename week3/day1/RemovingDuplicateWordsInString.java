package week3.day1;

public class RemovingDuplicateWordsInString {

	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";

		String split[] = text.split(" ");

		for (int i = 0; i < split.length; i++) {
			int count = 0;
			for (int j = i + 1; j < split.length; j++) {

				if (split[j].equalsIgnoreCase(split[i])) {
					split[j] = split[i].replace(split[i], " ");
					count += 1;
				}
			}
			
			// to display the duplicate words count
			/*
			 * if (count > 0) {
			 * 
			 * System.out.println("Duplicates for " + split[i] + " is " + count);
			 * 
			 * }
			 */

		}

		// using join method of string class to display the text as required
		text = String.join(" ", split);
		System.out.println("Replaced String is ---- " + text);

	}

}
