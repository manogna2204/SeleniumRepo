package week3.day1;

public class RadioButton extends Button {

	public void selectRadioButton() {

		System.out.println("This is selectRadioButton method");
	}

	public static void main(String[] args) {

		RadioButton radioButtonObj = new RadioButton();

		radioButtonObj.selectRadioButton();
		radioButtonObj.submit();
		radioButtonObj.click();
		radioButtonObj.setText("Text from Radiobutton class");

	}

}
