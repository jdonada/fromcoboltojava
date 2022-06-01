package modelo;

public class Circulo extends Figura {
	
	private float radio;

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
		radio = 0;
	}

	public Circulo(String pNombre, float pRadio) {
		
		super(pNombre);
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
		return super.hashCode() + Float.floatToIntBits(radio);	
	}

	@Override
	public boolean equals(Object obj) {
		return  super.equals(obj) 		&&
				obj instanceof Circulo  &&
				radio == ((Circulo)obj).getRadio();		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
    	sb.append(",radio=");
    	sb.append(radio);
    	return sb.toString();
	}


		

}
