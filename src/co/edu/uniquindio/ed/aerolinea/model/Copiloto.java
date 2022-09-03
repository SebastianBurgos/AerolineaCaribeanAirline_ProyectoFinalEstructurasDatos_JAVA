package co.edu.uniquindio.ed.aerolinea.model;

import java.io.Serializable;

public class Copiloto extends Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Copiloto(String identificacion, String nombre, String direccion, String correo, String fechaNacimiento,
			String estudiosRealizados) {
		super(identificacion, nombre, direccion, correo, fechaNacimiento, estudiosRealizados);
		// TODO Auto-generated constructor stub
	}

	public Copiloto() {
		
	}
	
	@Override
	public String toString() {
		return "Copiloto []";
	}

	
}
