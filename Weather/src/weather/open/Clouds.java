package weather.open;

import static java.lang.System.out;

import java.lang.reflect.Field;

public class Clouds {
	int all;

	public Clouds() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clouds(int all) {
		super();
		this.all = all;
	}

	public int getAll() {
		return all;
	}

	public void setAll(int all) {
		this.all = all;
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
