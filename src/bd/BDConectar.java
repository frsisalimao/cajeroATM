package bd;
import java.sql.*;
public class BDConectar {

    static String host = "127.0.0.1";
    static String baseDatos = "cajero";
    static String usuario = "root";
    static String password  = "fabricio";
    static String cadCon= "jdbc:mysql://"+host+"/"+baseDatos;

    public static Connection con;
    public static Statement st;

    public static void crearConexion() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
       Class.forName( "com.mysql.jdbc.Driver").newInstance();
    	try{        	
           con = DriverManager.getConnection( cadCon, usuario, password);
           st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void cerrarConexion() {
        try {
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
        }
    }
}
