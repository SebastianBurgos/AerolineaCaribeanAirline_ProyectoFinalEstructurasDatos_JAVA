package co.edu.uniquindio.ed.aerolinea.controller;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ed.aerolinea.app.Aplicacion;
import co.edu.uniquindio.ed.aerolinea.model.Tiquete;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DetallesVueloController {
	private Aplicacion aplicacion = new Aplicacion();
	private Tiquete tiquete;

	
	//Para el proceso de compra del tiquete
	private Tiquete tiqueteCompra;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label txtDetallesModalidad;

    @FXML
    private Label txtDetallesFechaIda;

    @FXML
    private Label txtDetallesClase;

    @FXML
    private Button btnCerrarVentana;

    @FXML
    private Button btnElegirAsientos;

    @FXML
    private Label txtDetallesDestino;

    @FXML
    private Label txtDetallesCostoTotal;

    @FXML
    private Label txtDetallesFechaRegreso;

    @FXML
    private Label txtDetallesNumeroPersonas;

    @FXML
    private Button btnIngresarDatosPago;

    @FXML
    private Label txtDetallesOrigen;

    @FXML
    void ingresarDatosPago(ActionEvent event) {
    	aplicacion.mostrarVentanaIngresoDatosPago(tiquete);
    }

    @FXML
    void elegirAsientos(ActionEvent event) {
    	aplicacion.mostrarVentanaSeleccionAsientosA320(tiquete);
    }

    @FXML
    void cerrarVentanaDetallesVuelo(ActionEvent event) {
    	aplicacion.mostrarVentanaCompraTiquetes();
    }

    public void setAplicacion(Aplicacion aplicacion, Tiquete tiquete) {
		this.aplicacion = aplicacion;
	  	this.tiquete = tiquete;
    	this.aplicacion = aplicacion;
		txtDetallesModalidad.setText("" + tiquete.getModalidad());
		txtDetallesClase.setText("" + tiquete.getClaseServicio());
		txtDetallesDestino.setText(tiquete.getCiudadDestino());
		txtDetallesOrigen.setText(tiquete.getCiudadOrigen());
		txtDetallesNumeroPersonas.setText(String.valueOf(tiquete.getCantidadPersonas()));
		txtDetallesFechaIda.setText(tiquete.getFechaIda());
		txtDetallesFechaRegreso.setText(tiquete.getFechaRegreso());
		txtDetallesCostoTotal.setText(String.valueOf(tiquete.getValorTiquete()*tiquete.getCantidadPersonas()));

		
		//tiqueteCompra = new Tiquete(null, null, fechaVuelta, fechaVuelta, costoTotal, null, null, null, numPersonas, costoTotal);
	}

    @FXML
    void initialize() {

    }
}
