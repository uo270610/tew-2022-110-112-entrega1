package com.tew.persistence;

import java.util.List;

import com.tew.model.Cliente;
import com.tew.model.Piso;
import com.tew.model.PisoParaVisitar;

public interface ClienteDao {

	List<Cliente> getClientes();
	List<Piso> consultaPisosPorCiudad(String ciudad);
	List<Piso> consultaPisoPorPrecio(double min, double max);
	List<PisoParaVisitar> consultaPisoVisitar(long idCliente);
	void solicitarVisita(Piso piso, long idCliente);
	void confirmarVisita(long idPiso, long idCliente);
	
}
