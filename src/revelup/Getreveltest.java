package revelup;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Getreveltest {

	
	@Test
	public void getrevelupdetails()
	{
		
		Response res =RestAssured.get("https://testkohls.revelup.com/resources/Product/?barcode=490905000043&establishment=1");
//		given().auth().basic("username", "password")
//		RestAssured.authentication = basic("sai.kamal@kohls.com", "Password4)");
//		Response res =RestAssured.get("http://10.3.28.6/KohlsDB2ProviderService/OffAisleProviderService.svc");
		int code=res.getStatusCode();
		
		System.out.println("status code is " +code);
		Assert.assertEquals(code /*actual code*/, 200 /*expected code*/," status code returned");
		
		String responseBody =res.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
//		// Specify the base URL to the RESTful web service
//		RestAssured.baseURI="https://testkohls.revelup.com//resources/Product/?barcode/?establishment";
//		
//		// Get the RequestSpecification of the request that you want to sent
//				// to the server. The server is specified by the BaseURI that we have
//				// specified in the above step.
//		RequestSpecification httpRequest=RestAssured.given();
//		
//		// Make a request to the server by specifying the method Type and the method URL.
//		// This will return the Response from the server. Store the response in a variable.
//		Response response=httpRequest.request("490905000043","1");
//		
//		// Now let us print the body of the message to see what response
//				// we have recieved from the server
//		String responseBody =response.getBody().asString();
//		System.out.println("Response Body is =>  " + responseBody);
		
		
	}
}
