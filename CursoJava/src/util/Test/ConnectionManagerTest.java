package util.Test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import util.ConnectionManager;

public class ConnectionManagerTest {
	Connection con;
	
	@Before
	public void setUp() throws ClassNotFoundException, SQLException {
		ConnectionManager.conectar();
		con = ConnectionManager.getConection();
	}
	@After
	public void tearDown() {
		con=null;
	}
	
	@Test
	public void testConectarYGetConection() {
		try {
			ConnectionManager.conectar();
			assertNotNull(ConnectionManager.getConection());
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			assertTrue(false);
			
		}
	}
	@Test
	public void testDesconectar() throws SQLException {
		ConnectionManager.desConectar();
		assertTrue(con.isClosed());
	}

}
