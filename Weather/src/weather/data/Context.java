package weather.data;
import static java.lang.System.out;
import java.lang.reflect.Field;
public class Context {
	String id;
	String short_code;
	String wikidata;
	String text;
	public Context() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Context(String id, String short_code, String wikidata, String text) {
		super();
		this.id = id;
		this.short_code = short_code;
		this.wikidata = wikidata;
		this.text = text;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getShort_code() {
		return short_code;
	}
	public void setShort_code(String short_code) {
		this.short_code = short_code;
	}
	public String getWikidata() {
		return wikidata;
	}
	public void setWikidata(String wikidata) {
		this.wikidata = wikidata;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
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
