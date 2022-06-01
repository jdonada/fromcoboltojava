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
		return super.hashCode() + Float.floatToIntBits(base) 
		                        + Float.floatToIntBits(altura);
	}

	@Override
	public boolean equals(Object obj) {
		return  super.equals(obj) 		                &&
				obj instanceof Rectangulo               &&
				base == ((Rectangulo)obj).getBase()     &&
				altura == ((Rectangulo)obj).getAltura();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
    	sb.append(",base=");
    	sb.append(base);
    	sb.append(",altura=");
    	sb.append(altura);
    	return sb.toString();
	}			

}
