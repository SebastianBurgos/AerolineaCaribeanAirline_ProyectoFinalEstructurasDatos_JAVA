package co.edu.uniquindio.ed.aerolinea.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ed.aerolinea.app.Aplicacion;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuPrincipalController {
	private Aplicacion aplicacion = new Aplicacion();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnSalir;

    @FXML
    private Button btnEmbarque;

    @FXML
    private Button btnGestionarEquipajes;

    @FXML
    private Button btnAsignarTripulacion;

    @FXML
    private Button btnComprarTiquetes;

    @FXML
    void mostrarVentanaAsignacionTripulacion(ActionEvent event) {
    	aplicacion.mostrarVentanaAsignacionTripulacion();
    }

    @FXML
    void mostrarVentanaCompraTiquetes(ActionEvent event) {
    	aplicacion.mostrarVentanaCompraTiquetes();
    }

    @FXML
    void salir(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void mostrarVentanaGestionEquipajes(ActionEvent event) {
    	aplicacion.mostrarVentanaGestionEquipaje();
    }
    
    @FXML
    void mostrarVentanaEmbarque(ActionEvent event) {
    	aplicacion.mostrarVentanaEmbarque();
    }
    
    public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

    @FXML
    void initialize() {
      
    }
}
