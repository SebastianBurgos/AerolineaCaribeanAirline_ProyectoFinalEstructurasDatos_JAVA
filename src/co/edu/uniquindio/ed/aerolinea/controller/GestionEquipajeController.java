package co.edu.uniquindio.ed.aerolinea.controller;


import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;

import co.edu.uniquindio.ed.aerolinea.app.Aplicacion;
import co.edu.uniquindio.ed.aerolinea.model.Cliente;
import co.edu.uniquindio.ed.aerolinea.model.Tiquete;
import co.edu.uniquindio.ed.aerolinea.resources.Persistencia;
import co.edu.uniquindio.ed.aerolinea.resources.TipoClase;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class GestionEquipajeController {
	private Aplicacion aplicacion = new Aplicacion();
	Tiquete tiquete;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNumPiezas;

    @FXML
    private RadioButton radiobtnMascota;

    @FXML
    private Button btnAgregarEquipaje;

    @FXML
    private TextField txtPesoPieza2;

    @FXML
    private Label txtPesoMaximo;

    @FXML
    private Button btnSalir;

    @FXML
    private TextField txtPesoPieza1;

    @FXML
    private TextField txtNumTiquete;

    @FXML
    private Label txtNumPiezasMaximo;

    @FXML
    private TextField txtPesoMascota;

    @FXML
    private Button btnMenu;
    

    @FXML
    private Label txtTipoViaje;
    
    @FXML
    private TextField txtLargoP1;
    
    @FXML
    private TextField txtAltoP1;
    
    @FXML
    private TextField txtAnchoP1;
    
    @FXML
    private TextField txtLargoP2;
    
    @FXML
    private TextField txtAltoP2;
    
    @FXML
    private TextField txtAnchoP2;
    
    @FXML
    private TextField txtLargoM;
    
    @FXML
    private TextField txtAltoM;
    
    @FXML
    private TextField txtAnchoM;
    
    @FXML
    private TextField txtIdCliente;

    @FXML
    void salirApp(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void mostrarMenu(ActionEvent event) {
    	aplicacion.mostrarVentanaPrincipal();
    }

    /**
     * Metodo para buscar un tiquete
     * @param event
     */
    @FXML
    void buscarTiquete(ActionEvent event) {
    	tiquete = aplicacion.buscarTiquete(txtNumTiquete.getText());
    	if(tiquete.getCiudadDestino().equals("Cancun") || tiquete.getCiudadDestino().equals("Monterrey")){
    		txtTipoViaje.setText("NACIONAL");
    	}else{
    		txtTipoViaje.setText("INTERNACIONAL");
    	}
    	String tipoViaje = txtTipoViaje.getText();
    	if(tipoViaje.equals("NACIONAL")){
    		if(tiquete.getClaseServicio().equals(TipoClase.ECONOMICO)){
    			
    			txtNumPiezasMaximo.setText("1");
    			txtPesoMaximo.setText("24");
    		}
    		if(tiquete.getClaseServicio().equals(TipoClase.EJECUTIVO)){
    			
    			txtNumPiezasMaximo.setText("2");
    			txtPesoMaximo.setText("34");
    		}
    	}
    	if(tipoViaje.equals("INTERNACIONAL")){
    		if(tiquete.getClaseServicio().equals(TipoClase.ECONOMICO)){
    			
    			txtNumPiezasMaximo.setText("2");
    			txtPesoMaximo.setText("24");
    		}
    		if(tiquete.getClaseServicio().equals(TipoClase.EJECUTIVO)){
    			
    			txtNumPiezasMaximo.setText("2");
    			txtPesoMaximo.setText("34");
    		}
    	}

    }
    
    /**
     * Metodo apra agregar equipaje a la compra del tiquete
     * @param event
     */
	@FXML
    void agregarEquipaje(ActionEvent event) {
    	String tipoViaje = txtTipoViaje.getText();
    	int numPiezasMax = 0;
    	float pesoMax = 0;
    	if(tipoViaje.equals("NACIONAL")){
    		if(tiquete.getClaseServicio().equals(TipoClase.ECONOMICO)){
    			numPiezasMax = 1;
    			pesoMax = 24;
    		}
    		if(tiquete.getClaseServicio().equals(TipoClase.EJECUTIVO)){
    			numPiezasMax = 2;
    			pesoMax = 34;
    		}
    	}
    	if(tipoViaje.equals("INTERNACIONAL")){
    		if(tiquete.getClaseServicio().equals(TipoClase.ECONOMICO)){
    			numPiezasMax = 2;
    			pesoMax = 24;
    		}
    		if(tiquete.getClaseServicio().equals(TipoClase.EJECUTIVO)){
    			numPiezasMax = 2;
    			pesoMax = 34;
    		}
    	}
    	
    	String numeroPiezas = txtNumPiezas.getText();
    	String peso1 = txtPesoPieza1.getText();
    	String peso2 = txtPesoPieza2.getText();
    	String pesoMascota = "0";
    	
    	if(radiobtnMascota.isSelected()){
    		pesoMascota = txtPesoMascota.getText();
    	}
    	
    	String altoP1 = txtAltoP1.getText();
    	String anchoP1 = txtAnchoP1.getText();
    	String largoP1 = txtLargoP1.getText();
    	
    	String altoP2 = txtAltoP2.getText();
    	String anchoP2 = txtAnchoP2.getText();
    	String largoP2 = txtLargoP2.getText();
    	
    	if(numeroPiezas.equals("1")){
    		altoP2 = "0";
    		anchoP2 = "0";
    		largoP2 = "0";
    		peso2 = "0";
    	}
    	
    	String altoM = txtAltoM.getText();
    	String anchoM = txtAnchoM.getText();
    	String largoM = txtLargoM.getText();
    	
    	float sobrecosto = calcularSobrecostos(numPiezasMax, pesoMax, numeroPiezas, peso1, peso2, pesoMascota, altoP1, anchoP1, largoP1,
				altoP2, anchoP2, largoP2, altoM, anchoM, largoM);
    	
		if(sobrecosto != -1){
			mostrarMensaje("Información Equipaje", "Confirmacion de Compra", "El sobrecosto a pagar es de: $"+sobrecosto, AlertType.WARNING);
			System.out.println("VALOR TIQUETE SIN SOBRECOSTO: "+tiquete.getValorTiquete());
			tiquete.setValorTiquete(tiquete.getValorTiquete()+sobrecosto);
			System.out.println("VALOR TIQUETE CON SOBRECOSTO: "+tiquete.getValorTiquete());
			Cliente cliente = buscarCliente(txtIdCliente.getText());
			if(cliente!= null){
				cliente.setSaldoDisponible(cliente.getSaldoDisponible() - sobrecosto);
			}
			Persistencia.guardarRecursoXML(aplicacion.getAerolinea());
		}else{
			mostrarMensaje("Información Equipaje", "Datos invalidos", "Las dimensiones de sus piezas deben ser menores a 170 cm3 y de la maleta de mano menores a 110 cm3", AlertType.WARNING);
		}

    }
   
	/**
	 * Metodo para buscar un cliente
	 * @param event
	 * @return 
	 */
    @FXML
    public Cliente buscarCliente(String id){
    	HashSet<Cliente> listaClientes = aplicacion.getAerolinea().getListaClientes();
    	for (Cliente cliente : listaClientes) {
    		if(cliente.getIdentificacion().equals(id)){
    			return cliente;
    		}
    	}
		return null;

    }

    /**
     * Metodo apra calcular los sobrecostos de el equipaje
     * @param numPiezasMax
     * @param pesoMax
     * @param numeroPiezas
     * @param peso1
     * @param peso2
     * @param pesoMascota
     * @param altoP1
     * @param anchoP1
     * @param largoP1
     * @param altoP2
     * @param anchoP2
     * @param largoP2
     * @param altoM
     * @param anchoM
     * @param largoM
     * @return
     */
	private float calcularSobrecostos(int numPiezasMax, float pesoMax, String numeroPiezas, String peso1, String peso2,
			String pesoMascota, String altoP1, String anchoP1, String largoP1, String altoP2, String anchoP2, String largoP2,
			String altoM, String anchoM, String largoM){
    	float sobrecosto = 0;
    	float numPiezas = Float.parseFloat(numeroPiezas);
    	float peso1Maleta = Float.parseFloat(peso1);
    	float peso2Maleta = Float.parseFloat(peso2);
    	float pesoM = Float.parseFloat(pesoMascota);
    	float altoPieza1 = Float.parseFloat(altoP1);
    	float anchoPieza1 = Float.parseFloat(anchoP1);
    	float largoPieza1 = Float.parseFloat(largoP1);
    	float altoPieza2 = Float.parseFloat(altoP2);
    	float anchoPieza2 = Float.parseFloat(anchoP2);
    	float largoPieza2 = Float.parseFloat(largoP2);
    	float altoMM = Float.parseFloat(altoM);
    	float anchoMM = Float.parseFloat(anchoM);
    	float largoMM = Float.parseFloat(largoM);
    	
    	float dimensionesP1 = altoPieza1+anchoPieza1+largoPieza1;
    	float dimensionesP2 = altoPieza2+anchoPieza2+largoPieza2;
    	float dimensionesMM = altoMM+anchoMM+largoMM;
    	
    	float valorPorMascota = 0;
		if(Float.valueOf(pesoMascota)>3 && Float.valueOf(pesoMascota)<9){ 
			valorPorMascota = 48;
		}else{
			if(Float.valueOf(pesoMascota)>9){ 
				valorPorMascota = 48 + (Float.valueOf(pesoMascota) - 9) * 2;
			}
		}
		sobrecosto = valorPorMascota;
    	
    	if(numPiezas <= numPiezasMax){
    		if((peso1Maleta<=pesoMax && peso2Maleta <= pesoMax)){
        		if(dimensionesP1 <= 170 && dimensionesP2 <= 170){
            		if(dimensionesMM <= 110){
            			return sobrecosto;
            		}else{
            			return -1;
            		}
            	}else{
            		return -1;
            	}
        	}else{
        		sobrecosto += (((peso1Maleta + peso2Maleta) - pesoMax*2) * 8)*(1.065);
        		return sobrecosto;
        	}
    	}
    	return -1;	
	}

    public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
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

