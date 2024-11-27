package week3.day1;

public class WebElement {

	public void click() {
		System.out.println("This is click method from WebElement class");
	}

	public void setText(String text) {

		System.out.println("This is setText method" + text);

	}

	public static void main(String[] args) {
		

		WebElement webElement = new WebElement();
		webElement.setText("TestLeaf");
	}

}
