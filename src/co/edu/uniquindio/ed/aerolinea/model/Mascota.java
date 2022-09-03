package co.edu.uniquindio.ed.aerolinea.model;

import java.io.Serializable;

public class Mascota implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributos de la clase Mascota
	 */
	private Float peso;

	/**
	 * Metodo constructor para la clase Mascota
	 * 
	 * @param peso
	 */
	public Mascota(Float peso) {
		super();
		this.peso = peso;
	}
	
	public Mascota() {
		
	}

	/**
	 * Metodos get y set de la clase Mascota
	 * 
	 * @return
	 */
	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Mascota [peso=" + peso + "]";
	}

	
}
