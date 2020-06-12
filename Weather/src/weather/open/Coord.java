package weather.open;

import static java.lang.System.out;

import java.lang.reflect.Field;

public class Coord {
	long lon;
	long lat;
	public Coord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coord(long lon, long lat) {
		super();
		this.lon = lon;
		this.lat = lat;
	}
	public long getLon() {
		return lon;
	}
	public void setLon(long lon) {
		this.lon = lon;
	}
	public long getLat() {
		return lat;
	}
	public void setLat(long lat) {
		this.lat = lat;
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
