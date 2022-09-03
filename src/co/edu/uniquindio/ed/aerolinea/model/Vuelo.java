package co.edu.uniquindio.ed.aerolinea.model;

import java.io.Serializable;

public class Vuelo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributos de la clase Vuelo
	 */
	private String numeroVuelo;
	private Float precioPorPersona;
	private Float precio;
	private String fechaIda;
	private String fechaRegreso;
	private Ruta ruta;

	/**
	 * Metodo constructor de clase Vuelo
	 * 
	 * @param numeroVuelo
	 */
	public Vuelo(String numeroVuelo, Float precioPorPersona, String fechaIda, String fechaRegreso, Ruta ruta) {
		super();
		this.numeroVuelo = numeroVuelo;
		this.precioPorPersona = precioPorPersona;
		this.fechaIda = fechaIda;
		this.fechaRegreso = fechaRegreso;
		this.ruta = ruta;
	}
	
	public Vuelo() {
	
	}

	/**
	 * Metodos set y get
	 * 
	 * @return
	 */

	public String getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public Float getPrecioPorPersona() {
		return precioPorPersona;
	}

	public void setPrecioPorPersona(Float precioPorPersona) {
		this.precioPorPersona = precioPorPersona;
	}

	public String getFechaIda() {
		return fechaIda;
	}

	public void setFechaIda(String fechaIda) {
		this.fechaIda = fechaIda;
	}

	public String getFechaRegreso() {
		return fechaRegreso;
	}

	public void setFechaRegreso(String fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "Vuelo [numeroVuelo=" + numeroVuelo + ", precioPorPersona=" + precioPorPersona + ", precio=" + precio
				+ ", fechaIda=" + fechaIda + ", fechaRegreso=" + fechaRegreso + ", ruta=" + ruta + "]";
	}
	
	

}
