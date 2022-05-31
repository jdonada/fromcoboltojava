package modelo;

public class Rectangulo extends Figura {
	
	private float altura;
	private float base;

	@Override
	public float calcularperimetro() {		
		return 0;
	}

	@Override
	public float calcularSuperficie() {		
		return 0;
	}

	public Rectangulo() {
		super();
		altura = 0;		
		base   = 0;
	}

	public Rectangulo(String nombre, float altura, float base) {
		super(nombre);
		this.altura = altura;
		this.base   = base;		
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(altura);
		result = prime * result + Float.floatToIntBits(base);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Rectangulo))
			return false;
		Rectangulo other = (Rectangulo) obj;
		if (Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
			return false;
		if (Float.floatToIntBits(base) != Float.floatToIntBits(other.base))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rectangulo [altura=" + altura + ", base=" + base + ", maximasuperficie=" + maximasuperficie + "]";
	}

				

}
