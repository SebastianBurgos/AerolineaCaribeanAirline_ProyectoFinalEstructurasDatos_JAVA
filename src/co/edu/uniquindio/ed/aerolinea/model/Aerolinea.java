package co.edu.uniquindio.ed.aerolinea.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

import co.edu.uniquindio.ed.aerolinea.infovisible.VueloDisponible;
import co.edu.uniquindio.ed.aerolinea.resources.Modalidad;
import co.edu.uniquindio.ed.aerolinea.resources.TipoAeronave;
import co.edu.uniquindio.ed.aerolinea.resources.TipoClase;
import co.edu.uniquindio.ed.aerolinea.resources.TipoRuta;

public class Aerolinea implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributos de la clase Aerolinea
	 */
	private String nombre;

	private HashMap<Integer, Aeronave> listaAeronaves = new HashMap<Integer, Aeronave>();
	private HashSet<Cliente> listaClientes = new HashSet<Cliente>();
	private HashSet<Vuelo> listaVuelos = new HashSet<Vuelo>();
	private LinkedHashSet<Ruta> listaRutas = new LinkedHashSet<Ruta>();
	private HashMap<String, Tiquete> listaTiquetes = new HashMap<String, Tiquete>();
	
	private HashSet<Piloto> listaPilotos = new HashSet<Piloto>();
	private HashSet<Copiloto> listaCopilotos = new HashSet<Copiloto>();
	private HashSet<AuxiliarVuelo> listaAuxiliares = new HashSet<AuxiliarVuelo>();
	
	
	//Para la interfaz
	private ArrayList<VueloDisponible> listaVuelosDisponibles = new ArrayList<VueloDisponible>();

	/**
	 * Metodo constructor de la clase Aerolinea
	 * @param nombre
	 */
	public Aerolinea(String nombre) {
		super();
		this.nombre = nombre;
		inicializarDatos();
	}
	
	public Aerolinea() {
		
	}

	/**
	 * Metodo para inicializar los datos y listas de prueba
	 */
	private void inicializarDatos() {
		//RUTAS
		Ruta ruta1 = new Ruta("CDMX", "Monterrey", 165, "6:00AM", "3", TipoRuta.NACIONAL);
		Ruta ruta2 = new Ruta("CDMX", "Cancun", 192, "8:00AM", "3", TipoRuta.NACIONAL);
		Ruta ruta3 = new Ruta("CDMX", "Buenos Aires", 545, "11:30PM", "3", TipoRuta.INTERNACIONAL);
		Ruta ruta4 = new Ruta("CDMX", "Los Angeles", 205, "9:45AM", "3", TipoRuta.INTERNACIONAL);
		Ruta ruta5 = new Ruta("CDMX", "Bogota", 225, "6:00AM", "1:30AM", TipoRuta.INTERNACIONAL);
		Ruta ruta6 = new Ruta("CDMX", "Panama", 175, "6:00AM", "2:45PM", TipoRuta.INTERNACIONAL);
		
		listaRutas.add(ruta1);
		listaRutas.add(ruta2);
		listaRutas.add(ruta3);
		listaRutas.add(ruta4);
		listaRutas.add(ruta5);
		listaRutas.add(ruta6);
		
		//PARA LA TABLA DE INTERFAZ
		VueloDisponible vueloDisp1 = new VueloDisponible("CDMX", "Monterrey", 165, (float)120000, (float)120000);
		vueloDisp1.setHoraSalida(ruta1.getHoraSalida());
		vueloDisp1.setAvion("A320");
		VueloDisponible vueloDisp2 = new VueloDisponible("CDMX", "Cancun", 192, (float)150000, (float)150000);
		vueloDisp2.setHoraSalida(ruta2.getHoraSalida());
		vueloDisp2.setAvion("A330");
		VueloDisponible vueloDisp3 = new VueloDisponible("CDMX", "Buenos Aires", 545, (float)80000, (float)80000);
		vueloDisp3.setHoraSalida(ruta3.getHoraSalida());
		vueloDisp3.setAvion("Boeing787");
		VueloDisponible vueloDisp4 = new VueloDisponible("CDMX", "Los Angeles", 205, (float)920000, (float)920000);
		vueloDisp4.setHoraSalida(ruta4.getHoraSalida());
		vueloDisp4.setAvion("A330");
		VueloDisponible vueloDisp5 = new VueloDisponible("CDMX", "Bogota", 225, (float)110000, (float)110000);
		vueloDisp5.setHoraSalida(ruta5.getHoraSalida());
		vueloDisp5.setAvion("Boeing787");
		VueloDisponible vueloDisp6 = new VueloDisponible("CDMX", "Panama", 175, (float)150000, (float)150000);
		vueloDisp6.setHoraSalida(ruta6.getHoraSalida());
		vueloDisp6.setAvion("A320");
		
		listaVuelosDisponibles.add(vueloDisp1);
		listaVuelosDisponibles.add(vueloDisp2);
		listaVuelosDisponibles.add(vueloDisp3);
		listaVuelosDisponibles.add(vueloDisp4);
		listaVuelosDisponibles.add(vueloDisp5);
		listaVuelosDisponibles.add(vueloDisp6);
		
		//VUELOS
		Vuelo vuelo1 = new Vuelo("0", (float) 120000, "12/06/2022", "22/06/2022", ruta1);
		Vuelo vuelo2 = new Vuelo("1", (float) 150000, "15/06/2022", "23/06/2022", ruta2);
		Vuelo vuelo3 = new Vuelo("2", (float) 80000, "11/06/2022", "24/06/2022", ruta3);
		Vuelo vuelo4 = new Vuelo("3", (float) 920000, "24/06/2022", "27/06/2022", ruta4);
		Vuelo vuelo5 = new Vuelo("4", (float) 110000, "22/06/2022", "28/06/2022", ruta5);
		Vuelo vuelo6 = new Vuelo("5", (float) 150000, "13/06/2022", "23/06/2022", ruta6);
		
		listaVuelos.add(vuelo1);
		listaVuelos.add(vuelo2);
		listaVuelos.add(vuelo3);
		listaVuelos.add(vuelo4);
		listaVuelos.add(vuelo5);
		listaVuelos.add(vuelo6);
		
		//AERONAVES
		Aeronave a320_1 = new Aeronave(TipoAeronave.AIRBUSA320, 84, (float) 16000, "AC DF", "ABC DEF");
		Aeronave a320_2 = new Aeronave(TipoAeronave.AIRBUSA320, 84, (float) 16000, "AC DF", "ABC DEF");
		Aeronave a330_1 = new Aeronave(TipoAeronave.AIRBUSA330, 84, (float) 52000, "AC DF HK", "AC DEF HK");
		Aeronave a330_2 = new Aeronave(TipoAeronave.AIRBUSA330, 84, (float) 52000, "AC DF HK", "AC DEF HK");
		Aeronave boeing_1 = new Aeronave(TipoAeronave.BOEING787, 84, (float) 50000, "AB DE LK", "ABC DEF JKL");
		Aeronave boeing_2 = new Aeronave(TipoAeronave.BOEING787, 84, (float) 50000, "AB DE LK", "ABC DEF JKL");
		
		listaAeronaves.put(0, a320_1);
		listaAeronaves.put(1, a320_2);
		listaAeronaves.put(2, a330_1);
		listaAeronaves.put(3, a330_2);
		listaAeronaves.put(4, boeing_1);
		listaAeronaves.put(5, boeing_2);
		
		//PILOTOS
		Piloto piloto1 = new Piloto("1234567", "Augustus", "Cra Norte 23", "augustus@gmail.com", "23/02/1988", "Piloto");
		Piloto piloto2 = new Piloto("7654321", "Nino Bravo", "Cra Sur 24", "nino@gmail.com", "03/07/1978", "Piloto");
		Piloto piloto3 = new Piloto("1625347", "Alcapone", "Cra 24 Numero 2", "alcapone@gmail.com", "21/02/1999", "Piloto");
		
		listaPilotos.add(piloto1);
		listaPilotos.add(piloto2);
		listaPilotos.add(piloto3);
		
		//COPILOTOS
		Copiloto copiloto1 = new Copiloto("123098", "Mario Bross", "Barrio Niagara Cra 22", "mario@hotmail.com", "07/08/1999", "Copiloto");
		Copiloto copiloto2 = new Copiloto("567890", "Albertino", "Sienaga 34 Calle 2", "albertino@hotmail.com", "05/12/1989", "Copiloto");
		Copiloto copiloto3 = new Copiloto("346572", "Brayan", "Comuna 13", "brayan@hotmail.com", "01/01/2000", "Copiloto");
		
		listaCopilotos.add(copiloto1);
		listaCopilotos.add(copiloto2);
		listaCopilotos.add(copiloto3);
		
		//AuxiliaresVuelo
		AuxiliarVuelo auxiliar1 = new AuxiliarVuelo("0293489", "Sara", "Barrio Alcatraz Cra 13", "sara@yahoo.com", "02/03/1987", "Auxiliar de Vuelo");
		AuxiliarVuelo auxiliar2 = new AuxiliarVuelo("2348729", "Luciana", "Barrio La Picota Cra 13", "luciana@yahoo.com", "14/12/1997", "Auxiliar de Vuelo");
		AuxiliarVuelo auxiliar3 = new AuxiliarVuelo("1238903", "Maria", "Barrio Lamo Cra 13", "maria@yahoo.com", "20/15/1989", "Auxiliar de Vuelo");
		AuxiliarVuelo auxiliar4 = new AuxiliarVuelo("9043578", "Dayana", "Barrio Arboleda Cra 13", "dayana@yahoo.com", "29/11/1989", "Auxiliar de Vuelo");
		AuxiliarVuelo auxiliar5 = new AuxiliarVuelo("1934823", "Jennifer", "Barrio Sinocual Cra 13", "jennifer@yahoo.com", "12/03/1887", "Auxiliar de Vuelo");
		AuxiliarVuelo auxiliar6 = new AuxiliarVuelo("2940243", "Laura", "Barrio Upalupa Cra 13", "laura@yahoo.com", "01/01/1237", "Auxiliar de Vuelo");
		
		listaAuxiliares.add(auxiliar1);
		listaAuxiliares.add(auxiliar2);
		listaAuxiliares.add(auxiliar3);
		listaAuxiliares.add(auxiliar4);
		listaAuxiliares.add(auxiliar5);
		listaAuxiliares.add(auxiliar6);
		
		//Clientes
		Cliente cliente1 = new Cliente("01478963","Juanito","Barrio la Pista Cll 8","JuanitoSimp@hotmail.com","23/12/2002","Jugador de LoL", (float) 1000000);
		Cliente cliente2 = new Cliente("25896300","Bruce Wayner","Ciudad Gotica East End","BatMan@hotmail.com","17/04/1915","Empresario/Super heroe", (float) 1000000000);
		Cliente cliente3 = new Cliente("07831500","Wade Wilson","Cll Canada #27","DeadPool@hotmail.com","23/10/1975","Ser DeadPool", (float) 2190000);
		Cliente cliente4 = new Cliente("01915748","Clark Kent","Granja Kent km 8 Smallville","superMan@hotmail.com","08/05/1985","Fotografo", (float) 3545000);
		Cliente cliente5 = new Cliente("45271043","J. Joestar","Edificio DIO Piso 4 apt 35","Jjoestar@hotmail.com","27/10/1920","Petrolero", (float) 25675000);

		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		listaClientes.add(cliente3);
		listaClientes.add(cliente4);
		listaClientes.add(cliente5);
		
		Tiquete tiq = new Tiquete("1", TipoClase.ECONOMICO, Modalidad.IDAYVENIDA, "CDMX", "Monterrey", (float) 100000, "24/2/3", "24/2/3", 3, 2, (float) 100000);
		listaTiquetes.put("1", tiq);
	}

	/**
	 * Metodos get y set de la clase Aerolinea
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashMap<Integer, Aeronave> getListaAeronaves() {
		return listaAeronaves;
	}

	public void setListaAeronaves(HashMap<Integer, Aeronave> listaAeronaves) {
		this.listaAeronaves = listaAeronaves;
	}

	public HashSet<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(HashSet<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public HashSet<Vuelo> getListaVuelo() {
		return listaVuelos;
	}

	public void setListaVuelo(HashSet<Vuelo> listaVuelo) {
		this.listaVuelos = listaVuelo;
	}

	public LinkedHashSet<Ruta> getListaRutas() {
		return listaRutas;
	}

	public void setListaRutas(LinkedHashSet<Ruta> listaRutas) {
		this.listaRutas = listaRutas;
	}

	public HashMap<String, Tiquete> getListaTiquetes() {
		return listaTiquetes;
	}

	public void setListaTiquetes(HashMap<String, Tiquete> listaTiquetes) {
		this.listaTiquetes = listaTiquetes;
	}

	public ArrayList<VueloDisponible> getListaVuelosDisponibles() {
		return listaVuelosDisponibles;
	}

	public void setListaVuelosDisponibles(ArrayList<VueloDisponible> listaVuelosDisponibles) {
		this.listaVuelosDisponibles = listaVuelosDisponibles;
	}

	public HashSet<Vuelo> getListaVuelos() {
		return listaVuelos;
	}

	public void setListaVuelos(HashSet<Vuelo> listaVuelos) {
		this.listaVuelos = listaVuelos;
	}

	public HashSet<Piloto> getListaPilotos() {
		return listaPilotos;
	}

	public void setListaPilotos(HashSet<Piloto> listaPilotos) {
		this.listaPilotos = listaPilotos;
	}

	public HashSet<Copiloto> getListaCopilotos() {
		return listaCopilotos;
	}

	public void setListaCopilotos(HashSet<Copiloto> listaCopilotos) {
		this.listaCopilotos = listaCopilotos;
	}

	public HashSet<AuxiliarVuelo> getListaAuxiliares() {
		return listaAuxiliares;
	}

	public void setListaAuxiliares(HashSet<AuxiliarVuelo> listaAuxiliares) {
		this.listaAuxiliares = listaAuxiliares;
	}

	public void asignarTripulacion(String avion, Piloto pilotoSeleccionado, Copiloto copilotoSeleccionado,
			HashSet<AuxiliarVuelo> listaAuxiliares) {
		if(avion.equals("A320")){
			Tripulacion tripulacion = new Tripulacion(pilotoSeleccionado, copilotoSeleccionado);
			tripulacion.setListaAuxiliares(listaAuxiliares);
			listaAeronaves.get(0).setTripulacion(tripulacion);
		}
		if(avion.equals("A330")){
			Tripulacion tripulacion = new Tripulacion(pilotoSeleccionado, copilotoSeleccionado);
			tripulacion.setListaAuxiliares(listaAuxiliares);
			listaAeronaves.get(2).setTripulacion(tripulacion);
		}
		if(avion.equals("Boeing787")){
			Tripulacion tripulacion = new Tripulacion(pilotoSeleccionado, copilotoSeleccionado);
			tripulacion.setListaAuxiliares(listaAuxiliares);
			listaAeronaves.get(4).setTripulacion(tripulacion);
		}
	}

	public Tiquete buscarTiquete(String numeroTiquete) {
		return listaTiquetes.get(numeroTiquete);
	}

	@Override
	public String toString() {
		return "Aerolinea [nombre=" + nombre + ", listaAeronaves=" + listaAeronaves + ", listaClientes=" + listaClientes
				+ ", listaVuelos=" + listaVuelos + ", listaRutas=" + listaRutas + ", listaTiquetes=" + listaTiquetes
				+ ", listaPilotos=" + listaPilotos + ", listaCopilotos=" + listaCopilotos + ", listaAuxiliares="
				+ listaAuxiliares + ", listaVuelosDisponibles=" + listaVuelosDisponibles + "]";
	}

}
