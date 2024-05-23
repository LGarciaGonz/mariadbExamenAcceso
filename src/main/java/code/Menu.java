package code;

import code.CargarEmpleados.CargarEmps;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        // DECLARACIONES
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String opcion = "";

        // BUCLE PARA MOSTRAR EL MENÚ DE OPCIONES
        while (!salir) {

            System.out.println("""
                    \n-----------------------------------------------------
                    1. Listar todos los departamentos
                    2. Listar los empleados de un departamento
                    3. Cargar empleados (archivo nuevoPersonal.xml)
                    4. Generar archivo "departamentos.json"
                    0. Salir
                    -----------------------------------------------------""");

            opcion = sc.nextLine();                                                                         // Leer y guardar la opción del usuario.

            // ESTRUCTURA PARA LA LLAMADA A LOS MÉTODOS
            switch (opcion) {
                case "0" ->
                        salir = true;                                                                   // Fin de la ejecución del menú.

                case "1" -> ListarDeptos.listarDeptos();

                case "2" -> ListarEmps.listarEmpleados();
                case "3" -> CargarEmps.leerXML();
                case "4" -> GenerarJSON.generarJSON();

                default ->
                        System.out.println("\n>>>OPCIÓN NO VÁLIDA: Introduzca una opción del menú");        // Informar al usuario de un error cometido.
            }
        }
    }
}
