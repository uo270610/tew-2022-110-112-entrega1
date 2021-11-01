package impl.tew.business;

import java.util.List;

import com.tew.model.PisoParaVisitar;
import com.tew.persistence.exception.NotPersistedException;

import impl.tew.business.classes.PisosParaVisitarBaja;
import impl.tew.business.classes.PisosParaVisitarListado;

public class SimplePisoParaVisitarServices {

	List<PisoParaVisitar> getPisosParaVisitar() throws Exception {
		return new PisosParaVisitarListado().getPisosParaVisitar();		
	}
	
	void deletePisoParaVisitar(long idp, long idc) throws NotPersistedException {
		new PisosParaVisitarBaja().delete(idp, idc);
	}
	
}
