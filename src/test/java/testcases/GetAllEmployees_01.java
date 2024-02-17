package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees_01 {

	@Test

	public void GetAllEmployees() {

		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employees";

		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		String responseBody = response.body().asString();
		System.out.println(responseBody);
		System.out.println("Response code is : " + response.statusCode());
		Assert.assertEquals(response.statusCode(), 200);

	}
}
