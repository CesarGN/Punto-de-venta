package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;
    public boolean estado_conexion;//nos va a indicar si la conexion fue exitosa y asi evitar que se cierre el programa por una excepcion

    public void Conectar() {
        String name_db = "pv";
        String user = "postgres";
        String ser = "192.168.0.2";
        String pass = "postgres";
        String cadenaConexion = "jdbc:postgresql://" + ser + "/" + name_db + "?" + "user=" + user + "&password=" + pass + "";
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(cadenaConexion);
            conexion.setAutoCommit(true);
            sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            this.estado_conexion = true;
        } catch (ClassNotFoundException ex) {
            this.estado_conexion = false;
            JOptionPane.showMessageDialog(null, "Conexion\nError de DRIVER\n ponerse en contacto con su admon. \n error: " + ex.toString());
        } catch (SQLException ex) {
            this.estado_conexion = false;
            JOptionPane.showMessageDialog(null, "Conexion\nError de CONEXIÓN\n ponerse en contacto con su admon. \n error: " + ex.toString());
        }
    }

    public void Desconectar() {
        try {
            sentencia.close();
            conexion.close();
            this.estado_conexion = false;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al CERRRAR CONEXIÓN, ponerse en contacto con su admon. \n error: " + ex.toString());
            this.estado_conexion = false;
        }
    }

}
