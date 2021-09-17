package edu.mintic.configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Conexion {

    private final String usuario;
    private final String clave;
    private final String url;
    private final String driver;
    protected Connection objConexion;
    public Conexion() {
        usuario = "user-java";
        clave = "12345678";
        url = "jdbc:mysql://localhost:3306/db_proyecto_final";
        driver = "com.mysql.cj.jdbc.Driver";
        activar();
    }

    private void activar() {      
        try {
            Class.forName(driver);
            objConexion=DriverManager.getConnection(url,usuario,clave);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
}
