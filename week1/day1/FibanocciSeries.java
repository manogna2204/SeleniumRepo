package week1.day1;

public class FibanocciSeries {

	public static void main(String[] args) {
		int range = 8;
		int x = 0;
		int y = 1;
		System.out.print(x + ", " + y);
		for (int i = 2; i < range; i++) {
			int z = x + y;
			System.out.print(", " + z);
			x = y;
			y = z;

		}

	}

}
