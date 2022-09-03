package co.edu.uniquindio.ed.aerolinea.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import co.edu.uniquindio.ed.aerolinea.controller.AsignacionTripulacionController;
import co.edu.uniquindio.ed.aerolinea.controller.CompraTiqueteController;
import co.edu.uniquindio.ed.aerolinea.controller.DetallesVueloController;
import co.edu.uniquindio.ed.aerolinea.controller.EmbarqueController;
import co.edu.uniquindio.ed.aerolinea.controller.GestionEquipajeController;
import co.edu.uniquindio.ed.aerolinea.controller.IngresoDatosPagoController;
import co.edu.uniquindio.ed.aerolinea.controller.MenuPrincipalController;
import co.edu.uniquindio.ed.aerolinea.controller.SeleccionAsientosA320Controller;
import co.edu.uniquindio.ed.aerolinea.controller.SeleccionAsientosA330Controller;
import co.edu.uniquindio.ed.aerolinea.infovisible.VueloDisponible;
import co.edu.uniquindio.ed.aerolinea.model.Aerolinea;
import co.edu.uniquindio.ed.aerolinea.model.AuxiliarVuelo;
import co.edu.uniquindio.ed.aerolinea.model.Copiloto;
import co.edu.uniquindio.ed.aerolinea.model.Piloto;
import co.edu.uniquindio.ed.aerolinea.model.Ruta;
import co.edu.uniquindio.ed.aerolinea.model.Tiquete;
import co.edu.uniquindio.ed.aerolinea.model.Vuelo;
import co.edu.uniquindio.ed.aerolinea.resources.Persistencia;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Aplicacion extends Application{
	private Stage primaryStage;
	//static Aerolinea aerolinea = new Aerolinea("Caribe Airlines");
	Aerolinea aerolinea = Persistencia.cargarRecursoXML();

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Caribe Airlines");
		this.primaryStage.setResizable(false);
		mostrarVentanaPrincipal();
		//Persistencia.guardarRecursoXML(aerolinea);
	}

	public static void main(String[] args) {
		
		launch(args);
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}

	public void mostrarVentanaPrincipal() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("../view/MenuPrincipalView.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			MenuPrincipalController menuPrincipalController = loader.getController();
			menuPrincipalController.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void mostrarVentanaCompraTiquetes() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("../view/CompraTiquetesView.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			CompraTiqueteController compraTiqueteController = loader.getController();
			compraTiqueteController.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void mostrarVentanaAsignacionTripulacion() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("../view/AsignacionTripulacionView.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			AsignacionTripulacionController asignacionTripulacionController = loader.getController();
			asignacionTripulacionController.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void mostrarVentanaGestionEquipaje() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("../view/GestionEquipajesView.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			GestionEquipajeController gestionEquipajeController = loader.getController();
			gestionEquipajeController.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Este metodo muestra la ventana de los detalles del vuelo a comprar
	 * @param modalidad
	 * @param servicio
	 * @param ciudadOrigen
	 * @param ciudadDestino
	 * @param fechaIda
	 * @param fechaVuelta
	 * @param costo
	 * @param numPersonas
	 */
	public void mostrarVentanaDetallesVuelo(Tiquete tiquete) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("../view/DetallesVueloView.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			DetallesVueloController detallesVueloController = loader.getController();
			detallesVueloController.setAplicacion(this, tiquete);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void mostrarVentanaEmbarque() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("../view/EmbarqueView.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			EmbarqueController embarqueController = loader.getController();
			embarqueController.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void mostrarVentanaIngresoDatosPago(Tiquete tiquete) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("../view/IngresoDatosPago.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			IngresoDatosPagoController ingresoDatosPagoController = loader.getController();
			ingresoDatosPagoController.setAplicacion(this, tiquete);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void mostrarVentanaSeleccionAsientosA320(Tiquete tiquete) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("../view/SeleccionAsientosA330View.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			SeleccionAsientosA330Controller seleccionAsientosA330Controller = loader.getController();
			seleccionAsientosA330Controller.setAplicacion(this, tiquete);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<VueloDisponible> obtenerVuelos() {
		ArrayList<VueloDisponible> listaVuelos = aerolinea.getListaVuelosDisponibles();
		return listaVuelos;
	}

	public ArrayList<Piloto> obtenerPilotos() {
		ArrayList<Piloto> listaPilotos = new ArrayList<Piloto>(aerolinea.getListaPilotos());
		return listaPilotos;
	}
	
	public ArrayList<Copiloto> obtenerCopilotos() {
		ArrayList<Copiloto> listaCopilotos = new ArrayList<Copiloto>(aerolinea.getListaCopilotos());
		return listaCopilotos;
	}
	
	public ArrayList<AuxiliarVuelo> obtenerAuxiliares() {
		ArrayList<AuxiliarVuelo> listaAuxiliares = new ArrayList<AuxiliarVuelo>(aerolinea.getListaAuxiliares());
		return listaAuxiliares;
	}

	public void asignarTripulacion(String avion, Piloto pilotoSeleccionado, Copiloto copilotoSeleccionado,
		ObservableList<AuxiliarVuelo> listaAuxiliaresSeleccionadosData) {
		HashSet<AuxiliarVuelo> listaAuxiliares = new HashSet<AuxiliarVuelo>(listaAuxiliaresSeleccionadosData);
		this.aerolinea.asignarTripulacion(avion, pilotoSeleccionado, copilotoSeleccionado, listaAuxiliares);
		
	}

	public Tiquete buscarTiquete(String numeroTiquete) {
		return aerolinea.buscarTiquete(numeroTiquete);
	}


}
