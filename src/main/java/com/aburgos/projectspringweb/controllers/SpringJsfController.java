/**
 * 
 */
package com.aburgos.projectspringweb.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.aburgos.projectspringweb.services.SpringService;

/**
 * @author Alexis
 *
 */

@ManagedBean
@ViewScoped
public class SpringJsfController {
	
	@ManagedProperty("#{springServiceImpl}")
	private SpringService springServiceImpl;
	
	private String mostrar;
	
	private String nombreEmpleado;
	
	@PostConstruct
	public void init() {
		
		System.out.println(this.springServiceImpl.mostrar());
		
		this.mostrar = this.springServiceImpl.mostrar();
		
		String nombreEmpleado = this.springServiceImpl.mostrarNombreEmpleado();
		
		System.out.println(nombreEmpleado);
		
		this.nombreEmpleado = nombreEmpleado;
	}

	/**
	 * @return the springServiceImpl
	 */
	public SpringService getSpringServiceImpl() {
		return springServiceImpl;
	}

	/**
	 * @param springServiceImpl the springServiceImpl to set
	 */
	public void setSpringServiceImpl(SpringService springServiceImpl) {
		this.springServiceImpl = springServiceImpl;
	}

	/**
	 * @return the mostrar
	 */
	public String getMostrar() {
		return mostrar;
	}

	/**
	 * @param mostrar the mostrar to set
	 */
	public void setMostrar(String mostrar) {
		this.mostrar = mostrar;
	}

	/**
	 * @return the nombreEmpleado
	 */
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	/**
	 * @param nombreEmpleado the nombreEmpleado to set
	 */
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	
	

}
