package modulo6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import util.StringUtil;
import util.DateUtil;


public class Prueba_Utils {

	public static void main(String[] args) {
		//String str = "cadena con_dos_espacios";		 
		//boolean b = StringUtil.containsDobleSpace(str);
		
		//String str = "cadena con 2 espacios";		 
		//boolean b = StringUtil.containsNumber(str);
		
		//if (b) {
		//	System.out.println("true");	
		//}else System.out.println("false");
		
		Date fecha = new Date();
		Calendar cal = Calendar.getInstance();						
		SimpleDateFormat sdf = new SimpleDateFormat("EEEEEE-dd-MM-yyyy");
					
		System.out.println("la fecha es " + fecha);
		System.out.println("la fecha formateada es " + sdf.format(fecha));
		
		System.out.println("\nla fecha es con calendar " + cal);
		
		System.out.println("la fecha de hoy  con calendar " + sdf.format(cal.getTime()));
		System.out.println("hoy es fin de semana?" + DateUtil.isFinDeSemana(cal.getTime()));
		
		
		System.out.println("el dia de una fecha es " + cal.get(Calendar.DATE));
		System.out.println("el mes de una fecha es " + (cal.get(Calendar.MONTH) +1));
		System.out.println("el mes de una fecha es " + cal.get(Calendar.YEAR) );
		
		//si al dia de hoy le sumo 3 dias
		cal.add(Calendar.DATE, 1);
		System.out.println("la fecha mas 1 dias es " + sdf.format(cal.getTime()));
		System.out.println("maana es fin de semana?" + DateUtil.isFinDeSemana(cal.getTime()));

		
		
		int anio = DateUtil.getAnio(fecha);
		int mes = DateUtil.getMes(fecha);
		int dia = DateUtil.getDia(fecha);
		
		System.out.println(anio+"/"+mes+"/"+dia);
	
		System.out.println("hoy es fin de semana? " + DateUtil.isFinDeSemana(fecha));
		System.out.println("hoy dia de semana? " + DateUtil.isDiaDeSemana(fecha));
		
		System.out.println("dia de semana: " + DateUtil.getDiaDeSemana(fecha));
	

		

	}

}
