package modulo4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese número: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=10; ++i){
			
			System.out.println(n*i);
		}
		
	    sc.close();

	}

}
