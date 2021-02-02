package org.jiraDel;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class JIRAAPIReq_Delete {
	public static void main(String[] args) {
		//DELETE /rest/api/3/issue/{issueIdOrKey}
		RestAssured.baseURI="https://mynthraa.atlassian.net/";
		Response resDelete = RestAssured.given().header("Content-Type","application/json")
				.auth().preemptive().basic("riyaaravi97@gmail.com","nMwdg0trFffLvYH9NswjD619")
				.when().delete("rest/api/3/issue/CRAZ-10");
		System.out.println("resCode:"+ resDelete.getStatusCode());
		ResponseBody body1 = resDelete.getBody();
		System.out.println("resBody:"+ body1.asString());
		System.out.println("--------------------------------");
//		//DELETE /rest/api/3/issue/{issueIdOrKey}
//				RestAssured.baseURI="https://mynthraa.atlassian.net/";
//				Response resDelete = RestAssured.given().header("Content-Type","application/json")
//						.auth().preemptive().basic("riyaaravi97@gmail.com","nMwdg0trFffLvYH9NswjD619")
//						.when().delete("rest/api/3/issue/CRAZ-4");
//				System.out.println("resCode:"+ resDelete.getStatusCode());
//				ResponseBody body1 = resDelete.getBody();
//				System.out.println("resBody:"+ body1.asString());
//				System.out.println("--------------------------------");
	}

}
