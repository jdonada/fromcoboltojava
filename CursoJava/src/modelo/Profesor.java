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
		return "Profesor [iosfa=" + iosfa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((iosfa == null) ? 0 : iosfa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Profesor))
			return false;
		Profesor other = (Profesor) obj;
		if (iosfa == null) {
			if (other.iosfa != null)
				return false;
		} else if (!iosfa.equals(other.iosfa))
			return false;
		return true;
	}
	
	

}
