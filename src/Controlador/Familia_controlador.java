
package Controlador;

import Modelo.Modelo;


public class Familia_controlador extends Modelo{

    public Familia_controlador() {
    this.tabla="categoria";
    }
    private void actualizar_familia(String[] datos) {
        String sql = "UPDATE categoria SET  nombre='" + datos[1] + "', porcentaje=" + datos[2] +" WHERE id_categoria=" + datos[0] + ";";
        this.Update(sql, tabla, "FAMILIA ACTUALIZADO");

    }

    public void agregarUpdateFamilia(String[] datos) {
        this.actualizar_familia(datos);
    }

    public void agregarInsertFamilia(String[] datos) {
        this.insertar_familia(datos);
    }

    private void insertar_familia(String[] datos) {
        String sql = "INSERT INTO categoria (nombre, porcentaje) VALUES ('" + datos[0] + "', " + datos[1] + ");";
        System.out.println(sql);
        this.Insert(sql, tabla, "FAMILIA REGISTRADA");

    }
    
    
    
    
}
