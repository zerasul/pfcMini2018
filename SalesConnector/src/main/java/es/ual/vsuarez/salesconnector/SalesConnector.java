package es.ual.vsuarez.salesconnector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SalesConnector {
	private String url;
	
	
	public SalesConnector(String url) {
		this.url=url;
	}
	
	public String createSale(String ref, Integer quantity)throws IOException{
		HttpURLConnection connection = (HttpURLConnection) new URL(this.url).openConnection();
		Map<String, String> params = new HashMap();
		params.put("REF", ref);
		params.put("QUANTITY", quantity.toString());
		StringBuilder builder = new StringBuilder();
		builder.append("REF=");
		builder.append(ref);
		builder.append("&QUANTITY=");
		builder.append(builder);
		byte[] buffer = builder.toString().getBytes();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		connection.setRequestProperty("Content-Length", String.valueOf(buffer.length));
		connection.setDoOutput(true);
		connection.getOutputStream().write(builder.toString().getBytes());
		BufferedReader reader =new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String line = reader.readLine();
		StringBuilder builder2= new StringBuilder();
		do{
			builder2.append(line);
			line = reader.readLine();
		}while(line!=null);
		return builder2.toString();
	}
}
