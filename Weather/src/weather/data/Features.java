package weather.data;
import static java.lang.System.out;
import java.util.ArrayList;
import java.lang.reflect.Field;
public class Features {
		String id;
		String type;
		ArrayList<String> place_type;
		int relevance;
		Properties properties;
		String text;
		String place_name;
		String matching_text;
		String matching_place_name;
		ArrayList<String> bbox;
		ArrayList<String> center;
		Geometry geometry;
		ArrayList<Context> context;
		public Features() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Features(String id, String type, ArrayList<String> place_type, int relevance, Properties properties,
				String text, String place_name, String matching_text, String matching_place_name,
				ArrayList<String> bbox, ArrayList<String> center, Geometry geometry, ArrayList<Context> context) {
			super();
			this.id = id;
			this.type = type;
			this.place_type = place_type;
			this.relevance = relevance;
			this.properties = properties;
			this.text = text;
			this.place_name = place_name;
			this.matching_text = matching_text;
			this.matching_place_name = matching_place_name;
			this.bbox = bbox;
			this.center = center;
			this.geometry = geometry;
			this.context = context;
		}

		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public ArrayList<String> getPlace_type() {
			return place_type;
		}
		public void setPlace_type(ArrayList<String> place_type) {
			this.place_type = place_type;
		}
		public int getRelevance() {
			return relevance;
		}
		public void setRelevance(int relevance) {
			this.relevance = relevance;
		}
		public Properties getProperties() {
			return properties;
		}
		public void setProperties(Properties properties) {
			this.properties = properties;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getPlace_name() {
			return place_name;
		}
		public void setPlace_name(String place_name) {
			this.place_name = place_name;
		}
		public ArrayList<String> getBbox() {
			return bbox;
		}
		public void setBbox(ArrayList<String> bbox) {
			this.bbox = bbox;
		}
		public ArrayList<String> getCenter() {
			return center;
		}
		public void setCenter(ArrayList<String> center) {
			this.center = center;
		}
		public Geometry getGeometry() {
			return geometry;
		}
		public void setGeometry(Geometry geometry) {
			this.geometry = geometry;
		}
		
		 public ArrayList<Context> getContext() {
			return context;
		}
		public void setContext(ArrayList<Context> context) {
			this.context = context;
		}
		
		public String getMatching_text() {
			return matching_text;
		}

		public void setMatching_text(String matching_text) {
			this.matching_text = matching_text;
		}

		public String getMatching_place_name() {
			return matching_place_name;
		}

		public void setMatching_place_name(String matching_place_name) {
			this.matching_place_name = matching_place_name;
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
