package com.qa.APITestFunction;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;


public class getCallTest {
	
  @Test
  public void GetCall() {
	  
//	 Response res = RestAssured.get("https://reqres.in/api/users?page=2");
	 
	// RestAssured.given().get("https://reqres.in/api/users?page=2").then().log().all();
	
	 
	  //Gets the URL
	 RestAssured.given().
	 			get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.last_name[5]",equalTo("Howell"));
  }
  
  @Test
  public void postCall() {
	  
//	  Response res = RestAssured.get("https://reqres.in/api/users?page=2");
	 
	  JSONObject jsonobject = new JSONObject();
	  jsonobject.put("name", "Vishw");
	  jsonobject.put("job", "Manager");
	  
	  System.out.println(jsonobject.toJSONString());
	  RestAssured.given().body(jsonobject.toJSONString()).post("https://reqres.in/api/users").then().statusCode(201);
	  
  }
  
  @Test
  public void putCall() {
	  
	JSONObject jsonobject= new JSONObject();
	jsonobject.put("name", "Vishw");
	jsonobject.put("job", "Assistant manager");
	
	RestAssured.given().body(jsonobject.toJSONString()).put("https://reqres.in/api/users").then().statusCode(200);
	  
	  
  }
  
  @Test
  public void deleteCall() {
	  
	  RestAssured.given().delete("https://reqres.in/api/users/2").then().statusCode(204);
	  
	  
  }
}
