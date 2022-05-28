package modulo3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una categoria");
		String cat = sc.next();
		
		if (cat.toUpperCase().equals("A")) {
			System.out.println("Hijo");
		} else if (cat.toUpperCase().equals("B")){
			System.out.println("padres");
		} else if (cat.toUpperCase().equals("C")) {
			System.out.println("abuelos");
		} else{
			System.out.println("Categoria incorrecta");
		}
		
		sc.close();

	}

}
