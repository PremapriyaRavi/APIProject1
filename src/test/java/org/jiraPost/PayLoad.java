package org.jiraPost;

public class PayLoad {
	
	public static String createIssue() {
		return "{\r\n" + 
				"    \"fields\": {\r\n" + 
				"       \"project\":\r\n" + 
				"       {\r\n" + 
				"          \"key\": \"CRAZ\"\r\n" + 
				"       },\r\n" + 
				"       \"summary\": \"create issue using restAssured\",\r\n" + 
				"       \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n" + 
				"       \"issuetype\": {\r\n" + 
				"          \"name\": \"Bug\"\r\n" + 
				"       }\r\n" + 
				"   }\r\n" + 
				"}";
	}
	public static String createComment() {
		return "{\r\n" + 
				"    \"body\": \"This is a comment regarding the quality of the response.\"\r\n" + 
				"}";

	}
	public static String createLevel() {
		return "{\r\n" + 
				"    \"body\": \"This is a comment that only administrators can see.\",\r\n" + 
				"    \"visibility\": {\r\n" + 
				"        \"type\": \"role\",\r\n" + 
				"        \"value\": \"Administrators\"\r\n" + 
				"    }\r\n" + 
				"}";

	}
	public static String updateIssue1() {
		return "{\r\n" + 
				"   \"fields\": {\r\n" + 
				"       \"assignee\":{\"name\":\"Pinky\"}\r\n" + 
				"   }\r\n" + 
				"}";
	}
	public static String updateIssue2() {
		return "{\r\n" + 
				"    \"fields\" : {\r\n" + 
				"        \"summary\": \"Summary\",\r\n" + 
				"        \"description\": \"Description\"        \r\n" + 
				"    }\r\n" + 
				"}";

	}
	
}
