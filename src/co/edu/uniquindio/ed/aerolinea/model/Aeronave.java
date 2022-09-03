package co.edu.uniquindio.ed.aerolinea.model;

import java.io.Serializable;
import java.util.LinkedHashMap;

import co.edu.uniquindio.ed.aerolinea.resources.TipoAeronave;

public class Aeronave implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributos de la clase Aeronave
	 */
	private TipoAeronave tipoAeronave;
	private Integer capacidadAsientos;
	private Float capacidadCarga;
	private String numeracionEjecutiva;
	private String numeracionEconomica;

	private Tripulacion tripulacion;
	private LinkedHashMap<Asiento, Asiento> listaAsientos;

	/**
	 * Metodo constructor para la clase Aeronave
	 * @param tipoAeronave
	 * @param capacidadAsientos
	 * @param capacidadCarga
	 * @param numeracionEjecutiva
	 * @param numeracionEconomica
	 */
	public Aeronave(TipoAeronave tipoAeronave, Integer capacidadAsientos, Float capacidadCarga,
			String numeracionEjecutiva, String numeracionEconomica) {
		super();
		this.tipoAeronave = tipoAeronave;
		this.capacidadAsientos = capacidadAsientos;
		this.capacidadCarga = capacidadCarga;
		this.numeracionEjecutiva = numeracionEjecutiva;
		this.numeracionEconomica = numeracionEconomica;
	}

	public Aeronave() {
		
	}

	/**
	 * Metodos get y set de la clase Aeronave
	 * @return
	 */
	public TipoAeronave getTipoAeronave() {
		return tipoAeronave;
	}

	public void setTipoAeronave(TipoAeronave tipoAeronave) {
		this.tipoAeronave = tipoAeronave;
	}

	public Integer getCapacidadAsientos() {
		return capacidadAsientos;
	}

	public void setCapacidadAsientos(Integer capacidadAsientos) {
		this.capacidadAsientos = capacidadAsientos;
	}

	public Float getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(Float capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public String getNumeracionEjecutiva() {
		return numeracionEjecutiva;
	}

	public void setNumeracionEjecutiva(String numeracionEjecutiva) {
		this.numeracionEjecutiva = numeracionEjecutiva;
	}

	public String getNumeracionEconomica() {
		return numeracionEconomica;
	}

	public void setNumeracionEconomica(String numeracionEconomica) {
		this.numeracionEconomica = numeracionEconomica;
	}

	public Tripulacion getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(Tripulacion tripulacion) {
		this.tripulacion = tripulacion;
	}

	public LinkedHashMap<Asiento, Asiento> getListaAsientos() {
		return listaAsientos;
	}

	public void setListaAsientos(LinkedHashMap<Asiento, Asiento> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}

	@Override
	public String toString() {
		return "Aeronave [tipoAeronave=" + tipoAeronave + ", capacidadAsientos=" + capacidadAsientos
				+ ", capacidadCarga=" + capacidadCarga + ", numeracionEjecutiva=" + numeracionEjecutiva
				+ ", numeracionEconomica=" + numeracionEconomica + ", tripulacion=" + tripulacion + ", listaAsientos="
				+ listaAsientos + "]";
	}



}
