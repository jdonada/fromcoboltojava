package util;
/**
 * Esta clase ofrece funciones trabajar con Strings
 * @author e107230
 *
 */

public class StringUtil {
	/**
	 * Ese metodo devuelve la cantidad de vocales uqe tiene el parametro
	 * @param pCadena es la cadena que se envia para analizar
	 * @return la cantida de vocales
	 */
	public static int getCantidadDeVocales(String pCadena){
		int vocales=0;
		for (int i =0;i <pCadena.length();i++)
			if(		pCadena.toUpperCase().charAt(i)=='A' ||
					pCadena.toUpperCase().charAt(i)=='E' ||
					pCadena.toUpperCase().charAt(i)=='I' ||
					pCadena.toUpperCase().charAt(i)=='O' ||
					pCadena.toUpperCase().charAt(i)=='U' )
				vocales++;
		
		return vocales;
		
	}
	/**
	 * Este metodo inspecciona el parametro de entrada 
	 * a ver si contiene 2 espacios.
	 * @param pCadena
	 * @return true/false
	 */
	public static boolean containsDobleSpace(String pCadena){
		int espacios=0;
		for (int i =0;i <pCadena.length();i++)
			if(pCadena.toUpperCase().charAt(i)==' ')
				espacios++;
		
		return (espacios>=2);
		
	}
	/**
	 * Devuelve true para el caso de contener un numero
	 * @param pCadena
	 * @return true/false
	 */
	public static boolean containsNumber(String pCadena){
		int numeros=0;
		for (int i=0;i<pCadena.length();++i) {
			if (pCadena.toUpperCase().charAt(i)=='0' ||
				pCadena.toUpperCase().charAt(i)=='1' ||
				pCadena.toUpperCase().charAt(i)=='2' ||
				pCadena.toUpperCase().charAt(i)=='3' ||
				pCadena.toUpperCase().charAt(i)=='4' ||
				pCadena.toUpperCase().charAt(i)=='5' ||
				pCadena.toUpperCase().charAt(i)=='6' ||
				pCadena.toUpperCase().charAt(i)=='7' ||
				pCadena.toUpperCase().charAt(i)=='8' ||
				pCadena.toUpperCase().charAt(i)=='9'){
				++numeros;
			}	
		}	
		
		return (numeros>0);
	}

}
