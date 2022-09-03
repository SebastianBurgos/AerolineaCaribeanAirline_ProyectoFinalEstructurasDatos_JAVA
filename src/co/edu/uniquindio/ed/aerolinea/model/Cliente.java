package co.edu.uniquindio.ed.aerolinea.model;

import java.io.Serializable;
import java.util.HashMap;

public class Cliente extends Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributos de la clase Cliente
	 */
	private Float saldoDisponible;

	private HashMap<String, Tiquete> listaTiquetes = new HashMap<String, Tiquete>();

	/**
	 * Metodo constructor de la clase Cliente
	 * 
	 * @param identificacion
	 * @param nombre
	 * @param direccion
	 * @param correo
	 * @param fechaNacimiento
	 * @param estudiosRealizados
	 * @param saldoDisponible
	 */
	public Cliente(String identificacion, String nombre, String direccion, String correo, String fechaNacimiento,
			String estudiosRealizados, Float saldoDisponible) {
		super(identificacion, nombre, direccion, correo, fechaNacimiento, estudiosRealizados);
		this.saldoDisponible = saldoDisponible;
	}

	public Cliente() {
		
	}

	/**
	 * Metodos get y set para la clase Cliente
	 * 
	 * @return
	 */
	public Float getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(Float saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public HashMap<String, Tiquete> getListaTiquetes() {
		return listaTiquetes;
	}

	public void setListaTiquetes(HashMap<String, Tiquete> listaTiquetes) {
		this.listaTiquetes = listaTiquetes;
	}

	@Override
	public String toString() {
		return "Cliente [saldoDisponible=" + saldoDisponible + ", listaTiquetes=" + listaTiquetes + "]";
	}

	
}
