package code;

import connection.ConexionBD;

import java.sql.*;

public class ListarDeptos {

    public static void listarDeptos() {

        try(Connection miCon = ConexionBD.conectar()) {

//            Date fecha = Date.valueOf(LocalDate.now());
//            System.out.println(fecha);

            PreparedStatement pstmt = miCon.prepareStatement("SELECT * FROM departamentos");
            ResultSet rs = pstmt.executeQuery();

            System.out.println("\n-----------[ LISTADO DE DEPARTAMENTOS ]-----------");

            while (rs.next()) {
                String nomDepto = rs.getString("dnombre");
                int idDepto = rs.getInt("dept_no");
                System.out.println("> " + idDepto + " " + nomDepto);
            }

        } catch (SQLException e) {
            System.err.println("\n>>> Error en la recogida de datos " + e.getMessage());
            e.printStackTrace();
        }
    }
}
