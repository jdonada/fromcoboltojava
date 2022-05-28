package modulo3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un MES");
		String mes = sc.nextLine();
		
		String strMayuscula = mes.toUpperCase();
		
		if (strMayuscula.equals("NOVIEMBRE") ||
			strMayuscula.equals("ABRIL")     ||
			strMayuscula.equals("JUNIO")     ||
			strMayuscula.equals("SEPTIEMBRE")) {
			
			System.out.println("El mes de "+mes+" tiene 30 días");			
	     }else if (strMayuscula.equals("FEBRERO")){
	    			 System.out.println("El mes de "+mes+" tiene 28 días");
	    	 } else{
    			 System.out.println("El mes de "+mes+" tiene 31 días");	    	 	    		 
	     }
	
		sc.close();
	}
	

}
