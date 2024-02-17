package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetSingleEmployee_02 {

	@Test
	public void GetSingleEmployee() {

		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";

		RequestSpecification request = RestAssured.given();
		Response response = request.get("/employee/1");
		String responseBody = response.body().asString();
		System.out.println(responseBody);
		System.out.println("Response code is : " + response.statusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertTrue(responseBody.contains("Tiger Nixon"));

	}
}
