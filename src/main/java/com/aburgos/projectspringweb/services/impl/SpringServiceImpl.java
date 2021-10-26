/**
 * 
 */
package com.aburgos.projectspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aburgos.projectspringweb.dao.EmpleadoDAO;
import com.aburgos.projectspringweb.services.SpringService;

/**
 * @author Alexis
 *
 */

@Service
public class SpringServiceImpl implements SpringService {
	
	@Autowired
	private EmpleadoDAO empleadoDAOImpl;

	@Override
	public String mostrar() {
		return "Anotaciones con SPRING y JSF";
	}

	@Override
	public String mostrarNombreEmpleado() {
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}

}
