package Modelo;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Modelo extends Conexion {
    public String tabla="";

    public String[][] Select(String consultaSQL, int columnas) {//columnas es el numero de columnas que se espera recuperar de la consultaSQL
        this.Conectar();
        if (this.estado_conexion) {
            int x = 1, filas = 0;
            String[][] arreglo = null;
            try {
                resultado = sentencia.executeQuery(consultaSQL);
                resultado.last();
                filas = resultado.getRow();
                if (filas == 0) {
                    return null;
                }
                resultado.absolute(0);
                arreglo = new String[filas][columnas];
                while (resultado.next()) {
                    while (x <= columnas) {
                        arreglo[resultado.getRow() - 1][x - 1] = resultado.getString(x);
                        x++;
                    }
                    x = 1;
                }

                this.Desconectar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al consultar la BD, ponerse en contacto con su admon. \n error: " + ex.toString());
                return null;
            }
            return arreglo;
        } else {
            return null;
        }
    }

    public void Insert(String sql, String tabla, String msj) {//msj es el msj que se da cuando se hace correcto el insert
        this.Conectar();
        if (this.estado_conexion) {
            try {
                this.conexion.setAutoCommit(false);
                this.sentencia.executeUpdate(sql);
                this.sentencia.close();
                this.conexion.commit();
                this.conexion.close();
                JOptionPane.showMessageDialog(null, msj);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al registrar en " + tabla + ", ponerse en contacto con su admon. \n error: " + ex.toString());
            }
        }

        this.Desconectar();
    }

    public void Update(String sql, String tabla, String msj) {//msj es el msj que se da cuando se hace correcto el update
        this.Conectar();
        if (this.estado_conexion) {
            try {
                this.conexion.setAutoCommit(false);
                this.sentencia.executeUpdate(sql);
                this.sentencia.close();
                this.conexion.commit();
                this.conexion.close();
                JOptionPane.showMessageDialog(null, msj);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al actualizar en " + tabla + ", ponerse en contacto con su admon. \n error: " + ex.toString());
            }
        }

        this.Desconectar();
    }

    public void Delete(String sql, String tabla, String msj) {//msj es el msj que se da cuando se hace correcto el delete
        this.Conectar();
        if (this.estado_conexion) {
            try {
                this.conexion.setAutoCommit(false);
                this.sentencia.executeUpdate(sql);
                this.sentencia.close();
                this.conexion.commit();
                this.conexion.close();
                JOptionPane.showMessageDialog(null, msj);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al borrar en " + tabla + ", ponerse en contacto con su admon. \n error: " + ex.toString());
            }
        }

        this.Desconectar();
    }

   

    public static void main(String[] args) {
        Modelo con = new Modelo();
        
        if (con.estado_conexion) {
            String[][] arreglo = con.Select("select * from cliente;", 16);
            if (arreglo != null) {
                for (int i = 0; i < arreglo.length; i++) {
                    for (int j = 0; j < arreglo[i].length; j++) {
                        System.out.print(arreglo[i][j] + " ");
                    }
                    System.out.println("");
                }
            } else {
                System.out.println("no hay");

            }
        }

    }
}
