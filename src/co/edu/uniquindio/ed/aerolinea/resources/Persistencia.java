package co.edu.uniquindio.ed.aerolinea.resources;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import co.edu.uniquindio.ed.aerolinea.model.Aerolinea;

public class Persistencia {

    public static final String RUTA_ARCHIVO_MODELO_AEROLINEA_XML = "src/co/edu/uniquindio/ed/aerolinea/archivos/modelo.xml";


    public static Aerolinea cargarRecursoXML() {
        Aerolinea aerolinea = null;
            try {
                aerolinea = (Aerolinea) cargarRecursoSerializadoXML(RUTA_ARCHIVO_MODELO_AEROLINEA_XML);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return aerolinea;
     }

    public static void guardarRecursoXML(Aerolinea aerolinea) {
            try {
                 salvarRecursoSerializadoXML(RUTA_ARCHIVO_MODELO_AEROLINEA_XML, aerolinea);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
     }

    public static Object cargarRecursoSerializadoXML(String rutaArchivo) throws IOException {

        XMLDecoder decodificadorXML;
        Object objetoXML;

        decodificadorXML = new XMLDecoder(new FileInputStream(rutaArchivo));
        objetoXML = decodificadorXML.readObject();
        decodificadorXML.close();
        return objetoXML;

    }

    public static void salvarRecursoSerializadoXML(String rutaArchivo, Object objeto) throws IOException {

        XMLEncoder codificadorXML;

        codificadorXML = new XMLEncoder(new FileOutputStream(rutaArchivo));
        codificadorXML.writeObject(objeto);
        codificadorXML.close();

    }
}
