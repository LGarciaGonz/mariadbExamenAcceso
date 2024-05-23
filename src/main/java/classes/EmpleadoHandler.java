package classes;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class EmpleadoHandler extends DefaultHandler {

    //variable donde almacenar pedidos
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    //Pedido que leo y que añado al arraylist
    private Empleado empleadoAux;
    //para almacenar el texto contenido en un nodo texto
    private StringBuilder buffer = new StringBuilder();

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "personal":
                break;
            case "empleado":
                empleadoAux = new Empleado();
                empleadoAux.setFechaAlta(Date.valueOf(LocalDate.now()));
                break;
            case "id", "dep", "apellido", "oficio", "salario", "comision":
                buffer.delete(0, buffer.length());
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "personal":
                break;
            case "empleado":
                empleados.add(empleadoAux);
                break;
            case "id":
                empleadoAux.setIdEmp(Integer.parseInt(buffer.toString()));
                break;
            case "dep":
                empleadoAux.setIdDepto(Integer.parseInt(buffer.toString()));
                break;
            case "apellido":
                empleadoAux.setApellido(buffer.toString());
                break;
            case "oficio":
                empleadoAux.setOficio(buffer.toString());
                break;
            case "salario":
                empleadoAux.setSalario(Float.parseFloat(buffer.toString()));
                break;
            case "comision":
                empleadoAux.setComision(Float.parseFloat(buffer.toString()));
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        buffer.append(ch, start, length);
    }

}