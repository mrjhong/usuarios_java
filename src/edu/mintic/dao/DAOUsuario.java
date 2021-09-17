package edu.mintic.dao;

import java.sql.PreparedStatement;
import edu.mintic.configuration.Conexion;
import edu.mintic.interfaces.Operaciones;
import edu.mintic.models.Perfil;
import edu.mintic.models.Usuario;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOUsuario extends Conexion implements Operaciones<Usuario> {

    private String sql;
    private PreparedStatement consulta;

    public DAOUsuario() {
    }

    @Override
    public boolean agregar(Usuario miObjeto) {
        try {
            sql = "INSERT INTO usuarios(cod_perfil,nombre_usuario,clave_usuario,estado_usuario)"
                    + "VALUES(?,?,?,?)";
            consulta = objConexion.prepareStatement(sql);

            consulta.setInt(1, miObjeto.getPerfilUsuario().getCodPerfil());
            consulta.setString(2, miObjeto.getNombreUsuario());
            consulta.setString(3, miObjeto.getClaveUsuario());
            consulta.setInt(4, miObjeto.getEstadoUsuario());

            int filas = consulta.executeUpdate();
            objConexion.close();

            return filas > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean borrar(Usuario miObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(Usuario miObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> consultar(String orden) {
        try {
            ResultSet rs;
            List<Usuario> arregloUsuario = new ArrayList<>();

            if (orden.isEmpty()) {
                orden = "cod_perfil";
            }
            sql = "SELECT u.cod_usuario, u.cod_perfil, u.nombre_usuario,"
                    + "u.clave_usuario, u.estado usuario "
                    + ")SELECT nombre_perfil FROM perfiles WHERE cod_perfil=u.cod_perfil)"
                    + " AS nomPerfil  FROM usuarios u ORDER BY" + orden;
            consulta = objConexion.prepareStatement(sql);
            rs = consulta.executeQuery();
            while (rs.next()) {
                Perfil objPerfil = new Perfil();
                objPerfil.setCodPerfil(Integer.parseInt(rs.getObject(2).toString()));
                objPerfil.setNombrePerfil(rs.getObject(6).toString());
           

            }
           objConexion.close();  
           return arregloUsuario;

        } catch (SQLException ex) {
            Logger.getLogger(DAOperfil.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        }

        @Override
        public Usuario buscar
        (Integer llavePrimaria
        
            ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
