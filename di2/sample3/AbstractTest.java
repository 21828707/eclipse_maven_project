package sample3;

import java.util.Calendar;
import java.util.GregorianCalendar;

abstract public class AbstractTest {
	abstract public String dayInfo();
	
	// factory-method
	public static AbstractTest getInstance() {
		AbstractTest week = null;
		
		GregorianCalendar cal = new GregorianCalendar();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		// 요일 조건에 따라 AbstractTest클래스를 상속받은 요일 클래스 객체 중에 하나를 빈객체로 만들어서 반환.
		switch (day) {
		case 1:
			week = new Sunday();
			break;
		case 2:
			week = new Monday();
			break;
		case 3:
			week = new Tuesday();
			break;
		case 4:
			week = new Wednsday();
			break;
		case 5:
			week = new Tursday();
			break;
		case 6:
			week = new Friday();
			break;
		case 7:
			week = new Saturday();
			break;

		default:
			break;
		}
		return week;
	}
}
