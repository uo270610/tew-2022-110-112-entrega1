package impl.tew.business;

import java.util.List;

import com.tew.model.Cliente;
import com.tew.model.Piso;
import com.tew.persistence.exception.AlreadyPersistedException;
import com.tew.persistence.exception.NotPersistedException;

import impl.tew.business.classes.ClientesAlta;
import impl.tew.business.classes.ClientesBaja;
import impl.tew.business.classes.ClientesBuscar;
import impl.tew.business.classes.ClientesConsultaPorCiudad;
import impl.tew.business.classes.ClientesConsultaPorPrecio;
import impl.tew.business.classes.ClientesListado;

public class SimpleClienteService {

	List<Cliente> getClientes() throws Exception{
		
		return new ClientesListado().getCliente();
		
	}
	
	void saveCliente(Cliente cliente) throws AlreadyPersistedException {
		
		new ClientesAlta().save(cliente);
		
	}
	
	void updateCliente(long id) throws NotPersistedException {
		
		new ClientesBaja().delete(id);
		
	}
	
	Cliente findById(Long id) throws NotPersistedException {
		
		return new ClientesBuscar().find(id);
		
	}
	
	List<Piso> consultaPisosPorCiudad(String ciudad) throws NotPersistedException {
		
		return new ClientesConsultaPorCiudad().consultaPorCiudad(ciudad);
		
	}
	
	List<Piso> consultaPisosPorPrecio(int min, int max) throws NotPersistedException {
		
		return new ClientesConsultaPorPrecio().consultaPorCiudad(min, max);
		
	}
	
}