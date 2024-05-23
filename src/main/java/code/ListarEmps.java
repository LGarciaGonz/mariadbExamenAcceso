package code;

import connection.ConexionBD;
import libs.Leer;

import javax.xml.transform.Result;
import java.sql.*;

public class ListarEmps {
    public static void listarEmpleados() {

        System.out.println("\n-----------[ LISTAR EMPLEADOS ]-----------");

        ListarDeptos.listarDeptos();

        int idDepto = Leer.pedirEntero("\nIntroduce el ID del departamento para listar sus empleados.");

        try (Connection miCon = ConexionBD.conectar()) {

            PreparedStatement pstmt = miCon.prepareStatement("SELECT * FROM empleados where dept_no like ?");
            pstmt.setInt(1, idDepto);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {

                System.out.println("\n-----------[ LISTADO DE EMPLEADOS DEL DEPARTAMENTO " + idDepto + " ]-----------");

                while (rs.next()) {

                    System.out.println("> " + rs.getString("apellido"));

                }
            } else {
                System.err.println(">>> Error: el departamento introducido no existe.");
            }

        } catch (SQLException e) {
            System.err.println("\n>>> Error en la recogida de datos " + e.getMessage());
            e.printStackTrace();
        }
    }
}