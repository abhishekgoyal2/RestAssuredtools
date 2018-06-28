package weather;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetcityWheatheraApigee {

	@Test
	public void getstatuscode()
	{
		// Specify the base URL to the RESTful web service
		Response res =RestAssured.get("https://restcountries.eu/rest/v1/name/norway");
		int code=res.getStatusCode();		
		System.out.println(code);
		
	}
	
	@Test
	public void getdata()
	{
		// Specify the base URL to the RESTful web service
		Response res =RestAssured.get("https://restcountries.eu/rest/v1/name/norway");
		String data=res.asString();		
		System.out.println("printing data of the API" +data);
		
		System.out.println("printing response time" +res.getTime());
	}
	
}
