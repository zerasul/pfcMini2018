package es.ual.vsuarez.productconnector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ProductConnector {
	
	private String url;
	
	public ProductConnector(String url) {
		this.url=url;
	}
	
	public String getProducts()throws IOException{
		URL url = new URL(this.url);
		URLConnection conn = url.openConnection();
		conn.connect();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String json = "";
		String temp="";
		do{
			json+=temp;
			temp= reader.readLine();
		}while(temp!=null);
		return json;
	}
}
