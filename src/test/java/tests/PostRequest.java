package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class PostRequest {
	
	@Test
	public void postTest_1() {
		
		JSONObject json = new JSONObject();
		
		json.put("name", "Abhishek");
		json.put("job", "Engineer");
		System.out.println(json.toJSONString());
		
		baseURI = "https://reqres.in/api";
		
		given().
		body(json.toJSONString()).
		when().
		post("users").
		then().
		statusCode(201);
		
		
		
	}

}
