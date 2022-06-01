package modelo;

public abstract class Figura {
	protected float maximasuperficie;
	private String nombre;		
	
	public Figura() {
		this.maximasuperficie = 0;
		this.nombre 	 	  = "figura";
	}
	
	public Figura(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract  float calcularperimetro();
	public abstract  float calcularSuperficie();		
	
	protected float getMaximasuperficie() {
		return maximasuperficie;
	}
	public void setMaximasuperficie(float maximasuperficie) {
		this.maximasuperficie = maximasuperficie;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int hashCode() {				
		return Float.floatToIntBits(maximasuperficie) + nombre.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean bln = false;
		if (obj instanceof Figura) {
			Figura fig = (Figura)obj;
			bln = nombre           == fig.getNombre() &&
				  maximasuperficie == fig.getMaximasuperficie();					
		}
		return bln;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("\nnombre=");
		sb.append(nombre);
		sb.append(",maximasuperficie=");
		sb.append(maximasuperficie);	
		
		return sb.toString();

	}			
	
}
