package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;


public class Testbase {
	
	public static Properties prop;
	
	public Testbase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
					+ "//src//com//qa//config//config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
}

	public static boolean sendPostRequest(String requestUrl, String payload, HashMap <String,String> headers) throws IOException {
	boolean response = false;
	try {
	        URL url = new URL(requestUrl);
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        for(Map.Entry<String, String> headerEntry : headers.entrySet()) {
	        connection.setRequestProperty(headerEntry.getKey(), headerEntry.getValue());
	        }
	        connection.setDoInput(true);
	        connection.setDoOutput(true);
	        connection.setRequestMethod("POST");
	        connection.setRequestProperty("Accept", "application/json");
	        connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
	        OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
	        writer.write(payload);
	        writer.close();
	        Map<String, List<String>> resphead = connection.getHeaderFields();
	        for(Entry<String, List<String>> headerEntry : resphead.entrySet()) {
		        System.out.println(headerEntry.getKey() + "  ==  "+headerEntry.getValue());
		        }
	        System.out.println("Message: " + connection.getResponseCode());
	        System.out.println("Message: " + connection.getResponseMessage());
	        if(connection.getResponseCode()<210 && connection.getResponseCode()>=200) {
	        	response = true;
	        }
//	        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//	        StringBuffer jsonString = new StringBuffer();
//	        String line;
//	        while ((line = br.readLine()) != null) {
//	                jsonString.append(line);
//	        }
//	        br.close();
	        connection.disconnect();
//	        System.out.println(jsonString.toString());
	    } catch (Exception e) {
//	            throw new RuntimeException(e.getMessage());
	    }
	return response;
}

}
