package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

public class testbase {
	
	public static Properties prop;
	
	public testbase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
					+ "//src//main//java//com//qa//config//config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String readResponceByJpath (JSONObject responseJson, String jPath) {
		Object obj = responseJson;
		for (String s: jPath.split("/")) {
			System.out.println("VOt te na====>" + s);
			if (!s.isEmpty())
				if (!(s.contains("[")||s.contains("]")))
					{obj = ((JSONObject)obj).get(s);
			System.out.println("Obj1===>" + obj.toString());
					}else if (s.contains("[")||s.contains("]"))
					{obj = ((JSONArray) ((JSONObject) obj).get(s.split("\\[")[0])).get(Integer.parseInt(s.split("\\[")[1].replace("]", "")));				
					System.out.println("Obj2===>" + obj.toString());
					}
					
		}
		return obj.toString();
	}

}
