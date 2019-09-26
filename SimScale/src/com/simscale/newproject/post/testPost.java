package com.simscale.newproject.post;

import java.io.IOException;
import java.util.HashMap;

import com.qa.base.Testbase;

public class testPost extends Testbase{

	public static void main(String[] args) throws IOException {
		String serviceURL = prop.getProperty("URL");
		String apiUrl = prop.getProperty("serviceURL");
		String requestUrl = serviceURL+apiUrl;
		HashMap <String, String> head= new HashMap<String, String>();
		head.put("accept",prop.getProperty("accept"));
		head.put("accept-language",prop.getProperty("accept-language"));
		head.put("authorization",prop.getProperty("authorization"));
		head.put("content-length",prop.getProperty("content-length"));
		head.put("content-type",prop.getProperty("content-type"));
		head.put("cookie",prop.getProperty("cookie")); 
		head.put("origin",prop.getProperty("origin"));
		head.put("referer",prop.getProperty("referer"));
		head.put("user-agent",prop.getProperty("user-agent"));
		head.put("x-requested-with",prop.getProperty("x-requested-with"));
		String payload="{\"projectName\":\"everyone is home\",\"description\":\"it works\",\"isPrivate\":false,\"userHasFreePlan\":true,\"userHasProfessionalPlan\":false,\"userHasEnterprisePlan\":false,\"userHasAcademicPlan\":false,\"userHasProfessionalTestPlan\":false,\"userHasAcademicPrivatePlan\":false,\"userHasCustomerPlan\":false,\"categories\":[],\"measurementSystem\":\"SI\",\"tags\":[],\"publicPermission\":{\"readPreview\":true,\"read\":true,\"write\":false,\"billableAction\":false,\"getCopy\":true}}";
		if (testPost.sendPostRequest(requestUrl, payload, head)==true) {
			System.out.println("Project successfully created.");
		}else{
			System.out.println("ERROR!!! Project is not created.");
		};
		
	}
		
		
}                                                                  