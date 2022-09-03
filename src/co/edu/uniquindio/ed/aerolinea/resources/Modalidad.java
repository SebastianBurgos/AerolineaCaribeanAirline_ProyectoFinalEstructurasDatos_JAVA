package co.edu.uniquindio.ed.aerolinea.resources;

public enum Modalidad {


	SOLOIDA(0),IDAYVENIDA(1);

	/**
	 * Atriburto de la enumeracion
	 */
	private int numTipo;

	/**
	 * Constructor
	 * @param numTipo
	 */
	private Modalidad(int numTipo) {
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
