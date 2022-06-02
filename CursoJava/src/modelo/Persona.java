package modelo;

public abstract class Persona {
	
	private String apellido;
	private String nombre;

	public Persona(){
		apellido = "Garcia";
		nombre   = "Jose";
	}

	public Persona(String pNom, String pApe){
		nombre   = pNom;
		apellido = pApe;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return apellido.hashCode() + nombre.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return  obj instanceof Persona                 &&
				nombre   == ((Persona)obj).getNombre() &&
				apellido == ((Persona)obj).getApellido();		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
    	sb.append(",nombre=");
    	sb.append(nombre);
    	sb.append(",apellido=");
    	sb.append(apellido);
    	return sb.toString();
	}	

}
