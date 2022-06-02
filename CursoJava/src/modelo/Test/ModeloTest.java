package modelo.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modelo.Alumno;
import modelo.Persona;
import objetos.CajaDeAhorro;
import objetos.Cuenta;
import objetos.CuentaCorriente;

public class ModeloTest {

	//1- definicion
	Alumno AlVacio;
	Alumno AlConParametros;	
	List<Persona> listPersonas;
	
	@Before
	public void setUp() throws Exception {
		
	//2- se crean los objetos
		AlVacio = new Alumno();
		AlConParametros = new Alumno(123456);
		listPersonas = new ArrayList<Persona>();
		
		listPersonas.add(new Alumno());		
		listPersonas.add(new Alumno(1234));
	}

	@After
	public void tearDown() throws Exception {
		AlVacio = null;
		AlConParametros = null;
		listPersonas = null;
	}

	@Test
	public void testAlVacio() {
		assertEquals(100, AlVacio.getLegajo());
	}

}
