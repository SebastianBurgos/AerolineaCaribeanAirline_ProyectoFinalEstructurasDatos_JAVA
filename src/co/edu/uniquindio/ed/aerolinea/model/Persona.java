package co.edu.uniquindio.ed.aerolinea.model;

import java.io.Serializable;

public class Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributos de la clase Persona (Clase Padre de las Clases Piloto,
	 * Copiloto, AuxiliarVuelo y Cliente)
	 */
	private String identificacion;
	private String nombre;
	private String direccion;
	private String correo;
	private String fechaNacimiento;
	private String estudiosRealizados;

	/**
	 * Metodo constructor para la clase abstracta Persona
	 * 
	 * @param identificacion
	 * @param nombre
	 * @param direccion
	 * @param correo
	 * @param fechaNacimiento
	 * @param estudiosRealizados
	 */
	public Persona(String identificacion, String nombre, String direccion, String correo, String fechaNacimiento,
			String estudiosRealizados) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
		this.estudiosRealizados = estudiosRealizados;
	}

	public Persona() {
	
	}

	/**
	 * Metodos get y set de la clase Persona
	 * 
	 * @return
	 */
	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstudiosRealizados() {
		return estudiosRealizados;
	}

	public void setEstudiosRealizados(String estudiosRealizados) {
		this.estudiosRealizados = estudiosRealizados;
	}

	@Override
	public String toString() {
		return "Persona [identificacion=" + identificacion + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", correo=" + correo + ", fechaNacimiento=" + fechaNacimiento + ", estudiosRealizados="
				+ estudiosRealizados + "]";
	}

	
}
