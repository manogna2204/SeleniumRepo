package week3.day1;

public class CheckBoxButton extends Button {

	public void clickCheckButton() {

		System.out.println("This is clickCheckButton method");
	}

	public static void main(String[] args) {

		CheckBoxButton checkBoxButtonObj = new CheckBoxButton();

		checkBoxButtonObj.clickCheckButton();
		checkBoxButtonObj.submit();
		checkBoxButtonObj.click();
		checkBoxButtonObj.setText("Text from CheckBoxButton class");

	}

}
