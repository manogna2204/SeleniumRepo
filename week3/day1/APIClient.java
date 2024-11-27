package week3.day1;

public class APIClient {
	
	// creating sendRequest method with one string parameter

	public void sendRequest(String endPoint) {

		System.out.println("The endPoint is : " + endPoint);
	}
	
	//creating sendRequest method with 3 input parameters.

	public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {

		System.out.println("The endPoint is : " + endPoint + "\n" + "The requestBody is : " + requestBody + "\n"
				+ "The request staus is : " + requestStatus);
	}

	public static void main(String[] args) {
		
		//creating an object for APIClient class to call both versions of sendRequest methods
		APIClient object = new APIClient();
		object.sendRequest("/articles");
		object.sendRequest("/articles/:id", "firstName:James", true);

	}

}

