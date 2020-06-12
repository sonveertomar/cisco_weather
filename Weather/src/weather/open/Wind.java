package weather.open;

import static java.lang.System.out;

import java.lang.reflect.Field;

public class Wind {
	int speed;
	int deg;
	public Wind() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wind(int speed, int deg) {
		super();
		this.speed = speed;
		this.deg = deg;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDeg() {
		return deg;
	}
	public void setDeg(int deg) {
		this.deg = deg;
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
