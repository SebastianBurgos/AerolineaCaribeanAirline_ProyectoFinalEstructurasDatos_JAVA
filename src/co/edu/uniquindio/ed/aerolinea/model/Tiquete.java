package co.edu.uniquindio.ed.aerolinea.model;

import java.io.Serializable;
import java.util.HashMap;

import co.edu.uniquindio.ed.aerolinea.resources.Modalidad;
import co.edu.uniquindio.ed.aerolinea.resources.TipoClase;

public class Tiquete implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributos de la clase Tiquete
	 */
	private String numeroTiquete;
	private TipoClase claseServicio;
	private Modalidad modalidad;
	private String ciudadOrigen;
	private String ciudadDestino;
	private Float valorTiquete;
	private String fechaIda;
	private String fechaRegreso;
	private Integer duracionVuelo;
	private Integer cantidadPersonas;
	private Float valorPorPersona;

	private HashMap<Cliente, Equipaje> listaEquipajes;

	/**
	 * Metodo constructor de la clase Tiquete
	 * 
	 * @param claseServicio
	 * @param modalidad
	 * @param ciudadOrigen
	 * @param ciudadDestino
	 * @param valorTiquete
	 * @param fechaIda
	 * @param fechaRegreso
	 * @param duracionVuelo
	 * @param cantidadPersonas
	 * @param valorPorPersona
	 */
	public Tiquete(String numeroTiquete, TipoClase claseServicio, Modalidad modalidad, String ciudadOrigen,
			String ciudadDestino, Float valorTiquete, String fechaIda, String fechaRegreso, Integer duracionVuelo,
			Integer cantidadPersonas, Float valorPorPersona) {
		super();
		this.numeroTiquete = numeroTiquete;
		this.claseServicio = claseServicio;
		this.modalidad = modalidad;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.valorTiquete = valorTiquete;
		this.fechaIda = fechaIda;
		this.fechaRegreso = fechaRegreso;
		this.duracionVuelo = duracionVuelo;
		this.cantidadPersonas = cantidadPersonas;
		this.valorPorPersona = valorPorPersona;
	}
	
	public Tiquete() {
		
	}

	/**
	 * Metodos get y set
	 * 
	 * @return
	 */
	public TipoClase getClaseServicio() {
		return claseServicio;
	}

	public void setClaseServicio(TipoClase claseServicio) {
		this.claseServicio = claseServicio;
	}

	public Modalidad getModalidad() {
		return modalidad;
	}

	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

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

	public Float getValorTiquete() {
		return valorTiquete;
	}

	public void setValorTiquete(Float valorTiquete) {
		this.valorTiquete = valorTiquete;
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

	public Integer getDuracionVuelo() {
		return duracionVuelo;
	}

	public void setDuracionVuelo(Integer duracionVuelo) {
		this.duracionVuelo = duracionVuelo;
	}

	public Integer getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(Integer cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public Float getValorPorPersona() {
		return valorPorPersona;
	}

	public void setValorPorPersona(Float valorPorPersona) {
		this.valorPorPersona = valorPorPersona;
	}

	public HashMap<Cliente, Equipaje> getListaEquipajes() {
		return listaEquipajes;
	}

	public void setListaEquipajes(HashMap<Cliente, Equipaje> listaEquipajes) {
		this.listaEquipajes = listaEquipajes;
	}

	public String getNumeroTiquete() {
		return numeroTiquete;
	}

	public void setNumeroTiquete(String numeroTiquete) {
		this.numeroTiquete = numeroTiquete;
	}

	@Override
	public String toString() {
		return "Tiquete [numeroTiquete=" + numeroTiquete + ", claseServicio=" + claseServicio + ", modalidad="
				+ modalidad + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", valorTiquete="
				+ valorTiquete + ", fechaIda=" + fechaIda + ", fechaRegreso=" + fechaRegreso + ", duracionVuelo="
				+ duracionVuelo + ", cantidadPersonas=" + cantidadPersonas + ", valorPorPersona=" + valorPorPersona
				+ ", listaEquipajes=" + listaEquipajes + "]";
	}

}
