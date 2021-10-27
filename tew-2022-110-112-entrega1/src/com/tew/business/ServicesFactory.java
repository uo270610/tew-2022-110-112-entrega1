package com.tew.business;

public interface ServicesFactory {
	
	PublicoService createPublicoService();
	LoginService createLoginService();
	ClienteService createClienteService();
	AgenteService createAgenteService();
	
}
