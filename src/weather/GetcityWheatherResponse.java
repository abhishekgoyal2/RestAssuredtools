package weather;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetcityWheatherResponse {

	@Test
	public void getwheaterdetails()
	{
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		// Get the RequestSpecification of the request that you want to sent
				// to the server. The server is specified by the BaseURI that we have
				// specified in the above step.
		RequestSpecification httpRequest=RestAssured.given();
		
		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response=httpRequest.get("11Noida");
		
		// Now let us print the body of the message to see what response
				// we have recieved from the server
		
		
		int statuscode=response.getStatusCode();
		Assert.assertEquals(statuscode /*actual code*/, 400 /*expected code*/," status code returned");
		String statusline=response.getStatusLine();
		Assert.assertEquals(statusline /*actual code*/, "HTTP/1.1 400 Bad Request" /*expected code*/," status line returned");
		System.out.println(statuscode);
		System.out.println(statusline);
	}
}
