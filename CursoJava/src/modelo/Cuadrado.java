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
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(lado);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Cuadrado))
			return false;
		Cuadrado other = (Cuadrado) obj;
		if (Float.floatToIntBits(lado) != Float.floatToIntBits(other.lado))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", maximasuperficie=" + maximasuperficie + "]";
	}
			

}
