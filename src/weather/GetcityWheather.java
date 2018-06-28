package weather;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetcityWheather {

	@Test
	public void getwheaterdetails()
	{
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		
		
		
	}
}
