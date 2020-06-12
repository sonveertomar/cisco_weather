package weather.open;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;




public class OpenWeatherDataCollector {
	private static final String APP_KEY="9332da5dfd9a01b7a8b5b1c3f797b63e";
	private static DecimalFormat df = new DecimalFormat("0.00");
	public ArrayList<String> getWeatherData(String lat,String lng){
		ArrayList<String> responseList=new ArrayList<>();
		ArrayList<String> resp=getWeatherInfo(lat,lng);
		System.out.println("Status : "+resp.get(0));
		if(resp.get(0).equals("200")) { 
			OpenWeatherResponse openWeatherResponse=parseResponse(resp.get(1));
			if(openWeatherResponse.getCod().equalsIgnoreCase("200")) {
				System.out.println(openWeatherResponse.getName());
				responseList.add(0, "1");
				
				responseList.add(1, openWeatherResponse.getName());//name
				responseList.add(2, ""+df.format(openWeatherResponse.getMain().getTemp()-273.15));//temp
				responseList.add(3, ""+df.format(openWeatherResponse.getMain().getTemp_min()-273.15));//temp_min
				responseList.add(4, ""+df.format(openWeatherResponse.getMain().getTemp_max()-273.15));//temp_max
				responseList.add(5, ""+df.format(openWeatherResponse.getMain().getFeels_like()-273.15));//temp_feel
				responseList.add(6, ""+openWeatherResponse.getMain().getPressure());//pressure
				responseList.add(7, ""+openWeatherResponse.getMain().getHumidity());//humidity
				responseList.add(8, ""+openWeatherResponse.getVisibility());//visibility
				responseList.add(9, ""+openWeatherResponse.getWind().getSpeed());//wind speed
				
				
			}else {
				responseList.add(0, "-1");
				responseList.add(1, "Incorrect Response From Open Weather!");
				
				}
			}else {
				responseList.add(0, "-2");
				responseList.add(1, resp.get(1));
			}
			
		return responseList;
	}
	
	
	public ArrayList<String> getWeatherInfo(String lat,String lng) {
		StringBuilder sb = new StringBuilder();
		ArrayList<String> responseList=new ArrayList<>();
		String http = "http://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lng+"&appid="+APP_KEY;
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
			//e.printStackTrace();  
			responseList.add(0,"501");
			responseList.add(1,e.getMessage());
		} catch (IOException e) {
			responseList.add(0,"501");
			responseList.add(1,e.getMessage());
			System.out.println("Exception :: "+e);
			//e.printStackTrace();  
		} catch (Exception e) {
			responseList.add(0,"501");
			responseList.add(1,e.getMessage());
			System.out.println("Exception :: "+e);
		} finally {
			if (urlConnection != null) {
				urlConnection.disconnect();
			}
		}
		return responseList;
	}
	public OpenWeatherResponse parseResponse(String respStr){
		OpenWeatherResponse destination=null;            
		ObjectMapper mapper = new ObjectMapper();     
		try{
			destination = mapper.readValue(respStr, OpenWeatherResponse.class);
		}catch(Exception e){
			destination=null;
			System.out.println("parseResponse() :: Exception "+e);
		}
		return destination; 
	}
}
