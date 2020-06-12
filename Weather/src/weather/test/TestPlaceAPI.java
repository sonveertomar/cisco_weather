package weather.test;

import java.io.BufferedReader;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

import weather.data.PlaceAPIDataCollector;
import weather.data.Response;

public class TestPlaceAPI {
	public static void main(String aa[]) {
		//String resp="{\"type\":\"FeatureCollection\",\"query\":[\"boston\"],\"features\":[{\"id\":\"place.9391334652012190\",\"type\":\"Feature\",\"place_type\":[\"place\"],\"relevance\":1,\"properties\":{\"wikidata\":\"Q100\"},\"text\":\"Boston\",\"place_name\":\"Boston, Massachusetts, United States\",\"bbox\":[-71.1255750165112,42.3196059806256,-70.9860500028801,42.3974009328397],\"center\":[-71.0596,42.3605],\"geometry\":{\"type\":\"Point\",\"coordinates\":[-71.0596,42.3605]},\"context\":[{\"id\":\"region.6720586550561540\",\"short_code\":\"US-MA\",\"wikidata\":\"Q771\",\"text\":\"Massachusetts\"},{\"id\":\"country.19352517729256050\",\"short_code\":\"us\",\"wikidata\":\"Q30\",\"text\":\"United States\"}]},{\"id\":\"poi.712964614235\",\"type\":\"Feature\",\"place_type\":[\"poi\"],\"relevance\":1,\"properties\":{\"wikidata\":\"Q671475\",\"landmark\":true,\"address\":\"1 Harborside Dr\",\"category\":\"airport\",\"maki\":\"airport\"},\"text\":\"Boston Logan International Airport (BOS)\",\"place_name\":\"Boston Logan International Airport (BOS), 1 Harborside Dr, Boston, Massachusetts 02128, United States\",\"center\":[-71.01263800000001,42.364098],\"geometry\":{\"coordinates\":[-71.01263800000001,42.364098],\"type\":\"Point\"},\"context\":[{\"id\":\"neighborhood.2100001\",\"text\":\"East Boston\"},{\"id\":\"postcode.7767019122633680\",\"text\":\"02128\"},{\"id\":\"place.9391334652012190\",\"wikidata\":\"Q100\",\"text\":\"Boston\"},{\"id\":\"region.6720586550561540\",\"short_code\":\"US-MA\",\"wikidata\":\"Q771\",\"text\":\"Massachusetts\"},{\"id\":\"country.19352517729256050\",\"short_code\":\"us\",\"wikidata\":\"Q30\",\"text\":\"United States\"}]},{\"id\":\"place.7295439820012190\",\"type\":\"Feature\",\"place_type\":[\"place\"],\"relevance\":1,\"properties\":{\"wikidata\":\"Q311975\"},\"text\":\"Boston\",\"place_name\":\"Boston, Lincolnshire, England, United Kingdom\",\"bbox\":[-0.246705,52.864227,0.26248,53.175594],\"center\":[-0.0214,52.9746],\"geometry\":{\"type\":\"Point\",\"coordinates\":[-0.0214,52.9746]},\"context\":[{\"id\":\"district.11732066392088010\",\"wikidata\":\"Q23090\",\"text\":\"Lincolnshire\"},{\"id\":\"region.16980108045453920\",\"short_code\":\"GB-ENG\",\"wikidata\":\"Q21\",\"text\":\"England\"},{\"id\":\"country.10368356586814600\",\"short_code\":\"gb\",\"wikidata\":\"Q145\",\"text\":\"United Kingdom\"}]},{\"id\":\"neighborhood.268456\",\"type\":\"Feature\",\"place_type\":[\"neighborhood\"],\"relevance\":1,\"properties\":{},\"text\":\"Bostonia\",\"place_name\":\"Bostonia, El Cajon, California 92021, United States\",\"bbox\":[-116.963196,32.788175,-116.908264,32.819601],\"center\":[-116.9364,32.8076],\"geometry\":{\"type\":\"Point\",\"coordinates\":[-116.9364,32.8076]},\"context\":[{\"id\":\"postcode.9457799704654610\",\"text\":\"92021\"},{\"id\":\"place.4288562754614670\",\"wikidata\":\"Q369947\",\"text\":\"El Cajon\"},{\"id\":\"region.9697035897738010\",\"short_code\":\"US-CA\",\"wikidata\":\"Q99\",\"text\":\"California\"},{\"id\":\"country.19352517729256050\",\"short_code\":\"us\",\"wikidata\":\"Q30\",\"text\":\"United States\"}]},{\"id\":\"neighborhood.299163\",\"type\":\"Feature\",\"place_type\":[\"neighborhood\"],\"relevance\":1,\"properties\":{},\"text\":\"Boston Road\",\"place_name\":\"Boston Road, Springfield, Massachusetts 01129, United States\",\"bbox\":[-72.520263,42.129603,-72.480737,42.148915],\"center\":[-72.4962,42.1436],\"geometry\":{\"type\":\"Point\",\"coordinates\":[-72.4962,42.1436]},\"context\":[{\"id\":\"postcode.5639454694523410\",\"text\":\"01129\"},{\"id\":\"place.15373511040041530\",\"wikidata\":\"Q49158\",\"text\":\"Springfield\"},{\"id\":\"region.6720586550561540\",\"short_code\":\"US-MA\",\"wikidata\":\"Q771\",\"text\":\"Massachusetts\"},{\"id\":\"country.19352517729256050\",\"short_code\":\"us\",\"wikidata\":\"Q30\",\"text\":\"United States\"}]}],\"attribution\":\"NOTICE: © 2020 Mapbox and its suppliers. All rights reserved. Use of this data is subject to the Mapbox Terms of Service (https://www.mapbox.com/about/maps/). This response and the information it contains may not be retained. POI(s) provided by Foursquare.\"}";
		PlaceAPIDataCollector OBJ=new PlaceAPIDataCollector();
		/*String resp=OBJ.getDestinationLocation("patna");
		if(resp!=null) { 
			Response t=OBJ.parseResponse(resp);
			if(t.getFeatures().size()==0) {
				System.out.println("No Data Found! Something went wrong");
			}else {
				if(t.getFeatures().get(0).getPlace_type().get(0).equalsIgnoreCase("place")) {
					System.out.println("Lat : "+t.getFeatures().get(0).getCenter().get(1));
					System.out.println("Long : "+t.getFeatures().get(0).getCenter().get(0));
				}else {
					System.out.println("No Valid Place!");
				}
			}
		}
		else{
			System.out.println("No Data Found!");
		}*/
	}

	}
