package patrones.creational;

import java.sql.Connection;

public class BaseDatos {
    //TODO: Aquí conexión con base de datos SQL
    private static Connection conn = null;
    private BaseDatos(){
        try {
            if( con == null ){
                String driver="com.mysql.jdbc.Driver"; //el driver varia segun la DB que usemos
                String url="jdbc:mysql://localhost:3306/tecnoimportsa";
                String pwd="Mysqlworkbench1";
                String usr="root";
                Class.forName(driver);
                con = DriverManager.getConnection(url,usr,pwd);
                System.out.println("Conectionesfull");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }

    public static Connection getConnection(){
        if (conn == null){
            new BaseDatos();
        }
        return conn;
    }
}
