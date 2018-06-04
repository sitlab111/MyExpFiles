package com.rajks.json;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TestJson {

	public static void main(String[] args) throws Exception{
		TestJson test = new TestJson();
		System.out.println("JSON size is: "+test.parseJsonData());
	}
	int parseJsonData() throws Exception{
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("./resources/testJson.json");
		//FileReader reader = new FileReader(curl http://100.105.91.137:5555/wd/hub/sessions);
		JSONObject jsonObj = (JSONObject) jsonParser.parse(reader);
		//get an array from the json object
		JSONArray value = (JSONArray) jsonObj.get("value");
		return value.size();
		
	}

}
