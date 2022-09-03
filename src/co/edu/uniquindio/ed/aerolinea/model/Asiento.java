package co.edu.uniquindio.ed.aerolinea.model;

import java.io.Serializable;

import co.edu.uniquindio.ed.aerolinea.resources.TipoClase;

public class Asiento implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributos de la clase Asiento
	 */
	private TipoClase tipoAsiento;
	private String codigo;
	private Integer fila;
	private Character ubicacion;

	/**
	 * Metodo constructor de la clase Asiento
	 * 
	 * @param tipoAsiento
	 * @param codigo
	 * @param fila
	 * @param ubicacion
	 */
	public Asiento(TipoClase tipoAsiento, String codigo, Integer fila, Character ubicacion) {
		super();
		this.tipoAsiento = tipoAsiento;
		this.codigo = codigo;
		this.fila = fila;
		this.ubicacion = ubicacion;
	}
	
	public Asiento() {
		
	}

	/**
	 * Metodos get y set para la clase Asiento
	 * 
	 * @return
	 */
	public TipoClase getTipoAsiento() {
		return tipoAsiento;
	}

	public void setTipoAsiento(TipoClase tipoAsiento) {
		this.tipoAsiento = tipoAsiento;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getFila() {
		return fila;
	}

	public void setFila(Integer fila) {
		this.fila = fila;
	}

	public Character getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Character ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Asiento [tipoAsiento=" + tipoAsiento + ", codigo=" + codigo + ", fila=" + fila + ", ubicacion="
				+ ubicacion + "]";
	}

	
}
