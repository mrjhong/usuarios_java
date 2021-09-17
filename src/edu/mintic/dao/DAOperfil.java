package edu.mintic.dao;

import java.sql.PreparedStatement;
import edu.mintic.configuration.Conexion;
import edu.mintic.interfaces.Operaciones;
import edu.mintic.models.Perfil;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOperfil extends Conexion implements Operaciones<Perfil> {

    private String sql;
    private PreparedStatement consulta;

    public DAOperfil() {

    }

    @Override
    public boolean agregar(Perfil miObjeto) {
        try {
            sql = "INSERT INTO perfiles(nombre_perfil)VALUES(?)";
            consulta = objConexion.prepareStatement(sql);
            consulta.setString(1, miObjeto.getNombrePerfil());
            int filas = consulta.executeUpdate();
            objConexion.close();

            return filas > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DAOperfil.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean borrar(Perfil miObjeto) {
        try {
            sql = "DELETE FROM perfiles WHERE cod_perfil =?";
            consulta = objConexion.prepareStatement(sql);
            consulta.setInt(1, miObjeto.getCodPerfil());
            int filas = consulta.executeUpdate();
            objConexion.close();
            return filas > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DAOperfil.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean actualizar(Perfil miObjeto) {
        try {

            sql = "UPDATE perfiles SET nombre_perfil=? WHERE cod_perfil=?";
            consulta = objConexion.prepareStatement(sql);
            consulta.setString(1, miObjeto.getNombrePerfil());
            consulta.setInt(2, miObjeto.getCodPerfil());
            int filasAfectadas = consulta.executeUpdate();
            objConexion.close();

            return filasAfectadas > 0;

        } catch (SQLException ex) {
            Logger.getLogger(DAOperfil.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List<Perfil> consultar(String orden) {
        try {
            ResultSet rs;
            List<Perfil> arregloPerfiles = new ArrayList<>();
            
            if (orden.isEmpty()) {
                orden="cod_perfil";
            }
            sql = "SELECT cod_perfil, nombre_perfil FROM perfiles ORDER BY "+orden;
            consulta = objConexion.prepareStatement(sql);
            rs = consulta.executeQuery();
            while (rs.next()) {
                Perfil objPerfil = new Perfil();
                objPerfil.setCodPerfil(Integer.parseInt(rs.getObject(1).toString()));
                objPerfil.setNombrePerfil(rs.getObject(2).toString());

                arregloPerfiles.add(objPerfil);

            }
            objConexion.close();
            return arregloPerfiles;

        } catch (SQLException ex) {
            Logger.getLogger(DAOperfil.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Perfil buscar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
