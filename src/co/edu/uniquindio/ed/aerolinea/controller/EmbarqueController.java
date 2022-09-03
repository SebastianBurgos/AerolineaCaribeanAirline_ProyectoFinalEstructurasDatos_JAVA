package co.edu.uniquindio.ed.aerolinea.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.ed.aerolinea.app.Aplicacion;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class EmbarqueController {
	private Aplicacion aplicacion = new Aplicacion();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnEncolarCarro;

    @FXML
    private TextField numCarroRetirar;

    @FXML
    private GridPane gridPaneZonaCarga;

    @FXML
    private Button btnDesencolarCarro;

    @FXML
    private GridPane gridPaneZonaEspera;

    @FXML
    private Button btnSalir;

    @FXML
    private GridPane gridPaneZonaSalida;

    @FXML
    private Button btnMenu;

    @FXML
    private Button btnRetirarCarro;

    @FXML
    void salirApp(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void mostrarMenu(ActionEvent event) {
    	aplicacion.mostrarVentanaPrincipal();
    }

    @FXML
    void encolarCarro(ActionEvent event) {
    	for (int i = 18; i >= 0; i--) {
    		if(i>=9){
    			if(!gridPaneZonaCarga.getChildren().get(i-9).isVisible()){
        			gridPaneZonaCarga.getChildren().get(i-9).setVisible(true);
        			break;
            	}
    		}
    		if(i<9){
    			if(!gridPaneZonaEspera.getChildren().get(i).isVisible()){
    				gridPaneZonaEspera.getChildren().get(i).setVisible(true);
        			break;
            	}
    		}
		}
    }

    @FXML
    void desencolarCarro(ActionEvent event) {
    	for (int i = 0; i <= 18; i++) {
    		if(i>=9){
    			if(gridPaneZonaCarga.getChildren().get(i-9).isVisible()){
        			gridPaneZonaCarga.getChildren().get(i-9).setVisible(false);
        			break;
            	}
    		}
    		if(i<9){
    			if(gridPaneZonaEspera.getChildren().get(i).isVisible()){
    				gridPaneZonaEspera.getChildren().get(i).setVisible(false);
        			break;
            	}
    		}
		}
    }

    @FXML
    void retirarCarro(ActionEvent event) {
    	for (int i = 0; i <= 18; i++) {
    		if(i>=9){
    			if(gridPaneZonaCarga.getChildren().get(i-9).isVisible()){
        			gridPaneZonaCarga.getChildren().get(i-9).setVisible(false);
        			break;
            	}
    		}
    		if(i<9){
    			if(gridPaneZonaEspera.getChildren().get(i).isVisible()){
    				gridPaneZonaEspera.getChildren().get(i).setVisible(false);
        			break;
            	}
    		}
		}
    }

    public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

    @FXML
    void initialize() {

    }
}
