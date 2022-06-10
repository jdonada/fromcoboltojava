package es.com.alliance.curso.modelo.dao.selectStrategy;

public class SelectApellidoEqualStrategy extends SelectAlumnoStrategy {

	@Override
	public boolean validar() {		
		return 	alumno.getApellido()!=null 		&&
				!alumno.getApellido().isEmpty()	&&
				tipoDeConsulta == EqualsLike.EQUALS;
	}

	@Override
	public void addCampo() {
		sql.append(" WHERE ALU_APELLIDO='");
		sql.append(alumno.getApellido());
		sql.append("'");
		

	}

	@Override
	public boolean isUltimo() {		
		return false;
	}

}
