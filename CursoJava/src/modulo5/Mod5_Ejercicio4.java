package modulo5;

public class Mod5_Ejercicio4 {

	public static void main(String[] args) {
		String str = "esto es una prueba de la clase String";
		int num_vocales     = 0;
		int num_consonantes = 0;
		
		for (int i=0;i<str.length();++i) {
			if (str.toUpperCase().charAt(i)=='A' ||
				str.toUpperCase().charAt(i)=='E' ||
				str.toUpperCase().charAt(i)=='I' ||
				str.toUpperCase().charAt(i)=='O' ||
				str.toUpperCase().charAt(i)=='U'){
				++num_vocales;
			}else if (str.charAt(i)!=' '){
				++num_consonantes;
			}											
		}
		
		System.out.println("Vocales    : " + num_vocales);
		System.out.println("Consonantes: " + num_consonantes);

	}

}
