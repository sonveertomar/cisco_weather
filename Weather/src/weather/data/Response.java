package weather.data;

import static java.lang.System.out;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Response {
	String type;
	ArrayList<String> query;
	ArrayList<Features> features;
	String attribution;
	
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(String type, ArrayList<String> query, ArrayList<Features> features, String attribution) {
		super();
		this.type = type;
		this.query = query;
		this.features = features;
		this.attribution = attribution;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<String> getQuery() {
		return query;
	}
	public void setQuery(ArrayList<String> query) {
		this.query = query;
	}
	public ArrayList<Features> getFeatures() {
		return features;
	}
	public void setFeatures(ArrayList<Features> features) {
		this.features = features;
	}
	public String getAttribution() {
		return attribution;
	}
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}
	 public String toString() {
			
	        Field[] fields = this.getClass().getDeclaredFields();
	        String str = this.getClass().getName()+"[";
	        try {
	            for (Field field : fields) {
	                str += field.getName() + "=" + field.get(this) + ",";
	            }
	        } catch (IllegalArgumentException | IllegalAccessException ex) {
	            out.println(ex);
	        }
	        str+="]";
	        return str;
	    }
	
}
