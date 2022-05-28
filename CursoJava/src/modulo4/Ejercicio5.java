package modulo4;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Realizar un ciclo do while que muestre 10 números al azar (Math.random() )
		//informando el máximo y el mínimo de ellos.
		
		double min = 10;
		double max = 0;
		double   r = 0;
		int      i = 0;
		
		do {
			r = Math.random()*10;			
			System.out.println(r);
			++i;
			
			if (r<min) {
				min = r;
			}
			
			if (r>max) {
				max = r;
			}
			
		} while (i<10);
		
		System.out.println("min: "+ min);
		System.out.println("max: "+ max);
	}

}
