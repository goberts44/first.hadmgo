package first.hadmgo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.datatype.XMLGregorianCalendar;

public class TS {
	
	private static volatile TS INSTANCE;
	private SimpleDateFormat sdf;
	public static boolean TZ_SHOW = true;
	public static boolean TZ_HIDE = false;
	
	public static synchronized String stamp(XMLGregorianCalendar xmlCal) {
		Calendar cal = xmlCal.toGregorianCalendar();
		return stamp(cal, true);
	}
	
	public static synchronized String lapse(long before, long after) {
		long lapse = after - before;
		double d = (double)lapse / 1000;
		return String.valueOf(d);	
	}
	
	public static synchronized String stamp(long millis) {
		Calendar cal = GregorianCalendar.getInstance();
		cal.setTimeInMillis(millis);
		return stamp(cal, true);
	}
	
	public static synchronized String stamp(Calendar cal) {
		return stamp(cal, true);
	}
	
	public static synchronized String stamp(Calendar cal, boolean tz) {
		if (INSTANCE == null) {
			synchronized (TS.class) {
				if (INSTANCE == null) {
					INSTANCE = new TS();
					INSTANCE.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
				}
			}
		}
		if (tz) INSTANCE.sdf.setTimeZone(cal.getTimeZone());
		return INSTANCE.sdf.format(cal.getTime());
	}	
}
