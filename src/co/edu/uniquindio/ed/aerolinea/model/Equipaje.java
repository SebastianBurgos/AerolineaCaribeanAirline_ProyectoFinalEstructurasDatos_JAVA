package co.edu.uniquindio.ed.aerolinea.model;

import java.io.Serializable;

public class Equipaje implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributos de la clase Equipaje
	 */
	private Integer numeroPiezas;
	private Float pesoTotal;

	private Pieza pieza;
	private Pieza piezaMano;
	private Mascota mascota;

	/**
	 * Metodo constructor para la clase Equipaje
	 * 
	 * @param numeroPiezas
	 * @param pesoTotal
	 */
	public Equipaje(Integer numeroPiezas, Float pesoTotal) {
		super();
		this.numeroPiezas = numeroPiezas;
		this.pesoTotal = pesoTotal;
	}
	
	public Equipaje() {
	
	}

	/**
	 * Metodos get y set para la clase Equipaje
	 * 
	 * @return
	 */
	public Integer getNumeroPiezas() {
		return numeroPiezas;
	}

	public void setNumeroPiezas(Integer numeroPiezas) {
		this.numeroPiezas = numeroPiezas;
	}

	public Float getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(Float pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public Pieza getPiezaMano() {
		return piezaMano;
	}

	public void setPiezaMano(Pieza piezaMano) {
		this.piezaMano = piezaMano;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	@Override
	public String toString() {
		return "Equipaje [numeroPiezas=" + numeroPiezas + ", pesoTotal=" + pesoTotal + ", pieza=" + pieza
				+ ", piezaMano=" + piezaMano + ", mascota=" + mascota + "]";
	}
	
	

}
