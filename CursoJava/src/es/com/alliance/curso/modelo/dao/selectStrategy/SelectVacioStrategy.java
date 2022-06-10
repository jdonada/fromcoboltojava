package es.com.alliance.curso.modelo.dao.selectStrategy;

public class SelectVacioStrategy extends SelectAlumnoStrategy {


	@Override
	public boolean validar() {
		return alumno==null || alumno.isEmpty();
	}

	@Override
	public void addCampo() {
		//no agrega nada
	}

	@Override
	public boolean isUltimo() {
		return true;
	}
	

}
