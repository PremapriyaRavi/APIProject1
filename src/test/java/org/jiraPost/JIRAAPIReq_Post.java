package org.jiraPost;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class JIRAAPIReq_Post{
	public static void main(String[] args) {
		// http://localhost:8080/rest/api/2/issue/
		System.out.println("CreateIssue");
		RestAssured.baseURI="https://mynthraa.atlassian.net/";
		Response resGet1 = RestAssured.given().header("Content-Type","application/json")
				.auth().preemptive().basic("riyaaravi97@gmail.com","nMwdg0trFffLvYH9NswjD619")
				.body(PayLoad.createIssue())
				.when().post("rest/api/2/issue/");
		System.out.println("resCode:"+ resGet1.getStatusCode());
		ResponseBody body1 = resGet1.getBody();
		System.out.println("resBody:"+ body1.asString());
		System.out.println("--------------------------------");
		// http://localhost:8081/rest/api/2/issue/QA-31/comment
		System.out.println("createComment");
		RestAssured.baseURI="https://mynthraa.atlassian.net/";
		Response resGet2 = RestAssured.given().header("Content-Type","application/json")
				.auth().preemptive().basic("riyaaravi97@gmail.com","nMwdg0trFffLvYH9NswjD619")
				.body(PayLoad.createComment())
				.when().post("rest/api/2/issue/CRAZ-8/comment");
		System.out.println("resCode:"+ resGet2.getStatusCode());
		ResponseBody body2 = resGet2.getBody();
		System.out.println("resBody:"+ body2.asString());
		System.out.println("--------------------------------");
		  // http://localhost:8081/rest/api/2/issue/QA-31/comment
//		System.out.println("createSecurityLevel");
//		RestAssured.baseURI="https://mynthraa.atlassian.net/";
//		Response resGet3 = RestAssured.given().header("Content-Type","application/json")
//				.auth().preemptive().basic("riyaaravi97@gmail.com","nMwdg0trFffLvYH9NswjD619")
//				.body(PayLoad.createLevel())
//				.when().post("rest/api/2/issue/CRAZ-8/comment");
//		System.out.println("resCode:"+ resGet3.getStatusCode());
//		ResponseBody body3 = resGet3.getBody();
//		System.out.println("resBody:"+ body3.asString());
//		System.out.println("--------------------------------");
	}
	
}
