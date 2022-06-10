package es.com.alliance.curso.modelo.dao.selectStrategy;

public class SelectNombreLikeSinWhereStrategy extends SelectAlumnoStrategy {

	@Override
	public boolean validar() {		
		return 	alumno.getNombre()!=null 						&&
				!alumno.getNombre().isEmpty()					&&
				tipoDeConsulta == EqualsLike.LIKE 				&&
				!sql.toString().toUpperCase().contains("WHERE")	;
	}

	@Override
	public void addCampo() {
		sql.append(" WHERE NOMBRE LIKE%'");
		sql.append(alumno.getNombre());
		sql.append("%'");
		

	}

	@Override
	public boolean isUltimo() {		
		return false;
	}

}