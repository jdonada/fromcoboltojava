package modulo5;

public class Mod5_Ejercicio6 {

	public static void main(String[] args) {
		//String str = "esto es el ejercicio numero seis";
		String str = "esto es el ejercicio numero 6";
		int num = 0;		
		
		for (int i=0;i<str.length();++i) {
			if (str.charAt(i)=='0' ||
				str.charAt(i)=='1' ||
				str.charAt(i)=='2' ||
				str.charAt(i)=='3' ||
				str.charAt(i)=='4' ||
				str.charAt(i)=='5' ||
				str.charAt(i)=='6' ||
				str.charAt(i)=='7' ||
				str.charAt(i)=='8' ||
				str.charAt(i)=='9' ||
				str.charAt(i)=='0'){
				++num;
			}											
		}
		
		if (num>0){
			System.out.println("Contiene "+num+" números" );
		}else {
			System.out.println("No contiene números");
		}

	}

}
