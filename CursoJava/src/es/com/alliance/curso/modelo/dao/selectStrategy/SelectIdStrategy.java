package es.com.alliance.curso.modelo.dao.selectStrategy;

public class SelectIdStrategy extends SelectAlumnoStrategy {

	@Override
	public boolean validar() {
		return alumno.getCodigo()>0;
	}

	@Override
	public void addCampo() {
		sql.append( " WHERE ALU_ID =");
		sql.append(alumno.getCodigo());

	}

	@Override
	public boolean isUltimo() {
		return true;
	}

}
