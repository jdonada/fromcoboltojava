package es.com.alliance.curso.modelo.dao.selectStrategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.com.alliance.curso.modelo.Alumno;

public abstract class SelectAlumnoStrategy {
	protected static Alumno 		alumno			;
	protected static EqualsLike 	tipoDeConsulta	;
	protected static StringBuilder 	sql				;
	
	private static List<SelectAlumnoStrategy> listaDeCampos;
	
	public static String getSql(Alumno pAlu, EqualsLike pTipoDeConexion){
		alumno 			= pAlu				;
		tipoDeConsulta	= pTipoDeConexion	;
		
		sql = new StringBuilder("select  ALU_ID, ALU_APELLIDO, ALU_NOMBRE, ALU_EMAIL, "	);		
		sql			.append	       ("ALU_CONOCIMIENTOS, ALU_GIT "			)
					.append	       (" FROM ALUMNOS  "			);
		
		listaDeCampos = new ArrayList<SelectAlumnoStrategy>();
		listaDeCampos.add(new SelectVacioStrategy());		
		listaDeCampos.add(new SelectIdStrategy());
		
		//apellido es el primero
		listaDeCampos.add(new SelectApellidoEqualStrategy());
		listaDeCampos.add(new SelectApellidoLikeStrategy());
		//nombre
		
		listaDeCampos.add(new SelectNombreEqualaSinWhereStrategy());
		listaDeCampos.add(new SelectNombreEqualsConWhereStrategy());
		listaDeCampos.add(new SelectNombreLikeConWhereStrategy());
		listaDeCampos.add(new SelectNombreLikeSinWhereStrategy());
		
		boolean isUltimo =false;
		Iterator<SelectAlumnoStrategy> iter = listaDeCampos.iterator();
			
		while(iter.hasNext() && !isUltimo){
			SelectAlumnoStrategy campo = iter.next(); 
			if(campo.validar()){
				campo.addCampo();
				isUltimo = campo.isUltimo();
			}
		}
		
		return sql.toString();
	}
	public abstract boolean validar();
	public abstract void addCampo();
	public abstract boolean isUltimo();

}
