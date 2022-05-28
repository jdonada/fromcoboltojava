package modulo4;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Realizar un ciclo while que muestre 10 números al azar informando 
		//su suma y su promedio
		
		int    i = 0;
		double n = 0;
		double r = 0;
		
		while(i<10){
			r = Math.random()*10;
			n = n + r;
			System.out.println(r);
			++i;
		}		
		
		System.out.println("Suma: "+ n);
		System.out.println("Promedio: "+ n/10);
	}   

}
