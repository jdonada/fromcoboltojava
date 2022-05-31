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
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(maximasuperficie);
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Figura))
			return false;
		Figura other = (Figura) obj;
		if (Float.floatToIntBits(maximasuperficie) != Float.floatToIntBits(other.maximasuperficie))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Figura [maximasuperficie=" + maximasuperficie + ", nombre=" + nombre + "]";
	}			
	
}
