package week3.day1;

public class Button extends WebElement {	
	
	public void submit() {
		
		System.out.println("This is submit method");
	}
	

	public static void main(String[] args) {
		
		Button buttonObject = new Button();
		buttonObject.submit();
		buttonObject.click();
		buttonObject.setText("Text from Button method");

	}

}
