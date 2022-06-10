package es.com.alliance.curso.modelo.dao.selectStrategy;

public class SelectApellidoLikeStrategy extends SelectAlumnoStrategy {

	@Override
	public boolean validar() {		
		return 	alumno.getApellido()!=null 		&&
				!alumno.getApellido().isEmpty()	&&
				tipoDeConsulta == EqualsLike.LIKE;
	}

	@Override
	public void addCampo() {
		sql.append(" WHERE APELLIDO LIKE %'");
		sql.append(alumno.getApellido());
		sql.append("%'");		

	}

	@Override
	public boolean isUltimo() {		
		return false;
	}

}
