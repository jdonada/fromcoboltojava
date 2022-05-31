package modelo;

public class Circulo extends Figura {
	
	float radio;

	@Override
	public float calcularperimetro() {
		return 0;
	}

	@Override
	public float calcularSuperficie() {
		return 0;
	}

	public Circulo() {
		super();
	}

	public Circulo( float pMaximasuperficie, String pNombre, float pRadio) {
		super(pMaximasuperficie, pNombre);
		radio = pRadio;		
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(radio);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Circulo))
			return false;
		Circulo other = (Circulo) obj;
		if (Float.floatToIntBits(radio) != Float.floatToIntBits(other.radio))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", maximasuperficie=" + maximasuperficie + ", nombre=" + nombre + "]";
	}
		

}
