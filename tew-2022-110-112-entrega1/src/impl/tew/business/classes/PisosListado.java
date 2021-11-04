package impl.tew.business.classes;

import java.util.ArrayList;
import java.util.List;

import com.tew.infrastructure.Factories;
import com.tew.model.Piso;
import com.tew.persistence.PisoDao;

public class PisosListado {

	public List<Piso> getPisos() throws Exception {
		
		//PisoDao dao = Factories.persistence.createPisoDao();
		List<Piso> pisos=new ArrayList<Piso>();
		Piso piso = new Piso();
		piso.setId((long) 4);
		piso.setIdAgente((long) 7);
		piso.setPrecio(5000);
		piso.setDireccion("mi_casa");
		piso.setCiudad("mi ciudad");
		piso.setAno(25);
		piso.setEstado(1);
		pisos.add(piso);
		return pisos;
		//return  dao.getPisos();
	
	}
	
}
