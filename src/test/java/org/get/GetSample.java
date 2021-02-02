package org.get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetSample{
	public static void main(String[] args) {
		//  https://reqres.in/api/users?page=2  
		//base URI  
		System.out.println("getListOfUsers");
		RestAssured.baseURI="https://reqres.in/";
		//headers,auth,parameters,reqtype,resource
		Response resGet = RestAssured.given().header("Content-Type","application/json").queryParam("page","2").when().get("api/users");
		//reqcode
		int code = resGet.getStatusCode();
		System.out.println("resCode:"+code);
		//rebody
		ResponseBody body = resGet.body();
		String resData = body.asString();
		System.out.println(resData);
		System.out.println("===========================");
		//https://reqres.in/api/users/2
		System.out.println("getSingleUser");
		Response resGet2 = RestAssured.given().header("Content-Type","application/json")
				.when().get("api/users/2");
		int code2 = resGet2.getStatusCode();

		System.out.println("resCode:"+code2);
		ResponseBody body2 = resGet2.body();
		System.out.println(body2.asString());
		System.out.println("=============================");
		//https://reqres.in/api/users/23
		System.out.println("getSingleUserNotFound");
		Response resGet3 = RestAssured.given().header("Content-Type","application/json")
				.when().get("api/users/23");
		int code3 = resGet3.getStatusCode();
		System.out.println("resCode:"+code3);
		ResponseBody body3 = resGet3.body();
		System.out.println(body3.asString());
		System.out.println("=============================");
		// getListResource---->https://reqres.in/api/unknown
		System.out.println("getListResource");
		Response resGet4 = RestAssured.given().header("Content-Type","application/json").when().get("api/unknown");
		int code4 = resGet4.getStatusCode();
		System.out.println("resCode:"+code4);
		ResponseBody body4 = resGet4.body();
		System.out.println(body4.asString());
		System.out.println("==========================");
		//getSingleResource--->https://reqres.in/api/unknown/2
		System.out.println("getSingleResource");
		Response resGet5 = RestAssured.given().header("Content-Type","application/json").when().get("api/unknown/2");
		int code5 = resGet5.getStatusCode();
		System.out.println("resCode:"+code5);
		ResponseBody body5 = resGet5.body();
		System.out.println(body5.asString());
		System.out.println("==============================");
		// getDelayedResponse--->https://reqres.in/api/users?delay=3
		System.out.println("getDelayedResponse");
		Response resGet6 = RestAssured.given().header("Content-Type","application/json").queryParam("delay",3).when().get("api/users");
		int code6 = resGet6.getStatusCode();
		System.out.println("resCode:"+code6);
		ResponseBody body6 = resGet6.body();
		System.out.println(body6.asString());
		System.out.println("==================================");
		// getSingleResourceNotFound-->https://reqres.in/api/unknown/23
		System.out.println("getSingleResouceNotFound");
		Response resGet7 = RestAssured.given().header("Content-Type","application/json").when().get("api/users/23");
		int code7 = resGet3.getStatusCode();
		System.out.println("resCode:"+code7);
		ResponseBody body7 = resGet7.body();
		System.out.println(body7.asString());
		
	}
}