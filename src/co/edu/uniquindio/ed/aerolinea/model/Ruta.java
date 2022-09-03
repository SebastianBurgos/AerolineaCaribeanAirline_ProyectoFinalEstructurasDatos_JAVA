package co.edu.uniquindio.ed.aerolinea.model;

import java.io.Serializable;

import co.edu.uniquindio.ed.aerolinea.resources.TipoRuta;

public class Ruta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributos de la clase Ruta
	 */
	private String ciudadOrigen;
	private String ciudadDestino;
	private Integer duracion;
	private String horaSalida;
	private String tiempoEspera;
	private TipoRuta tipoRuta;

	/**
	 * Metodo constructor para la clase Ruta
	 * 
	 * @param ciudadOrigen
	 * @param ciudadDestino
	 * @param duracion
	 * @param horaSalida
	 * @param tiempoEspera
	 * @param tipoRuta
	 */
	public Ruta(String ciudadOrigen, String ciudadDestino, Integer duracion, String horaSalida, String tiempoEspera,
			TipoRuta tipoRuta) {
		super();
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.duracion = duracion;
		this.horaSalida = horaSalida;
		this.tiempoEspera = tiempoEspera;
		this.tipoRuta = tipoRuta;
	}
	
	public Ruta() {
		
	}

	/**
	 * Metodos get y set de la clase Ruta
	 * 
	 * @return
	 */
	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getTiempoEspera() {
		return tiempoEspera;
	}

	public void setTiempoEspera(String tiempoEspera) {
		this.tiempoEspera = tiempoEspera;
	}

	public TipoRuta getTipoRuta() {
		return tipoRuta;
	}

	public void setTipoRuta(TipoRuta tipoRuta) {
		this.tipoRuta = tipoRuta;
	}

	@Override
	public String toString() {
		return "Ruta [ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", duracion=" + duracion
				+ ", horaSalida=" + horaSalida + ", tiempoEspera=" + tiempoEspera + ", tipoRuta=" + tipoRuta + "]";
	}
	
	

}
