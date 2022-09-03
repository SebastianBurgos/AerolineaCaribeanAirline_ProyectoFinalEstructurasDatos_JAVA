package co.edu.uniquindio.ed.aerolinea.model;

import java.io.Serializable;

public class Pieza implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributos de la clase Pieza
	 */
	private Float Peso;
	private Float alto;
	private Float ancho;
	private Float largo;
	private Float totalDimensiones;

	public Pieza(Float peso, Float alto, Float ancho, Float largo, Float totalDimensiones) {
		super();
		Peso = peso;
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
		this.totalDimensiones = totalDimensiones;
	}
	
	public Pieza() {
		
	}

	public Float getPeso() {
		return Peso;
	}

	public void setPeso(Float peso) {
		Peso = peso;
	}

	public Float getAlto() {
		return alto;
	}

	public void setAlto(Float alto) {
		this.alto = alto;
	}

	public Float getAncho() {
		return ancho;
	}

	public void setAncho(Float ancho) {
		this.ancho = ancho;
	}

	public Float getLargo() {
		return largo;
	}

	public void setLargo(Float largo) {
		this.largo = largo;
	}

	public Float getTotalDimensiones() {
		return totalDimensiones;
	}

	public void setTotalDimensiones(Float totalDimensiones) {
		this.totalDimensiones = totalDimensiones;
	}

	@Override
	public String toString() {
		return "Pieza [Peso=" + Peso + ", alto=" + alto + ", ancho=" + ancho + ", largo=" + largo
				+ ", totalDimensiones=" + totalDimensiones + "]";
	}

	
}
