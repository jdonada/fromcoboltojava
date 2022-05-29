package modulo5;

public class Mod5_Ejercicio5 {

	public static void main(String[] args) {
		String str = "gcasas1972@gmail.com";
		
		int pos = str.indexOf("@");
		System.out.println("la posición de @ es: " + (pos + 1));
		
		String str1 = str.substring(0, pos);
		System.out.println(str1);
		
		String str2 = str.substring(pos,str.length());
		System.out.println(str2);

	}

}
