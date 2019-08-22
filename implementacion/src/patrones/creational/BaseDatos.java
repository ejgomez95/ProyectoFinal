package patrones.creational;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatos {
    //TODO: Aquí conexión con base de datos SQL
    private static Connection conn = null;
    private BaseDatos() throws SQLException{
        try {
            if( conn == null ){
                String driver="com.mysql.jdbc.Driver"; //el driver varia segun la DB que usemos
                String pwd="carlier";
                String usr="cesar";
                String dbName ="tecnoimportsa";
                String url="jdbc:mysql://172.17.0.2:3306/" + dbName;
                Class.forName(driver).newInstance();
                conn = DriverManager.getConnection(url,usr,pwd);
                System.out.println("Conexión exitosa");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException{
        if (conn == null){
            new BaseDatos();
        }
        return conn;
    }
}
