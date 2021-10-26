/**
 * 
 */
package com.aburgos.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.aburgos.projectspringweb.dao.EmpleadoDAO;

/**
 * @author Alexis
 *
 */

@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		return "Alexis burgos";
	}

}
