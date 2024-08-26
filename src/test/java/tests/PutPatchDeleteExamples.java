package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutPatchDeleteExamples {
	
	
	@Test
	public void testPut() {
		
		JSONObject json = new JSONObject();
		
		json.put("name", "Abhishek");
		json.put("job", "Engineer");
		System.out.println(json.toJSONString());
		
		baseURI = "https://reqres.in/api";
		
		given().log().all().
		body(json.toJSONString()).
		when().
		put	("users/2").
		then().
		statusCode(200);
		
	}

}
