package com.tew.business;

import java.util.List;

import com.tew.business.exception.EntityAlreadyExistsException;
import com.tew.business.exception.EntityNotFoundException;
import com.tew.model.Piso;

public interface PisoService {

	List<Piso> getPisos() throws Exception;
	void deletePiso(Long id) throws EntityNotFoundException;
	Piso findById(Long id) throws EntityNotFoundException;
	void savePiso(Piso alumno) throws EntityAlreadyExistsException;
	void updatePiso(Piso alumno) throws EntityNotFoundException;
	
}
