package modulo3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Ingrese variable n1: ");
		int n1 = sc.nextInt();
		System.out.println("Ingrese variable n2: ");
		int n2 = sc.nextInt();
		System.out.println("Ingrese variable n3: ");
		int n3 = sc.nextInt();
		
		if (n1>n2) {
			if (n1>n3)
				System.out.println("la variable mayor es n1");
		}else if (n2>n3)
			System.out.println("la variable mayor es n2");
		else {
			System.out.println("la variable mayor es n3");
		}
			
		sc.close();
	}

}
