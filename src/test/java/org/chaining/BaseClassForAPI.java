package org.chaining;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.response.Response;

public class BaseClassForAPI {
	public static int getResponseCode(Response re) {
		return re.getStatusCode();
	}
	public static String getResponseBody(Response re) {
		return re.getBody().asString();
	}
	public static String getValue(String body,String key) throws ParseException {
		JSONParser p=new JSONParser();
		Object obj = p.parse(body);
		JSONObject j=(JSONObject)obj;
		//key or id or anything so it changes
		return j.get(key).toString();
	}
}
