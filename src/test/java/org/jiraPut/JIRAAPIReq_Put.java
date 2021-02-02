package org.jiraPut;

import org.jiraPost.PayLoad;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class JIRAAPIReq_Put {
	public static void main(String[] args) {
		//http://localhost:8080/rest/api/2/issue/QA-31
		System.out.println("updateAssigneeName");
		RestAssured.baseURI="https://mynthraa.atlassian.net/";
		Response resPut1 = RestAssured.given().header("Content-Type","application/json")
				.auth().preemptive().basic("riyaaravi97@gmail.com","nMwdg0trFffLvYH9NswjD619")
				.body(PayLoad.updateIssue1())
				.when().put("rest/api/2/issue/CRAZ-8");
		System.out.println("resCode:"+ resPut1.getStatusCode());
		ResponseBody body1 = resPut1.getBody();
		System.out.println("resBody:"+ body1.asString());
		System.out.println("--------------------------------");
		// http://localhost:8080/rest/api/2/issue/QA-31
		System.out.println("updateIssue");
		RestAssured.baseURI="https://mynthraa.atlassian.net/";
		Response resPut2 = RestAssured.given().header("Content-Type","application/json")
				.auth().preemptive().basic("riyaaravi97@gmail.com","nMwdg0trFffLvYH9NswjD619")
				.body(PayLoad.updateIssue2())
				.when().put("rest/api/2/issue/CRAZ-8");
		System.out.println("resCode:"+ resPut2.getStatusCode());
		ResponseBody body2 = resPut2.getBody();
		System.out.println("resBody:"+ body2.asString());
		System.out.println("--------------------------------");
	}

}
