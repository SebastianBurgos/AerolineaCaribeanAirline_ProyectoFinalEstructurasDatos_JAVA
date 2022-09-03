package co.edu.uniquindio.ed.aerolinea.model;

public class Piloto extends Persona {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Metodo constructor para la clase Piloto
	 * 
	 * @param identificacion
	 * @param nombre
	 * @param direccion
	 * @param correo
	 * @param fechaNacimiento
	 * @param estudiosRealizados
	 */
	public Piloto(String identificacion, String nombre, String direccion, String correo, String fechaNacimiento,
			String estudiosRealizados) {
		super(identificacion, nombre, direccion, correo, fechaNacimiento, estudiosRealizados);
		// TODO Auto-generated constructor stub
	}
	
	public Piloto() {
		
	}

	@Override
	public String toString() {
		return "Piloto []";
	}
	
	

}
