package com.tew.business;

import java.util.List;

import com.tew.business.exception.EntityAlreadyExistsException;
import com.tew.business.exception.EntityNotFoundException;
import com.tew.model.Piso;
import com.tew.model.PisoParaVisitar;

public interface PisoParaVisitarService {

	
	List<PisoParaVisitar> getPisosParaVisitar() throws Exception;
	void deletePisoParaVisitar(long idCliente, long idPiso) throws EntityNotFoundException;
	PisoParaVisitar findById(long idCliente, long idPiso) throws EntityNotFoundException;
	void savePisoParaVisitar(PisoParaVisitar alumno) throws EntityAlreadyExistsException;
	void updatePisoParaVisitar(PisoParaVisitar alumno) throws EntityNotFoundException;
	
	
}
