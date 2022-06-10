package es.com.alliance.curso.modelo.dao.selectStrategy;

public class SelectNombreEqualsConWhereStrategy extends SelectAlumnoStrategy {

	@Override
	public boolean validar() {		
		return 	alumno.getNombre()!=null 						&&
				!alumno.getNombre().isEmpty()					&&
				tipoDeConsulta == EqualsLike.EQUALS 			&&
				sql.toString().toUpperCase().contains("WHERE")	;
	}

	@Override
	public void addCampo() {
		sql.append(" AND NOMBRE='");
		sql.append(alumno.getNombre());
		sql.append("'");
		

	}

	@Override
	public boolean isUltimo() {		
		return false;
	}

}
