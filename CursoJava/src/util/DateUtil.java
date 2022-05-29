package util;

import java.util.Calendar;
import java.util.Date;


public class DateUtil {
	
	public static int getAnio(Date pFecha){
		//crea el calendar con la fecha de hoy
		Calendar cal = Calendar.getInstance();
		cal.setTime(pFecha);
		return cal.get(Calendar.YEAR);
	}
	
	public static int getMes(Date pFecha){
		//crea el calendar con la fecha de hoy
		Calendar cal = Calendar.getInstance();
		cal.setTime(pFecha);
		return cal.get(Calendar.MONTH) + 1;
	}
	
	public static int getDia(Date pFecha){
		//crea el calendar con la fecha de hoy
		Calendar cal = Calendar.getInstance();
		cal.setTime(pFecha);
		return cal.get(Calendar.DAY_OF_MONTH);
	}
	
	public static boolean isFinDeSemana(Date pFecha){
		//crea el calendar con la fecha de hoy
		Calendar cal = Calendar.getInstance();
		cal.setTime(pFecha);
		return cal.get(Calendar.DAY_OF_WEEK)== Calendar.SATURDAY ||
			   cal.get(Calendar.DAY_OF_WEEK)== Calendar.SUNDAY		;
	}
	
	public static boolean isDiaDeSemana(Date pFecha){
		//crea el calendar con la fecha de hoy
		Calendar cal = Calendar.getInstance();
		cal.setTime(pFecha);
		return cal.get(Calendar.DAY_OF_WEEK)!= Calendar.SATURDAY &
			   cal.get(Calendar.DAY_OF_WEEK)!= Calendar.SUNDAY		;
	}
	
	public static int getDiaDeSemana(Date pFecha){
		//crea el calendar con la fecha de hoy
		Calendar cal = Calendar.getInstance();
		cal.setTime(pFecha);
		return cal.get(Calendar.DAY_OF_WEEK);
	}
}
