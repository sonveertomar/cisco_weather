package weather.data;
import static java.lang.System.out;
import java.lang.reflect.Field;
public class Properties {
	String wikidata;
	boolean landmark;
	String address;
	String category;
	String maki;
	
	
	public Properties() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Properties(String wikidata, boolean landmark, String address, String category, String maki) {
		super();
		this.wikidata = wikidata;
		this.landmark = landmark;
		this.address = address;
		this.category = category;
		this.maki = maki;
	}
	public String getWikidata() {
		return wikidata;
	}
	public void setWikidata(String wikidata) {
		this.wikidata = wikidata;
	}
	public boolean isLandmark() {
		return landmark;
	}
	public void setLandmark(boolean landmark) {
		this.landmark = landmark;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMaki() {
		return maki;
	}
	public void setMaki(String maki) {
		this.maki = maki;
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
