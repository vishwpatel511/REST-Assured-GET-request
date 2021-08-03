package com.qa.APITestFunction;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class getCallTest {
	
  @Test
  public void f() {
	  
	 Response res = RestAssured.get("https://reqres.in/api/users?page=2");
	 System.out.println(res.getStatusCode());
	 System.out.println(res.getStatusLine());
	 System.out.println(res.getCookies());
	 Assert.assertEquals(200, res.getStatusCode());
  }
  
  @Test
  public void test002() {
	  
	  Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		 System.out.println(res.getStatusCode());
		 System.out.println(res.getStatusLine());
		 System.out.println(res.getCookies());
		 Assert.assertEquals(7, res.jsonPath().get("data.id[0]"));
  }
}
