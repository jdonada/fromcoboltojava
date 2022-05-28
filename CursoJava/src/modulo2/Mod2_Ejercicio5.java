package modulo2;

public class Mod2_Ejercicio5 {

	public static void main(String[] args) {
		byte  b = 10;
		short s = 20;
		int   i = 100;
		long  l = 40;
		
		b=(byte)s;
		System.out.println("\nbyte\t" + b);
		l=i;
		System.out.println("\nlong\t" + l);		
		b=(byte)i;
		System.out.println("\nint\t" + i);
		s=(short)i;							
		System.out.println("\nshort\t" + s);

		

	}

}
