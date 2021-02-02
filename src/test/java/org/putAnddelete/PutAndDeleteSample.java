package org.putAnddelete;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class PutAndDeleteSample {
	public static void main(String[] args) {
		//updateUser-->https://reqres.in/api/users/2
		//https://reqres.in/api/users/2
		System.out.println("updateUser");
		RestAssured.baseURI="https://reqres.in/";
		Response resPut = RestAssured.given().header("Content-Type","application/json").body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \" Team Leader\"\r\n" + 
				"}").when().put("api/users/2");
		int code = resPut.statusCode();
		System.out.println("resCode:"+code);
		ResponseBody body = resPut.body();
		System.out.println(body.asString());
		System.out.println("===========================");
		//deleteUser-->https://reqres.in/api/users/2
		
		System.out.println("deleteUser");
		Response resDel = RestAssured.given().header("Content-Type","application/json").when().delete("api/users/2");
		int code1 = resDel.statusCode();
		System.out.println("resCode:"+code1);
		ResponseBody body2 = resDel.body();
		System.out.println(body2.asString());
	}
}
