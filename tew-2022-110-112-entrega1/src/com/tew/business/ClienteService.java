package com.tew.business;

import java.util.List;

import com.tew.business.exception.EntityNotFoundException;
import com.tew.model.Cliente;
import com.tew.model.Piso;
import com.tew.model.PisoParaVisitar;
import com.tew.persistence.exception.AlreadyPersistedException;
import com.tew.persistence.exception.NotPersistedException;

public interface ClienteService {

	List<Cliente> getClientes();
	void saveCliente(Cliente a) throws AlreadyPersistedException;
	void updateCliente(Cliente a) throws NotPersistedException;
	void deleteCliente(Long id) throws NotPersistedException;
	Cliente findById(Long id) throws EntityNotFoundException;
	List<Piso> consultaPisosPorCiudad(String ciudad) throws Exception;
	List<Piso> consultaPisoPorPrecio(double min, double max) throws Exception;
	List<PisoParaVisitar> consultaPisoVisitar(long idCliente) throws Exception;
	void solicitarVisita(Piso piso, long idCliente) throws NotPersistedException;
	void confirmarVisita(long idPiso, long idCliente) throws NotPersistedException;
	
}
