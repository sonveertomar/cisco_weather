package weather.open;

import static java.lang.System.out;

import java.lang.reflect.Field;

public class Main {
	int temp;
	int feels_like;
	int temp_min;
	int temp_max;
	int pressure;
	int humidity;
	int sea_level;
	int grnd_level;
	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Main(int temp, int feels_like, int temp_min, int temp_max, int pressure, int humidity, int sea_level,
			int grnd_level) {
		super();
		this.temp = temp;
		this.feels_like = feels_like;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.pressure = pressure;
		this.humidity = humidity;
		this.sea_level = sea_level;
		this.grnd_level = grnd_level;
	}

	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getFeels_like() {
		return feels_like;
	}
	public void setFeels_like(int feels_like) {
		this.feels_like = feels_like;
	}
	public int getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(int temp_min) {
		this.temp_min = temp_min;
	}
	public int getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(int temp_max) {
		this.temp_max = temp_max;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
	public int getSea_level() {
		return sea_level;
	}

	public void setSea_level(int sea_level) {
		this.sea_level = sea_level;
	}

	public int getGrnd_level() {
		return grnd_level;
	}

	public void setGrnd_level(int grnd_level) {
		this.grnd_level = grnd_level;
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
