package es.ual.vsuarez.iotconnector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class IotConnector {

	private String baseurl;
	public IotConnector(String url) {
		this.baseurl = url;
	}
	
	public String turnOnOff(String sufix){
		try {
			String url = this.baseurl+sufix;
			URL murl = new URL(url);
			URLConnection con = murl.openConnection();
			con.connect();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String json = "";
			String temp="";
			do{
				json+=temp;
				temp= reader.readLine();
			}while(temp!=null);
			return json;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
