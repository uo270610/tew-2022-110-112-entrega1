package impl.tew.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tew.model.Agente;
import com.tew.model.Cliente;
import com.tew.model.Piso;
import com.tew.persistence.AgenteDao;
import com.tew.persistence.exception.AlreadyPersistedException;
import com.tew.persistence.exception.NotPersistedException;
import com.tew.persistence.exception.PersistenceException;

public class AgenteJdbcDao implements AgenteDao {

	@Override
	public List<Agente> getAgentes() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				PreparedStatement ps = null;
				ResultSet rs = null;
				Connection con = null;
				
				List<Agente> Agentes = new ArrayList<Agente>();

				try {
					// En una implemenntaci��n m��s sofisticada estas constantes habr��a 
					// que sacarlas a un sistema de configuraci��n: 
					// xml, properties, descriptores de despliege, etc 
					String SQL_DRV = "org.hsqldb.jdbcDriver";
					String SQL_URL = "jdbc:hsqldb:hsql://localhost/localDB";

					// Obtenemos la conexi��n a la base de datos.
					Class.forName(SQL_DRV);
					con = DriverManager.getConnection(SQL_URL, "sa", "");
					ps = con.prepareStatement("select * from Agentes");
					rs = ps.executeQuery();

					while (rs.next()) {
						Agente a = new Agente();
						a.setId(rs.getLong("ID"));
						a.setLogin(rs.getString("LOGIN"));
						a.setPasswd(rs.getString("PASSWD"));

						Agentes.add(a);
					}
					
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					throw new PersistenceException("Driver not found", e);
				} catch (SQLException e) {
					e.printStackTrace();
					throw new PersistenceException("Invalid SQL or database schema", e);
				} finally  {
					if (rs != null) {try{ rs.close(); } catch (Exception ex){}};
					if (ps != null) {try{ ps.close(); } catch (Exception ex){}};
					if (con != null) {try{ con.close(); } catch (Exception ex){}};
				}
				
				return Agentes;
	}
	
	
}