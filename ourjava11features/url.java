package ourjava11features;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class url {
	public static void main(String args[])
	{
	String uri="https://postman-echo.com/get";
	HttpRequest req=HttpRequest.newBuilder().uri(URI.create(uri)).GET().setHeader(uri, uri).build();
	HttpClient client =HttpClient.newBuilder().build();
	
	try {
		HttpResponse<String> resp = client.send(req,BodyHandlers.ofString());
		System.out.println(resp.statusCode());
		System.out.println(resp.body());
		
	} catch (IOException  | InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	
	}
	}

