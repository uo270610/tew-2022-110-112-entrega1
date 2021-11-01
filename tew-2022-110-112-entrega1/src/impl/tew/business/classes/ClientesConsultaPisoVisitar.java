package impl.tew.business.classes;

import com.tew.infrastructure.Factories;
import com.tew.persistence.ClienteDao;

public class ClientesConsultaPisoVisitar {

	public void consultaPisoVisitar(Long id) {
		ClienteDao dao = Factories.persistence.createClienteDao();
		try {
			dao.consultaPisoVisitar(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
