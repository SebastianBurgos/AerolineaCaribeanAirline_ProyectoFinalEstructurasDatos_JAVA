package co.edu.uniquindio.ed.aerolinea.infovisible;

import java.io.Serializable;

public class VueloDisponible implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String origen;
	private String destino;
	private Integer duracion;
	private Float costoPersona;
	private Float costo;
	
	private String horaSalida;
	private String horaLlegada;
	private String avion;
	
	public VueloDisponible(String origen, String destino, Integer duracion, Float costoPersona, Float costo) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.duracion = duracion;
		this.costoPersona = costoPersona;
		this.costo = costo;
	}
	
	public VueloDisponible() {
		
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public Float getCostoPersona() {
		return costoPersona;
	}

	public void setCostoPersona(Float costoPersona) {
		this.costoPersona = costoPersona;
	}

	public Float getCosto() {
		return costo;
	}

	public void setCosto(Float costo) {
		this.costo = costo;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public String getAvion() {
		return avion;
	}

	public void setAvion(String avion) {
		this.avion = avion;
	}

	@Override
	public String toString() {
		return "VueloDisponible [origen=" + origen + ", destino=" + destino + ", duracion=" + duracion
				+ ", costoPersona=" + costoPersona + ", costo=" + costo + ", horaSalida=" + horaSalida
				+ ", horaLlegada=" + horaLlegada + ", avion=" + avion + "]";
	}
	
	
}
