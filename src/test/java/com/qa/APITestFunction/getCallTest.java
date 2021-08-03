package com.qa.APITestFunction;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;


public class getCallTest {
	
  @Test
  public void f() {
	  
//	 Response res = RestAssured.get("https://reqres.in/api/users?page=2");
	 
	 RestAssured.given().get("https://reqres.in/api/users?page=2").then().log().all();
		/*
		 * System.out.println(res.asPrettyString()); System.out.println(res.headers());
		 * System.out.println(res.getStatusCode());
		 * System.out.println(res.getStatusLine());
		 * System.out.println(res.getCookies()); Assert.assertEquals(200,
		 * res.getStatusCode());
		 */  }
  
  @Test
  public void test002() {
	  
//	  Response res = RestAssured.get("https://reqres.in/api/users?page=2");
	 
	  
	  
	  
	
	  
		/*
		 * System.out.println(res.getStatusCode());
		 * 
		 * JSONObject object = new JSONObject(); object.put("name", "Vishw");
		 * object.put("job", "Pilot");
		 * 
		 * System.out.println(object);
		 * 
		 * RestAssured.given().body(object.toJSONString()).then().statusCode(404);
		 * 
		 * System.out.println(res.getStatusLine());
		 * System.out.println(res.getCookies());
		 * System.out.println(res.jsonPath().get("data.last_name[5]"));
		 * System.out.println(res.getHeaders());
		 * System.out.println(res.getBody().asPrettyString());
		 * Assert.assertEquals("Howell", res.jsonPath().get("data.last_name[5]")); //
		 * System.out.println(res.body().asPrettyString()..contains("Micheal"));
		 */	
		 
		 
  }
}
