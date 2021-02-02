package com.stepdefinition;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.chaining.BaseClassForAPI;
import org.json.simple.parser.ParseException;
import org.serialization.Builder;
import org.serialization.Output;
import org.serialization.PayLoad;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
//public class JIRASteps {
//	RequestSpecification resSpec;
//	Response resPost;
//	@Given("The user add the create issue payload")
//	public void the_user_add_the_create_issue_payload() {
//		resSpec = RestAssured.given()
//				.log().all()
//				.spec(Builder.getReqBuilder())
//				.body(PayLoad.createIssue());	   
//	}
//	@When("User should call the post http request for create the issue")
//	public void user_should_call_the_post_http_request_for_create_the_issue() {
//		resPost = resSpec.when()
//				.post("rest/api/2/issue/");
//	}
//	@Then("To validate the response code it should be {int}")
//	public void to_validate_the_response_code_it_should_be(int statusCode) {
//		assertEquals("status code should be in 201..",
//				statusCode,resPost.getStatusCode());
//	}
//	@Then("To validate the self from resposebody that contains {string}")
//	public void to_validate_the_self_from_resposebody_that_contains(String self) {
//		assertTrue("Verify response body contains mynthraa",
//				resPost.then()
//				.log().all().extract().response()
//				.as(Output.class)
//				.getSelf().contains(self));
//	}
//}
public class JIRASteps{
	RequestSpecification resSpec;
	Response resPost ;
	@Given("To add the create issue payload {string} and {string}")
	public void to_add_the_create_issue_payload_and(String summary, String description) throws FileNotFoundException {
		System.out.println("-----------POST-----------");
		resSpec = RestAssured.given().
				log().all()
				.spec(Builder.getReqBuilder())
				.body(PayLoad.createIssue(summary, description));
	}
	@When("User should call the post http request for create the issue")
	public void user_should_call_the_post_http_request_for_create_the_issue() {
		resPost = resSpec.when()
				.post("rest/api/2/issue/");
	}
	@Then("To validate the response code it should be {int}")
	public void to_validate_the_response_code_it_should_be(int statusCode) {
		assertEquals("Status code should be..201",
				statusCode,resPost.getStatusCode());
	}
	@Then("To validate the self from resposebody that contains {string}")
	public void to_validate_the_self_from_resposebody_that_contains(String self) {
		Output ot = resPost.then()
				.log().all()
				.extract().response().as(Output.class);
		assertTrue("Verify response body self contains mynthraa..",
				ot.getSelf().contains(self));
	}
	@Given("To add the update issue payload {string} and {string}")
	public void to_add_the_update_issue_payload_and(String summary, String description) throws FileNotFoundException {
		System.out.println("--------------PUT----------------"); 
		resSpec = RestAssured.given(
				).log().all()
				.spec(Builder.getReqBuilder())
				.body(PayLoad.updateIssue(summary, description));
	}
	@When("User should call the put http request for update the issue")
	public void user_should_call_the_put_http_request_for_update_the_issue() {
		resPost = resSpec.when()
				.put("rest/api/2/issue/CRAZ-54");
	}	
	@Then("To validate the update response code it should be {int}")
	public void to_validate_the_update_response_code_it_should_be(int statusCode) {
		assertEquals("Status code should be..204",
				statusCode,resPost.getStatusCode());
	}
	@Given("To add the base uri for get")
	public void to_add_the_base_uri_for_get() throws FileNotFoundException {
		System.out.println("------------GET-----------------");
		resSpec= RestAssured.given()
				.log().all().spec(Builder.getReqBuilder());
	}
	@When("User should call the get http request for get the issues")
	public void user_should_call_the_get_http_request_for_get_the_issues() {
		resPost = resSpec.when()
				.get("rest/api/2/search");
	}
	@Then("To validate the get response code it should be {int}")
	public void to_validate_the_get_response_code_it_should_be(int statusCode) {
		assertEquals("Status code should be..200",
				statusCode,resPost.getStatusCode()); 
	}
	@Then("User verify the total issues it should be {int}")
	public void user_verify_the_total_issues_it_should_be(int total) throws ParseException {
		resPost.then().log().all();
		String body = resPost.getBody().asString();
		String tt = BaseClassForAPI.getValue(body, "total");
		int it = Integer.parseInt(tt);
		System.out.println("Total issues...."+it);
		assertEquals("Total issues..",total, it);
	}
	@Given("To add the base uri for delete")
	public void to_add_the_base_uri_for_delete() throws FileNotFoundException {
		System.out.println("------------DELETE-----------------");
		resSpec= RestAssured.given()
				.log().all()
				.spec(Builder.getReqBuilder());
	}
	@When("User should call the delete http request for get the issues")
	public void user_should_call_the_delete_http_request_for_get_the_issues() {
		resPost = resSpec.when()
				.delete("rest/api/3/issue/CRAZ-54");
	}
	@Then("To validate the response code for get it should be {int}")
	public void to_validate_the_response_code_for_get_it_should_be(int statusCode) {
		resPost.then()
		.log().all();
		assertEquals("Status code should be..200",
				statusCode,resPost.getStatusCode()); 
	}
}
