package co.edu.uniquindio.ed.aerolinea.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ed.aerolinea.app.Aplicacion;
import co.edu.uniquindio.ed.aerolinea.model.Tiquete;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class SeleccionAsientosA330Controller {
	private Aplicacion aplicacion = new Aplicacion();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCerrarVentana;

    @FXML
    private Button btnIngresarDatosPago;

    @FXML
    private GridPane gpEjecutivoAC;

    @FXML
    private GridPane gpEjecutivoDF;

    @FXML
    private GridPane gpEconomicoDEF;

    @FXML
    private GridPane gpEconomicoABC;

	Integer A;
	Tiquete tiquete;

    @FXML
    void cerrarVentanaSeleccionAsientosA330(ActionEvent event) {
    	aplicacion.mostrarVentanaDetallesVuelo(tiquete);
    }

    @FXML
    void ingresarDatosPago(ActionEvent event) {
    	aplicacion.mostrarVentanaIngresoDatosPago(tiquete);
    }

    @FXML
    void colorearCasilla(ActionEvent event) {
    	if(A!=0){
    		Button btnColorear  = (Button) event.getSource();
    		btnColorear.setStyle("-fx-background-color: #F5B7B1; -fx-border-color: #C0392B; -fx-background-radius: 40%; -fx-border-radius: 40%; -fx-border-width: 2px;");
    		A--;
    	}
    }

    public void setAplicacion(Aplicacion aplicacion,Tiquete tiquete1) {
		this.aplicacion = aplicacion;
		this.tiquete  = tiquete1;
		A = tiquete.getCantidadPersonas();

	}

    @FXML
    void initialize() {

    }
}

