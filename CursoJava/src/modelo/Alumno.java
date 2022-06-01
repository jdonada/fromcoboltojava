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
		//super.toString();
		return "Alumno [legajo=" + legajo + "]";
	}
	
}
