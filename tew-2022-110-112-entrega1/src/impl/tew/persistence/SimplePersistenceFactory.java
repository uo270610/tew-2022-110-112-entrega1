package impl.tew.persistence;

import com.tew.persistence.AgenteDao;
import com.tew.persistence.ClienteDao;
import com.tew.persistence.PersistenceFactory;
import com.tew.persistence.PisoDao;

public class SimplePersistenceFactory implements PersistenceFactory{

	@Override
	public ClienteDao createClienteDao() {
		// TODO Auto-generated method stub
		return new ClienteJdbcDao();
	}

	@Override
	public AgenteDao createAgenteDao() {
		// TODO Auto-generated method stub
		return new AgenteJdbcDao();
	}

	@Override
	public PisoDao createPisoDao() {
		// TODO Auto-generated method stub
		return new PisoJdbcDao();
	}
	
	

}
