package modulo3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese evalucion1");
		float a = sc.nextInt();
		System.out.println("Ingrese evalucion2");
		float b = sc.nextInt();
		System.out.println("Ingrese evalucion2");
		float c = sc.nextInt();
		float promedio = (a+b+c)/3;
		System.out.println("Nota media: " + promedio);
		if (promedio>=7) {
			System.out.println("Aprobado");
		}else {
				System.out.println("Reprobado");
		}				
		
		sc.close();
	}

}
