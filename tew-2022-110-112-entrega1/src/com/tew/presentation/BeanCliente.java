 package com.tew.presentation;
import java.io.Serializable;
import java.util.ResourceBundle;

import javax.faces.bean.*;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import com.tew.model.Cliente;

@ManagedBean(name="alumno")
@SessionScoped
public class BeanCliente extends Cliente implements Serializable {
	private static final long serialVersionUID = 55556L;
	
	public BeanCliente() {
		
	}
      
}