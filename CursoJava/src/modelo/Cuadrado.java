package modelo;

public class Cuadrado extends Figura {
	
	private float lado;

	@Override
	public float calcularperimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Cuadrado() {
		super();
		lado = 0;
	}

	public Cuadrado(String nombre, float pLado) {
		super(nombre);
		lado = pLado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + Float.floatToIntBits(lado);	
	}

	@Override
	public boolean equals(Object obj) {
		return  super.equals(obj) 		&&
				obj instanceof Cuadrado  &&
				lado == ((Cuadrado)obj).getLado();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
    	sb.append(",lado=");
    	sb.append(lado);
    	return sb.toString();
	}
			

}
