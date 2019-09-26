package ApiSampleTest;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.testbase;
import com.qa.client.RestClient;

public class getApiTest extends testbase{
	testbase testbase;
	String URL;
	String serviceURL;
	String apiUrl;
	
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testbase = new testbase();
		serviceURL = prop.getProperty("URL");
		apiUrl = prop.getProperty("serviceURL");	
		URL = serviceURL+apiUrl;

	}
	
//	@Test
//	
//	public void getTest() throws ClientProtocolException, IOException {
//		
//		RestClient restClient = new RestClient();
//		CloseableHttpResponse closeableHttpResponceGet = restClient.get(URL);
//	
//		
//        //Status Code
//		int statusCode = closeableHttpResponceGet.getStatusLine().getStatusCode();
//		System.out.println("Status code" + statusCode);
//		
//		Assert.assertEquals(statusCode, 200);
//		
//		//JSON string
//		String responseString = EntityUtils.toString(closeableHttpResponceGet.getEntity(), "UTF-8");
//		System.out.println(responseString);
//		JSONObject responceJson = new JSONObject(responseString);
//		System.out.println("Response JSON" + responceJson);
//		
//		String s = readResponceByJpath(responceJson, "/per_page");
//		System.out.println(s);
//		Assert.assertEquals(Integer.parseInt(s), 3);
//		
//		String s1 = readResponceByJpath(responceJson, "/data[0]/first_name");
//		System.out.println("Rabotaet"+s1);
//		
//		Header[] headersArray = closeableHttpResponceGet.getAllHeaders();
//		HashMap<String, String> allHeaders = new HashMap<String, String>();
//		for (org.apache.http.Header header : headersArray) {
//			allHeaders.put(header.getName(), header.getValue());
//		}
//		System.out.println("Headers " + allHeaders);
//	}

	@Test
	public void getTestWithHeaders() throws ClientProtocolException, IOException {

		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("username", "test");
		headers.put("password", "test");
		headers.put("Auth tokien", "223540");
		
		RestClient restClient = new RestClient();
		CloseableHttpResponse closeableHttpResponceGet = restClient.get(URL, headers);

		// Status Code
		int statusCode = closeableHttpResponceGet.getStatusLine().getStatusCode();
		System.out.println("Status code" + statusCode);

		Assert.assertEquals(statusCode, 200);

		// JSON string
		String responseString = EntityUtils.toString(closeableHttpResponceGet.getEntity(), "UTF-8");
		System.out.println(responseString);
		JSONObject responceJson = new JSONObject(responseString);
		System.out.println("Response JSON" + responceJson);
		
		String s = readResponceByJpath(responceJson, "/per_page");
		System.out.println(s);
		Assert.assertEquals(Integer.parseInt(s), 3);
		
		String s1 = readResponceByJpath(responceJson, "/data[0]/first_name");
		System.out.println("Rabotaet"+s1);
		
		Header[] headersArray = closeableHttpResponceGet.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String,String>();
		for (org.apache.http.Header header : headersArray) {
			allHeaders.put(header.getName(), header.getValue());
		}
		System.out.println("Headers "+ allHeaders);
		}
		
}