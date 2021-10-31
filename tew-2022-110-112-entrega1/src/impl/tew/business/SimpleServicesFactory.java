package impl.tew.business;


import com.tew.business.AgenteService;
import com.tew.business.ClienteService;
import com.tew.business.LoginService;
import com.tew.business.PublicoService;
import com.tew.business.ServicesFactory;

public class SimpleServicesFactory implements ServicesFactory {

	@Override
	public LoginService createLoginService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PublicoService createPublicoService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteService createClienteService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AgenteService createAgenteService() {
		// TODO Auto-generated method stub
		return new SimpleAgenteService();
	}

}
