package modelo;

public class Triangulo extends Figura {
	
	float lado1;
	float lado2;
	float lado3;

	@Override
	public float calcularperimetro() {
		return 0;
	}

	@Override
	public float calcularSuperficie() {		
		return 0;
	}

	public Triangulo() {
		super();
		lado1 = 0;
		lado2 = 0;
		lado3 = 0;
	}

	public Triangulo(String nombre) {
		super(nombre); 
	}
	
	

}
