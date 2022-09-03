package co.edu.uniquindio.ed.aerolinea.resources;

public enum TipoAeronave {


	AIRBUSA320(0),AIRBUSA330(1),BOEING787(2);

	/**
	 * Atriburto de la enumeracion
	 */
	private int numTipo;

	/**
	 * Constructor
	 * @param numTipo
	 */
	private TipoAeronave(int numTipo) {
		this.numTipo = numTipo;
	}

   /**
	* Metodo get del numero tipo
	* @return numero tipo
    */
	public int getNumTipo() {
		return numTipo;
	}

	/**
	 * Metodo Set
	 * @param numTipo
	 */
	public void setNumTipo(int numTipo) {
		this.numTipo = numTipo;
	}

}
