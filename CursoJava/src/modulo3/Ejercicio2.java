package modulo3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un n�mero");
		int a = sc.nextInt();
		
		if (a%2==0){
			System.out.println("el n�mero es PAR");
		}else {
			System.out.println("el n�mero es IMPAR");
			
		}
		
		sc.close();

	}

}
