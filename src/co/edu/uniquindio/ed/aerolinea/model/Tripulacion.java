package co.edu.uniquindio.ed.aerolinea.model;

import java.io.Serializable;
import java.util.HashSet;

public class Tripulacion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributos de la clase Tripulacion
	 */
	private Piloto piloto;
	private Copiloto copiloto;
	private HashSet<AuxiliarVuelo> listaAuxiliares;

	/**
	 * Metodo constructor para la clase tripulacion
	 * 
	 * @param piloto
	 * @param copiloto
	 */
	public Tripulacion(Piloto piloto, Copiloto copiloto) {
		super();
		this.piloto = piloto;
		this.copiloto = copiloto;
	}
	
	public Tripulacion() {
		
	}

	/**
	 * Metodos get y set
	 * 
	 * @return
	 */
	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public Copiloto getCopiloto() {
		return copiloto;
	}

	public void setCopiloto(Copiloto copiloto) {
		this.copiloto = copiloto;
	}

	public HashSet<AuxiliarVuelo> getListaAuxiliares() {
		return listaAuxiliares;
	}

	public void setListaAuxiliares(HashSet<AuxiliarVuelo> listaAuxiliares) {
		this.listaAuxiliares = listaAuxiliares;
	}

	@Override
	public String toString() {
		return "Tripulacion [piloto=" + piloto + ", copiloto=" + copiloto + ", listaAuxiliares=" + listaAuxiliares
				+ "]";
	}
	
	

}
