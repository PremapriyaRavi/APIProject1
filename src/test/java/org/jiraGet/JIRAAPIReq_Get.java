package org.jiraGet;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class JIRAAPIReq_Get {
	public static void main(String[] args) {
		//getAllIssues-->https://mynthraa.atlassian.net/rest/api/2/search
		RestAssured.baseURI="https://mynthraa.atlassian.net/";
		Response resGet1 = RestAssured.given().header("Content-Type","application/json")
				.auth().preemptive().basic("riyaaravi97@gmail.com","nMwdg0trFffLvYH9NswjD619")
				.when().get("rest/api/2/search");
		System.out.println("resCode:"+ resGet1.getStatusCode());
		ResponseBody body1 = resGet1.getBody();
		System.out.println("resBody:"+ body1.asString());
		System.out.println("--------------------------------");
		//getIssueForParticularUser--->https://mynthraa.atlassian.net/rest/api/2/search?jql=assignee=PriyaRavi
//		Response resGet2 = RestAssured.given().header("Content-Type","application/json")
//				.auth().preemptive().basic("riyaaravi97@gmail.com","nMwdg0trFffLvYH9NswjD619")
//				.queryParam("jql=assignee","PriyaRavi")
//				.when().get("rest/api/2/search");
//		System.out.println("resCode:"+ resGet2.getStatusCode());
//		ResponseBody body2 = resGet2.getBody();
//		System.out.println("resBody:"+ body2.asString());
//		System.out.println("--------------------------------");
		//getIssuePUrWithOrderedResult-->https://mynthraa.atlassian.net/rest/api/2/search?jql=assignee=PriyaRavi+order+by+duedate
//		Response resGet3 = RestAssured.given().header("Content-Type","application/json")
//				.auth().preemptive().basic("riyaaravi97@gmail.com","nMwdg0trFffLvYH9NswjD619")
//				.queryParam("jql=assignee","PriyaRavi+order+by+duedate")
//				.when().get("rest/api/2/search");
//		System.out.println("resCode:"+ resGet3.getStatusCode());
//		ResponseBody body3 = resGet2.getBody();
//		System.out.println("resBody:"+ body3.asString());
//		System.out.println("--------------------------------");
//		//issueAssignParticularUser---> https://mynthraa.atlassian.net/rest/api/2/search?jql=assignee=charlie
//		Response resGet4 = RestAssured.given().header("Content-Type","application/json")
//				.auth().preemptive().basic("riyaaravi97@gmail.com","nMwdg0trFffLvYH9NswjD619")
//				.queryParam("jql=assignee","PriyaRavi")
//				.when().get("rest/api/2/search");
//		System.out.println("resCode:"+ resGet4.getStatusCode());
//		ResponseBody body4 = resGet4.getBody();
//		System.out.println("resBody:"+ body4.asString());
//		System.out.println("--------------------------------");

	}

}
