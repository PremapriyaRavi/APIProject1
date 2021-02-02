package org.post;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class PostSample {
	public static void main(String[] args) {
		//createUser--->https://reqres.in/api/users
		//base URI  
		System.out.println("createUser");
		RestAssured.baseURI="https://reqres.in/";
		//headers,auth,parameters,reqtype,resource
		Response resPost = RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n" + 
						"    \"name\": \"morpheus\",\r\n" + 
						"    \"job\": \"leader\"\r\n" + 
						"}").when().post("api/users");
		//reqcode
		int code = resPost.getStatusCode();
		System.out.println("resCode:"+code);
		//rebody
		ResponseBody body = resPost.body();
		String resData = body.asString();
		System.out.println(resData);
		System.out.println("=============================");
		// registerSuccessful--->https://reqres.in/api/register
		System.out.println("registerSucessful");
		Response resPost1 = RestAssured.given().header("Content-Type","application/json")
				.body("{\r\n" + 
						"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
						"    \"password\": \"pistol\"\r\n" + 
						"}")
				.when().post("api/register");
		int code1 = resPost1.getStatusCode();
		System.out.println("resCode:"+code1);
		ResponseBody body1 = resPost1.body();
		System.out.println(body1.asString());
		System.out.println("==============================");
		// registerUnSucessful--->https://reqres.in/api/login
		System.out.println("registerUnSucessful");
		Response resPost2 = RestAssured.given().header("Content-Type","application/json").body("{\r\n" + 
				"    \"email\": \"sydney@fife\"\r\n" + 
				"}")
				.when().post("api/login");
		int code2= resPost2.getStatusCode();
		System.out.println("resCode:"+code2);
		ResponseBody body2 = resPost2.body();
		System.out.println(body2.asString());
		System.out.println("==============================");
		// loginSucessful--->https://reqres.in/api/login
		System.out.println("loginSucessful");
		Response resPost3 = RestAssured.given().header("Content-Type","application/json").body("{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
				"    \"password\": \"cityslicka\"\r\n" + 
				"}")
				.when().post("api/login");
		int code3 = resPost3.getStatusCode();
		System.out.println("resCode:"+code3);
		ResponseBody body3 = resPost3.body();
		System.out.println(body3.asString());
		System.out.println("==============================");
		// loginUnSucessful--->https://reqres.in/api/login
		System.out.println("loginUnSucessful");
		Response resPost4 = RestAssured.given().header("Content-Type","application/json").body("{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\"\r\n" + 
				"}")
				.when().post("api/login");
		int code4 = resPost4.getStatusCode();
		System.out.println("resCode:"+code4);
		ResponseBody body4 = resPost4.body();
		System.out.println(body4.asString());
	}

}
