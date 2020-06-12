package weather.data;

import java.util.ArrayList;
import static java.lang.System.out;
import java.lang.reflect.Field;
public class Geometry {
	String type;
	ArrayList<String> coordinates;
	public Geometry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Geometry(String type, ArrayList<String> coordinates) {
		super();
		this.type = type;
		this.coordinates = coordinates;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<String> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(ArrayList<String> coordinates) {
		this.coordinates = coordinates;
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
