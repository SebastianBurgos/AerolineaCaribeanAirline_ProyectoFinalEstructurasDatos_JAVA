package co.edu.uniquindio.ed.aerolinea.model;

import java.io.Serializable;

public class AuxiliarVuelo extends Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * Metodo constructor de la clase AuxiliarVuelo
	 * 
	 * @param identificacion
	 * @param nombre
	 * @param direccion
	 * @param correo
	 * @param fechaNacimiento
	 * @param estudiosRealizados
	 */
	public AuxiliarVuelo(String identificacion, String nombre, String direccion, String correo, String fechaNacimiento,
			String estudiosRealizados) {
		super(identificacion, nombre, direccion, correo, fechaNacimiento, estudiosRealizados);
		// TODO Auto-generated constructor stub
	}
	
	public AuxiliarVuelo() {
		
	}

	@Override
	public String toString() {
		return "AuxiliarVuelo []";
	}

	
}
