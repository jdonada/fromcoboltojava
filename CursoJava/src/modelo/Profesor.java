package modelo;

public class Profesor extends Persona {
	
	private String iosfa;

	public Profesor() {
		super();
		iosfa = " ";
	}
		
	public Profesor(String pIo) {
		super();
		iosfa = pIo;
	}

	public Profesor(String pNom, String pApe, String pIo) {
		super(pNom, pApe);
		iosfa = pIo; 
	}

	public String getIosfa() {
		return iosfa;
	}

	public void setIosfa(String pIo) {
		iosfa = pIo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
    	sb.append(",iosfa=");
    	sb.append(iosfa);
    	return sb.toString();
	}

	@Override
	public int hashCode() {
		return super.hashCode() + iosfa.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return  super.equals(obj) 		&&
				obj instanceof Profesor &&
				iosfa == ((Profesor)obj).getIosfa();	
	}
	
	

}
