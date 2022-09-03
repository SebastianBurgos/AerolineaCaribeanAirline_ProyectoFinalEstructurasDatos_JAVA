package co.edu.uniquindio.ed.aerolinea.controller;

import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;

import co.edu.uniquindio.ed.aerolinea.app.Aplicacion;
import co.edu.uniquindio.ed.aerolinea.model.Cliente;
import co.edu.uniquindio.ed.aerolinea.model.Tiquete;
import co.edu.uniquindio.ed.aerolinea.resources.Persistencia;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class IngresoDatosPagoController {
	private Aplicacion aplicacion = new Aplicacion();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtDireccion;

    @FXML
    private Button btnConfirmarPago;

    @FXML
    private Button btnCerrarVentana;

    @FXML
    private TextField txtNumeroTarjeta;

    @FXML
    private TextField txtNacimiento;

    @FXML
    private TextField txtIdentificacion;

    @FXML
    private TextField txtCorreo;

    @FXML
    private Button btnBuscarCliente;

	private Tiquete tiquete;

	private Cliente cliente;

    @FXML
    void confirmarPago(ActionEvent event) {
		Float saldoNuevo = cliente.getSaldoDisponible() - tiquete.getValorTiquete();
		if(saldoNuevo >= 0){
			cliente.getListaTiquetes().put(tiquete.getNumeroTiquete(), tiquete);
			aplicacion.getAerolinea().getListaTiquetes().put(tiquete.getNumeroTiquete(), tiquete);
			mostrarMensaje("TIQUETE", "Transacción exitosa", "El tiquet con numero: "+tiquete.getNumeroTiquete()+ " se a cargado correctamente. \ngracias por viajar con nosotros", AlertType.INFORMATION);
			Persistencia.guardarRecursoXML(aplicacion.getAerolinea());
		}else{
			mostrarMensaje("TIQUETE", "Transacción Fallida", "El cliente no cuentaa con saldo disponible \n por favor intentarlo nuevamente", AlertType.ERROR);

		}

    }

    @FXML
    void cerrarVentanaDatosPago(ActionEvent event) {
    	aplicacion.mostrarVentanaDetallesVuelo(tiquete);
    }

    public void setAplicacion(Aplicacion aplicacion,Tiquete tiquete){
    	this.tiquete = tiquete;
    	this.aplicacion = aplicacion;


	}

    @FXML
    public void buscarCliente(ActionEvent event){

    	HashSet<Cliente> listaClientes = aplicacion.getAerolinea().getListaClientes();
    	String id = txtIdentificacion.getText();
    	if(verificarId(id)){
        	for (Cliente cliente : listaClientes) {
        		if(cliente.getIdentificacion().equals(id)){
        			txtIdentificacion.setText(cliente.getIdentificacion());
        			txtNombre.setText(cliente.getNombre());
        			txtDireccion.setText(cliente.getIdentificacion());
        			txtCorreo.setText(cliente.getCorreo());
        			txtNacimiento.setText(cliente.getFechaNacimiento());
        			txtNumeroTarjeta.setText("xxxxxx04");

        			this.cliente = cliente;
        		}
        	}
    	}

    }

	 private boolean verificarId(String id) {

		if(id == null){
			mostrarMensaje("IDENTIFICACION", "Identificación invalida", "No sé ha ingresado los datos necesarios", AlertType.ERROR );
			return false;
		}
		if(id.length() <=6){
			mostrarMensaje("IDENTIFICACION", "Identificación invalida", "Los datos ingresados no son una indentificación validad", AlertType.ERROR );
			return false;
		}
		return true;
	}

	public void mostrarMensaje(String titulo, String header, String contenido, AlertType alertType) {

	    	Alert alert = new Alert(alertType);
	    	alert.setTitle(titulo);
	    	alert.setHeaderText(header);
	    	alert.setContentText(contenido);
	    	alert.showAndWait();
	}

    @FXML
    void initialize() {

    }
}
