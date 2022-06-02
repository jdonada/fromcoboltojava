package modelo;

public class Triangulo extends Figura {
	
	float lado1;
	float lado2;
	float lado3;

	@Override
	public float calcularperimetro() {
		return lado1+lado2+lado3;
	}

	@Override
	public float calcularSuperficie() {		
	    float s = (lado1+lado2+lado3)/2;
	    return (float)Math.sqrt(s*((s-lado1)*(s-lado2)*(s-lado3)));
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
