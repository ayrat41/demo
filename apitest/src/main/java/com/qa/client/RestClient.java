package com.qa.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.text.html.parser.Entity;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;



public class RestClient {

	//1.Get method
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException {
	CloseableHttpClient	httpClient = HttpClients.createDefault();
	HttpGet httpget = new HttpGet(url);
	CloseableHttpResponse closeableHttpResponceGet = httpClient.execute(httpget);
	
	return (CloseableHttpResponse) closeableHttpResponceGet;
	}
	
	//2.Put method
	public CloseableHttpResponse put(String url, String entityString, HashMap<String, String> headers) throws ClientProtocolException, IOException {
	CloseableHttpClient	httpClient = HttpClients.createDefault();
	HttpPut httpput = new HttpPut(url);
	httpput.setEntity(new StringEntity(entityString));//for payload
	for(Entry<String, String> e: headers.entrySet()) {
		httpput.addHeader(e.getKey(), e.getValue());
	}
	CloseableHttpResponse closeableHttpResponcePut = httpClient.execute(httpput);
	
	return (CloseableHttpResponse) closeableHttpResponcePut;
	}
	//2.Get method with headers
	public CloseableHttpResponse get(String url, HashMap<String, String> headers) throws ClientProtocolException, IOException {
		CloseableHttpClient	httpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		
		for(Entry<String, String> e: headers.entrySet()) {
			httpget.addHeader(e.getKey(), e.getValue());
		}
		
		CloseableHttpResponse closeableHttpResponceGet = httpClient.execute(httpget);
		
		return (CloseableHttpResponse) closeableHttpResponceGet;
		}
}
