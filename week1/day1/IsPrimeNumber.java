package week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int number = 17;
		int count = 0;

		for (int i = 2; i <= number; i++) {

			if (number % i == 0) {
				count += 1;
			}
		}
		if (count == 1) {
			System.out.println("Given number is prime");
		} else {
			System.out.println("Given number is not prime");
		}

	}

}
