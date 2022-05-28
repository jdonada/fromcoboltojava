package modulo3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int a = sc.nextInt();
		
		if (a%2==0){
			System.out.println("el número es PAR");
		}else {
			System.out.println("el número es IMPAR");
			
		}
		
		sc.close();

	}

}
