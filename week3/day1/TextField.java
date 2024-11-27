package week3.day1;

public class TextField extends WebElement{
	
	
	public void getText() {
		
		System.out.println("This is getText method");
	}

	public static void main(String[] args) {
		
		TextField textFieldObject = new TextField();
		textFieldObject.getText();
		textFieldObject.click();
		textFieldObject.setText("Text from TextField method");

	}

}
