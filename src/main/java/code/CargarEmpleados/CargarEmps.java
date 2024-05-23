package code.CargarEmpleados;

import classes.Empleado;
import classes.EmpleadoHandler;
import libs.CheckFiles;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class CargarEmps {

    public static void leerXML() {

        Path p = Path.of("src/main/resources/nuevoPersonal.xml");

        ArrayList<Empleado> empleadoXML = new ArrayList<Empleado>();

        // Comprobar si el archivo existe.
        if (CheckFiles.ficheroLegible(p)) {
            SAXParserFactory saxPF = SAXParserFactory.newInstance();

            EmpleadoHandler EmpleadoHandler = new EmpleadoHandler();


            try {
                SAXParser parser = saxPF.newSAXParser();
                parser.parse(p.toFile(), EmpleadoHandler);
                empleadoXML = EmpleadoHandler.getEmpleados();

            } catch (ParserConfigurationException e) {
                System.err.println("\n>>> ERROR: se ha producido un error al parsear los datos: " + e.getMessage());
            } catch (SAXException e) {
                System.out.println("\n>>> ERROR SAX: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("\n>>> ERROR: " + e.getMessage());
            }
        }

    }

}
