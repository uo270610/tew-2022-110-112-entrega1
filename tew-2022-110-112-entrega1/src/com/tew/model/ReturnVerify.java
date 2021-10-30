package com.tew.model;

public class ReturnVerify {

	private User usuario;
    private String clase;

    public ReturnVerify(User usador, String clasecita) {
        this.usuario = usador;
        this.clase = clasecita;
    }

    public User getUsuario() {
    	try{
    		return usuario;
    	}
    	catch(Exception e) {
    			return null;
    	}
    }

    public String getTipoUsuario() {
        return clase;
    }
    
    public void setUsuario(User usador) {
    	this.usuario=usador;
    }
    
    public void setClase(String clasecita) {
    	this.clase=clasecita;
    }
}
	
