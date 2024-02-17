package testcases;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateEmployee_03 {

	@Test
	public void CreateEmployee() {

		HashMap<String, String> obj = new HashMap<String, String>();
		obj.put("name", "Ramya");
		obj.put("salary", "10000");
		obj.put("age", "30");

		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";

		RequestSpecification request = RestAssured.given();
		Response response = request.contentType(ContentType.JSON).accept(ContentType.JSON).body(obj).post("/create");
		System.out.println("The response code is " + response.getStatusCode());

		System.out.println("The response body is " + response.body().asString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
