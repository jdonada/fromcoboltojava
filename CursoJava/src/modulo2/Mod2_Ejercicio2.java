package modulo2;
/**
 * 
 * @author Jordi
 *
 */
public class Mod2_Ejercicio2 {

	public static void main(String[] args) {
		byte bmin  = -128;
		byte bmax  = 127;
		short smin = -32768;
		short smax = 32767;
		int imax   = -2147483648;
		int imin   = 2147483647;
//Es necesario añadir el L al final del número para que Java lo reconozca como un long
		long lmin  = -9223372036854775808L;
		long lmax  = 9223372036854775807L;
		
		System.out.println("tipo\tminimo\tmaximo");
		System.out.println("....\t......\t......");
		System.out.println("\nbyte\t" + bmin + "\t" + bmax);
		System.out.println("\nshort\t" + smin + "\t" + smax);
		System.out.println("\nint\t" + imax + "\t" + imin);
		System.out.println("\nlong\t" + lmin + "\t" + lmax);

	}
	
	//Cuál es la fórmula general que me permite mostrar los mínimos y los máximos teniendo en
	//cuenta la cantidad de bits?
	
	//No lo se, pero me gustaria saberlo. Gracias Gabriel!

}
