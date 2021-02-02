package org.serialization;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Builder {
//	public static void main(String args) {
//		//Request
//		RequestSpecBuilder reqspec =new RequestSpecBuilder();
//		reqspec.setBaseUri("https://mynthraa.atlassian.net");
//		reqspec.setContentType(ContentType.JSON);
//		PreemptiveBasicAuthScheme auth=new PreemptiveBasicAuthScheme();
//		auth.setUserName("riyaaravi97@gmail.com");
//		auth.setPassword("nMwdg0trFffLvYH9NswjD619");
//		reqspec.setAuth(auth);
//		RequestSpecification req = reqspec.build();
//		//Reponse
//		ResponseSpecBuilder resspec=new ResponseSpecBuilder();
//		ResponseSpecification res= resspec.expectStatusCode(201).expectContentType(ContentType.JSON).build();
//		
//		//spec-->accept requestspecification
//		Response resPost = RestAssured.given().spec(req).body(PayLoad.createUser())
//		.when().post("https://mynthraa.atlassian.net").then().spec(res).extract().response();
//
//	}
	static RequestSpecification req;
	public static RequestSpecification getReqBuilder() throws FileNotFoundException {
		//here ctype is enum
		//simplified form
		PrintStream stream=new PrintStream("log.txt");
		if(req==null) {
		PreemptiveBasicAuthScheme auth=new PreemptiveBasicAuthScheme();
		 auth.setUserName("riyaaravi97@gmail.com");
		 auth.setPassword("nMwdg0trFffLvYH9NswjD619"); 
		req=new RequestSpecBuilder()
				.setBaseUri("https://mynthraa.atlassian.net/")
				.addFilter(RequestLoggingFilter.logRequestTo(stream))
				.addFilter(ResponseLoggingFilter.logResponseTo(stream))
				.setContentType(ContentType.JSON)
				.setAuth(auth).build();
		}
		return req;
	}
	public static ResponseSpecification getResPostSpec() {
		ResponseSpecBuilder req=new ResponseSpecBuilder();
		ResponseSpecification respost = req.expectContentType(ContentType.JSON)
				.expectStatusCode(201)
				.build();
		return respost;
	}
	public ResponseSpecification getResPutSpec() {
		ResponseSpecBuilder req=new ResponseSpecBuilder();
		ResponseSpecification respost = req.expectContentType(ContentType.JSON)
				.expectStatusCode(201)
				.build();
		return respost;

	}
	
}
