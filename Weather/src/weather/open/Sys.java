package weather.open;

import static java.lang.System.out;

import java.lang.reflect.Field;

public class Sys {
	int type;
	long id;
	String message;
	String country;
	String sunrise;
	String sunset;
	public Sys() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sys(int type, long id, String message, String country, String sunrise, String sunset) {
		super();
		this.type = type;
		this.id = id;
		this.message = message;
		this.country = country;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
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
