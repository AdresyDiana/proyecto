package modelo;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Andrés Felipe Rincón Sánchez
 */
public class conexion {

    public static Connection connection;

    private conexion() {
        try {
            String login = "12345678";
            String usu = "postgres";
            String url = "jdbc:postgresql://localhost:5433/laboratorio";
            System.out.println("Conectando.......");
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, usu, login);
            if (connection != null) {
               System.out.println("Nos conectamos super");
            connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); 
            }else{
                System.out.println("Rayoss error");
            }
        } catch (SQLException ex) {
            System.out.println("Rayos... no me conecte");
            System.out.println(ex);
        } catch (ClassNotFoundException exe) {
            System.out.println(exe);
        }
    }

    public static conexion getInstance() {

        return conexionHolder.INSTANCE;

    }

    public static class conexionHolder {

        private static final conexion INSTANCE = new conexion();

    }

}
