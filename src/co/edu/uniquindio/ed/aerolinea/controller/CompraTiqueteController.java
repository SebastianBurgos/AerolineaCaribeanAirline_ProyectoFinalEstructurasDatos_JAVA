
package co.edu.uniquindio.ed.aerolinea.controller;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import co.edu.uniquindio.ed.aerolinea.app.Aplicacion;
import co.edu.uniquindio.ed.aerolinea.infovisible.VueloDisponible;
import co.edu.uniquindio.ed.aerolinea.model.Tiquete;
import co.edu.uniquindio.ed.aerolinea.resources.Modalidad;
import co.edu.uniquindio.ed.aerolinea.resources.TipoClase;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class CompraTiqueteController {
	private Aplicacion aplicacion = new Aplicacion();
	ObservableList<VueloDisponible> listaVuelosDisponiblesData = FXCollections.observableArrayList();
	VueloDisponible vueloSeleccionado;
	FilteredList<VueloDisponible> filteredData;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnComprarTiquete;
    
    @FXML
    private Button btnMenu;

    @FXML
    private Button btnBuscarOpciones;

    @FXML
    private SplitMenuButton btnClaseServicio;

    @FXML
    private MenuItem optMonterrey;

    @FXML
    private DatePicker fechaRegreso;

    @FXML
    private SplitMenuButton btnCiudadDestino;

    @FXML
    private MenuItem optAngeles;

    @FXML
    private MenuItem optCDMX;

    @FXML
    private TableView<VueloDisponible> tableOpcionesVuelo;
    
    @FXML
    private TableColumn<String, VueloDisponible> columnOrigen;
    @FXML
    private TableColumn<String, VueloDisponible> columnDestino;
    @FXML
    private TableColumn<Integer, VueloDisponible> columnDuracion;
    @FXML
    private TableColumn<Float, VueloDisponible> columnCostoPersona;
    @FXML
    private TableColumn<Float, VueloDisponible> columnCosto;

    @FXML
    private SplitMenuButton btnModalidad;

    @FXML
    private MenuItem optIdaVenida;

    @FXML
    private MenuItem optSoloIda;

    @FXML
    private Button btnSalir;

    @FXML
    private SplitMenuButton btnCiudadOrigen;

    @FXML
    private DatePicker fechaInicio;

    @FXML
    private SplitMenuButton btnCantidadPersonas;

    @FXML
    private MenuItem optBogota;

    @FXML
    private MenuItem optPanama;

    @FXML
    private MenuItem optEjecutivo;

    @FXML
    private MenuItem optEconomico;

    @FXML
    private MenuItem optCancun;

    @FXML
    private MenuItem optBuenosAires;

    @FXML
    void salirApp(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void mostrarMenu(ActionEvent event) {
    	aplicacion.mostrarVentanaPrincipal();
    }
    
    @FXML
    void elegirSoloIda(ActionEvent event) {
    	btnModalidad.setText("Solo Ida");
    }

    @FXML
    void elegirIdaVenida(ActionEvent event) {
    	btnModalidad.setText("Ida y Venida");
    }

    @FXML
    void elegirCDMX(ActionEvent event) {
    	btnCiudadOrigen.setText("CDMX");
    }

    @FXML
    void elegirMonterrey(ActionEvent event) {
    	btnCiudadDestino.setText("Monterrey");
    }

    @FXML
    void elegirCancun(ActionEvent event) {
    	btnCiudadDestino.setText("Cancun");
    }

    @FXML
    void elegirBuenosAires(ActionEvent event) {
    	btnCiudadDestino.setText("Buenos Aires");
    }

    @FXML
    void elegirAngeles(ActionEvent event) {
    	btnCiudadDestino.setText("Los Angeles");
    }

    @FXML
    void elegirBogota(ActionEvent event) {
    	btnCiudadDestino.setText("Bogota");
    }

    @FXML
    void elegirPanama(ActionEvent event) {
    	btnCiudadDestino.setText("Panama");
    }

    @FXML
    void elegirEjecutivo(ActionEvent event) {
    	btnClaseServicio.setText("Ejecutivo");
    }

    @FXML
    void elegirEconomico(ActionEvent event) {
    	btnClaseServicio.setText("Economico");
    }

    @FXML
    void comprarTiquete(ActionEvent event) {
    	comprarTiquete();
    }
    
    @FXML
    void seleccionar1Persona(ActionEvent event) {
    	btnCantidadPersonas.setText("1");
    }

    @FXML
    void seleccionar2Persona(ActionEvent event) {
    	btnCantidadPersonas.setText("2");
    }

    @FXML
    void seleccionar3Persona(ActionEvent event) {
    	btnCantidadPersonas.setText("3");
    }

    @FXML
    void seleccionar4Persona(ActionEvent event) {
    	btnCantidadPersonas.setText("4");
    }

    @FXML
    void seleccionar5Persona(ActionEvent event) {
    	btnCantidadPersonas.setText("5");
    }

    @FXML
    void seleccionar6Persona(ActionEvent event) {
    	btnCantidadPersonas.setText("6");
    }

    @FXML
    void seleccionar7Persona(ActionEvent event) {
    	btnCantidadPersonas.setText("7");
    }

    @FXML
    void seleccionar8Persona(ActionEvent event) {
    	btnCantidadPersonas.setText("8");
    }

    @FXML
    void seleccionar9Persona(ActionEvent event) {
    	btnCantidadPersonas.setText("9");
    }

    /**
     * Metodo para procesar la compra de un tiquete segun un vuelo seleccionado
     */
	private void comprarTiquete() {
		try {
			String modalidad = btnModalidad.getText();
			String servicio = btnClaseServicio.getText();
			String ciudadOrigen = btnCiudadOrigen.getText();
			String ciudadDestino = btnCiudadDestino.getText();
			String fechaIda = String.valueOf(fechaInicio.getValue());
			String fechaVuelta = String.valueOf(fechaRegreso.getValue());
			int numPersonas = Integer.parseInt(btnCantidadPersonas.getText());
			
			if(vueloSeleccionado != null){
				if(fechaVuelta.equals("")){
					fechaVuelta = "-";
				}
				float costo = vueloSeleccionado.getCosto();
				Tiquete tiquete1 = crearTique(modalidad, servicio, ciudadOrigen, ciudadDestino, fechaIda, fechaVuelta,costo, numPersonas);
				aplicacion.mostrarVentanaDetallesVuelo(tiquete1);
			}
		} catch (Exception e) {
			mostrarMensaje("Información Compra Tiquete", "Datos invalidos", "Porfavor complete todos los campos necesarios", AlertType.WARNING);
		}
	}

	private Tiquete crearTique(String modalidad, String servicio, String ciudadOrigen, String ciudadDestino, String fechaIda, String fechaVuelta, float costo, int numPersonas) {
		// TODO Auto-generated method stub
		Modalidad modalidadTique = Modalidad.IDAYVENIDA;
		TipoClase tipoclase = TipoClase.ECONOMICO;
		Integer duracion = vueloSeleccionado.getDuracion();
		Float valorPersona = costo/numPersonas;
		if(modalidad.equals("Solo Ida")){
			modalidadTique = Modalidad.SOLOIDA;
		}
		if(servicio.equals("Ejecutivo")){
			tipoclase = TipoClase.EJECUTIVO;
		}
		int numeroTiquete = (int) (Math.random() * 100000000) + 1;
		
		Tiquete tiqueteCreado = new Tiquete(String.valueOf(numeroTiquete), tipoclase,modalidadTique,ciudadOrigen,ciudadDestino,(Float) costo,fechaIda,fechaVuelta,duracion,numPersonas, valorPersona);
		return tiqueteCreado;
	}

    public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
		tableOpcionesVuelo.getItems().clear();
		tableOpcionesVuelo.setItems(getListaVuelosDisponiblesData());
		
		// 3. Wrap the FilteredList in a SortedList.
    	SortedList<VueloDisponible> sortedData = new SortedList<>(filteredData);

    	// 4. Bind the SortedList comparator to the TableView comparator.
    	sortedData.comparatorProperty().bind(tableOpcionesVuelo.comparatorProperty());

    	// 5. Add sorted (and filtered) data to the table.
    	tableOpcionesVuelo.setItems(sortedData);
	}
    
	private ObservableList<VueloDisponible> getListaVuelosDisponiblesData() {
		listaVuelosDisponiblesData.addAll(aplicacion.obtenerVuelos());
		return listaVuelosDisponiblesData;
	}


    @FXML
    void initialize() {
    	this.columnOrigen.setCellValueFactory(new PropertyValueFactory<>("origen"));
    	this.columnDestino.setCellValueFactory(new PropertyValueFactory<>("destino"));
    	this.columnDuracion.setCellValueFactory(new PropertyValueFactory<>("duracion"));
    	this.columnCostoPersona.setCellValueFactory(new PropertyValueFactory<>("costoPersona"));
    	this.columnCosto.setCellValueFactory(new PropertyValueFactory<>("costo"));
    	
    	filteredData = new FilteredList<>(listaVuelosDisponiblesData, p -> true);


    	// 2. Set the filter Predicate whenever the filter changes.
    	btnCiudadDestino.textProperty().addListener((observable, oldValue, newValue) -> {
			filteredData.setPredicate(VueloDisponible-> {
				// If filter text is empty, display all persons.
				if (newValue == null || newValue.isEmpty()) {
					return true;
				}

				// Compare first name and last name of every person with filter text.
				String lowerCaseFilter = newValue.toLowerCase();

				if (String.valueOf(VueloDisponible.getDestino()).toLowerCase().contains(lowerCaseFilter)) {
					return true; // Filter matches first name.
				}
				return false; // Does not match.
			});
		});
    	
    	tableOpcionesVuelo.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
    		vueloSeleccionado = newSelection;

    	});
    }
    
	 public void mostrarMensaje(String titulo, String header, String contenido, AlertType alertType) {

	    	Alert alert = new Alert(alertType);
	    	alert.setTitle(titulo);
	    	alert.setHeaderText(header);
	    	alert.setContentText(contenido);
	    	alert.showAndWait();
	}
}
