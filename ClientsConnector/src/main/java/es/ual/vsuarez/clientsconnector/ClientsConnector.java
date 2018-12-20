package es.ual.vsuarez.clientsconnector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClientsConnector {

	private HttpURLConnection client;
	
	public ClientsConnector(String url)throws IOException {
		this.client=(HttpURLConnection) new URL(url).openConnection();
		this.client.setRequestMethod("GET");
	}
	
	public String getCLients()throws IOException{
		this.client.connect();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
		
		String json = "";
		String temp="";
		do{
			json+=temp;
			temp= reader.readLine();
		}while(temp!=null);
		return json;
	}
}
