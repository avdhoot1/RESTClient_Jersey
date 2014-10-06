package com.sample.rest;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
 
public class JerseyClientGet {
 
	
	
  public static void main(String[] args) 
  {
	  Client client=Client.create();
		WebResource webresource=client.resource("http://localhost:8080/com.sample/rest/stat/get/version");
		ClientResponse resp=webresource.accept("text/html").get(ClientResponse.class);
		if(resp.getStatus()==200)
		{
			String output=resp.getEntity(String.class);
			System.out.println(output);
		}
		else
		{
			System.out.println("HTTP OPERATION FAILED");
			System.out.println(resp.getStatus());
		}
 
  }
  
  
}