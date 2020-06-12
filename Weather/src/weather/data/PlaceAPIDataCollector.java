package weather.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

public class PlaceAPIDataCollector {
	public ArrayList<String> getPlaceData(String place_name){
		ArrayList<String> responseList=new ArrayList<>();
		ArrayList<String> resp=getDestinationLocation(place_name);
		if(resp.get(0).equals("200")) { 
			Response t=parseResponse(resp.get(1));
			if(t.getFeatures().size()==0) {
				System.out.println("No Data Found! Something went wrong");
				responseList.add(0, "-2");
				responseList.add(1, "");
				responseList.add(2, "");
				responseList.add(3, "");
				responseList.add(4, "No Data Found! Something went wrong");
			}else {
				if(t.getFeatures().get(0).getPlace_type().get(0).equalsIgnoreCase("place")) {
					System.out.println("Lat : "+t.getFeatures().get(0).getCenter().get(0));
					System.out.println("Long : "+t.getFeatures().get(0).getCenter().get(1));
					responseList.add(0, "0");
					responseList.add(1, t.getFeatures().get(0).getPlace_name());
					responseList.add(2, t.getFeatures().get(0).getCenter().get(1));
					responseList.add(3, t.getFeatures().get(0).getCenter().get(0));
					responseList.add(4, "Data Fetched Succcesfully.");
				}else {
					System.out.println("Not Valid Place!");
					responseList.add(0, "1");
					responseList.add(1, "");
					responseList.add(2, "");
					responseList.add(3, "");
					responseList.add(4, "Not Valid Place!");
				}
			}
		}
		else{
			System.out.println("No Data Found!");
			System.out.println("Not Valid Place!");
			responseList.add(0, "-1");
			responseList.add(1, "");
			responseList.add(2, "");
			responseList.add(3, "");
			responseList.add(4, "Unable To Get Data From MAPBOX API");
		}
		return responseList;
	}
	public ArrayList<String> getDestinationLocation(String addess) {
		StringBuilder sb = new StringBuilder();
		ArrayList<String> responseList=new ArrayList<>();
		String http = "https://api.mapbox.com/geocoding/v5/mapbox.places/"+addess+".json?access_token=pk.eyJ1IjoibXQyMDE4MTE4IiwiYSI6ImNrYjg1bGhsbzAweWwycnFydXo3MmM5M2cifQ.cUbcOIh2cqsOugbRfDQABA";
		System.out.println("Invoking URL :: "+http);
		HttpURLConnection urlConnection = null;
		try {
			URL url = new URL(http);
			urlConnection = (HttpURLConnection) url.openConnection();
			/* urlConnection.setRequestMethod("POST");
            urlConnection.setUseCaches(false);
            urlConnection.setConnectTimeout(20000);
            urlConnection.setReadTimeout(20000);
            urlConnection.connect();*/
			int HttpResult = urlConnection.getResponseCode();
			System.out.println("HttpResult  :: " + HttpResult);
			responseList.add(0,String.valueOf(HttpResult));
			if (HttpResult == HttpURLConnection.HTTP_OK) {
				System.out.println("Url Connected HTTP Status :: " + HttpResult);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						urlConnection.getInputStream(), "utf-8"));
				String line = null;
				while ((line = br.readLine()) != null) {
					sb.append(line + "\n");
				}
				br.close();
				System.out.println("Output From Url :: " + sb.toString());
				responseList.add(1,sb.toString());
			} else {
				responseList.add(1,urlConnection.getResponseMessage());
				System.out.println("ResponseMessage ::  " + urlConnection.getResponseMessage());
			}
		} catch (MalformedURLException e) {
			System.out.println("Exception :: "+e);
			responseList.add(0,"501");
			responseList.add(1,e.getMessage());
			//e.printStackTrace();  
		} catch (IOException e) {
			System.out.println("Exception :: "+e);
			responseList.add(0,"501");
			responseList.add(1,e.getMessage());
			//e.printStackTrace();  
		} catch (Exception e) {
			System.out.println("Exception :: "+e);
			responseList.add(0,"501");
			responseList.add(1,e.getMessage());
		} finally {
			if (urlConnection != null) {
				urlConnection.disconnect();
			}
		}
		return responseList;
	}
	public Response parseResponse(String respStr){
		Response destination=null;            
		ObjectMapper mapper = new ObjectMapper();     
		try{
			destination = mapper.readValue(respStr, Response.class);
		}catch(Exception e){
			destination=null;
			System.out.println("parseResponse() :: Exception "+e);
		}
		return destination; 
	}

}
