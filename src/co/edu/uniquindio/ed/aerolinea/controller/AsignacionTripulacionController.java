package co.edu.uniquindio.ed.aerolinea.controller;


import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ed.aerolinea.app.Aplicacion;
import co.edu.uniquindio.ed.aerolinea.infovisible.VueloDisponible;
import co.edu.uniquindio.ed.aerolinea.model.AuxiliarVuelo;
import co.edu.uniquindio.ed.aerolinea.model.Copiloto;
import co.edu.uniquindio.ed.aerolinea.model.Piloto;
import co.edu.uniquindio.ed.aerolinea.resources.Persistencia;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class AsignacionTripulacionController {
	private Aplicacion aplicacion = new Aplicacion();
	ObservableList<VueloDisponible> listaVuelosDisponiblesData = FXCollections.observableArrayList();
	ObservableList<Piloto> listaPilotosData = FXCollections.observableArrayList();
	ObservableList<Copiloto> listaCopilotosData = FXCollections.observableArrayList();
	ObservableList<AuxiliarVuelo> listaAuxiliaresData = FXCollections.observableArrayList();
	ObservableList<AuxiliarVuelo> listaAuxiliaresSeleccionadosData = FXCollections.observableArrayList();
	
	AuxiliarVuelo auxiliarSeleccionado;
	VueloDisponible vueloSeleccionado;
	Piloto pilotoSeleccionado;
	Copiloto copilotoSeleccionado;

  @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<String, AuxiliarVuelo> columnIdAuxiliaresSeleccionados;

    @FXML
    private Button btnSeleccionarAuxiliar;

    @FXML
    private TableView<VueloDisponible> tableVuelos;

    @FXML
    private TableColumn<String, VueloDisponible> columnAvion;

    @FXML
    private TableColumn<String, Copiloto> columnNombreCopiloto;

    @FXML
    private TableColumn<String, Piloto> columnNombrePiloto;

    @FXML
    private TableView<Piloto> tablePilotos;

    @FXML
    private Button btnSalir;

    @FXML
    private TableView<Copiloto> tableCopilotos;

    @FXML
    private Button btnFinalizarAsignacion;

    @FXML
    private TableColumn<String, VueloDisponible> columnOrigen;

    @FXML
    private TableColumn<String, Piloto> columnIdPiloto;

    @FXML
    private TableColumn<String, AuxiliarVuelo> columnNombreAuxiliares;

    @FXML
    private TableColumn<String, AuxiliarVuelo> columnNombreAuxiliaresSeleccionados;

    @FXML
    private TableColumn<String, AuxiliarVuelo> columnIdAuxiliares;

    @FXML
    private TableColumn<String, Copiloto> columnIdCopiloto;

    @FXML
    private Button btnMenu;

    @FXML
    private TableColumn<String, VueloDisponible> columnDestino;

    @FXML
    private TableView<AuxiliarVuelo> tableAuxiliaresSeleccionados;

    @FXML
    private TableColumn<String, VueloDisponible> columnHoraSalida;

    @FXML
    private TableView<AuxiliarVuelo> tableAuxiliares;

    @FXML
    void salirApp(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void mostrarMenu(ActionEvent event) {
    	aplicacion.mostrarVentanaPrincipal();
    }

    @FXML
    void finalizarAsignacion(ActionEvent event) {
    	if(vueloSeleccionado != null && pilotoSeleccionado != null && copilotoSeleccionado != null){
    		aplicacion.asignarTripulacion(vueloSeleccionado.getAvion(), pilotoSeleccionado, copilotoSeleccionado, listaAuxiliaresSeleccionadosData);
    		mostrarMensaje("Información Asignacion", "Confirmacion", "La tripulacion se ha asignado correctamente al vuelo", AlertType.INFORMATION);
    		Persistencia.guardarRecursoXML(aplicacion.getAerolinea());
    	}else{
    		mostrarMensaje("Información Asignacion", "Datos invalidos", "Porfavor seleccione correctamente la tripulacion", AlertType.WARNING);
    	}
    }

    @FXML
    void seleccionarAuxiliar(ActionEvent event) {
    	listaAuxiliaresSeleccionadosData.add(auxiliarSeleccionado);
    	tableAuxiliaresSeleccionados.getItems().add(auxiliarSeleccionado);
    }

    public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
		tableVuelos.getItems().clear();
		tableVuelos.setItems(getListaVuelosDisponiblesData());
		
		tablePilotos.getItems().clear();
		tablePilotos.setItems(getListaPilotosData());
		
		tableCopilotos.getItems().clear();
		tableCopilotos.setItems(getListaCopilotosData());
		
		tableAuxiliares.getItems().clear();
		tableAuxiliares.setItems(getListaAuxiliaresVueloData());
		
		tableAuxiliaresSeleccionados.getItems().clear();
	}

    private ObservableList<AuxiliarVuelo> getListaAuxiliaresVueloData() {
    	listaAuxiliaresData.addAll(aplicacion.obtenerAuxiliares());
		return listaAuxiliaresData;
	}

	private ObservableList<Copiloto> getListaCopilotosData() {
		listaCopilotosData.addAll(aplicacion.obtenerCopilotos());
		return listaCopilotosData;
	}

	private ObservableList<Piloto> getListaPilotosData() {
		listaPilotosData.addAll(aplicacion.obtenerPilotos());
		return listaPilotosData;
	}

	private ObservableList<VueloDisponible> getListaVuelosDisponiblesData() {
		listaVuelosDisponiblesData.addAll(aplicacion.obtenerVuelos());
		return listaVuelosDisponiblesData;
	}

	@FXML
    void initialize() {
		this.columnOrigen.setCellValueFactory(new PropertyValueFactory<>("origen"));
		this.columnDestino.setCellValueFactory(new PropertyValueFactory<>("destino"));
		this.columnHoraSalida.setCellValueFactory(new PropertyValueFactory<>("horaSalida"));
		this.columnAvion.setCellValueFactory(new PropertyValueFactory<>("avion"));
		
		tableVuelos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
    		vueloSeleccionado = newSelection;

    	});
		
		this.columnIdPiloto.setCellValueFactory(new PropertyValueFactory<>("identificacion"));
		this.columnNombrePiloto.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		
		tablePilotos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
    		pilotoSeleccionado = newSelection;

    	});
		
		this.columnIdCopiloto.setCellValueFactory(new PropertyValueFactory<>("identificacion"));
		this.columnNombreCopiloto.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		
		tableCopilotos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
    		copilotoSeleccionado = newSelection;

    	});
		
		this.columnIdAuxiliares.setCellValueFactory(new PropertyValueFactory<>("identificacion"));
		this.columnNombreAuxiliares.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		
		tableAuxiliares.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
    		auxiliarSeleccionado = newSelection;

    	});
		
		this.columnNombreAuxiliaresSeleccionados.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		this.columnIdAuxiliaresSeleccionados.setCellValueFactory(new PropertyValueFactory<>("identificacion"));
    }
	
	 public void mostrarMensaje(String titulo, String header, String contenido, AlertType alertType) {

	    	Alert alert = new Alert(alertType);
	    	alert.setTitle(titulo);
	    	alert.setHeaderText(header);
	    	alert.setContentText(contenido);
	    	alert.showAndWait();
	}
}
