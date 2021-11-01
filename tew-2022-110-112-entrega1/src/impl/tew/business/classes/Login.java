package impl.tew.business.classes;

import com.tew.infrastructure.Factories;
import com.tew.model.ReturnVerify;
import com.tew.persistence.LoginDao;
import com.tew.persistence.exception.NotPersistedException;

public class Login {

	public ReturnVerify verify(String name, String passwd) throws NotPersistedException {
		LoginDao dao = Factories.persistence.createLoginDao();
		ReturnVerify rv = dao.verify(name, passwd);
		if(rv==null) {
			throw new NotPersistedException("No se ha encontrado al usuario");
		}
		return rv;
	}
	
}
