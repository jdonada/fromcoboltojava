package modelo;

public class Alumno extends Persona {
	private int legajo;

	public Alumno() {
		legajo = 100;		
	}

	public Alumno(int legajo) {
		super();
		this.legajo = legajo;
	}
	
	public Alumno(String pNom, String pApe, int pLegajo) {
		super(pNom, pApe);
		this.legajo = pLegajo;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
    	sb.append(",legajo=");
    	sb.append(legajo);
    	return sb.toString();
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + legajo;
	}
	
	@Override
	public boolean equals(Object obj) {
		return  super.equals(obj) 		&&
				obj instanceof Alumno &&
				legajo == ((Alumno)obj).getLegajo();	
	}
	
}
