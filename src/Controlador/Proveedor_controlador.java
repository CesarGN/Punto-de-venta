package Controlador;

import Modelo.Modelo;

public class Proveedor_controlador extends Modelo {

    public Proveedor_controlador() {
        this.tabla = "proveedor";
    }

    private void actualizar_proveedor(String[] datos) {
        String sql = "UPDATE proveedor SET  nombre='" + datos[1] + "', colonia='" + datos[2] + "', calle='" + datos[3] + "', "
                + "numero='" + datos[4] + "', ciudad='" + datos[5] + "', delegacion='" + datos[6] + "', "
                + "telefono='" + datos[7] + "', email='" + datos[8] + "', rfc='" + datos[9] + "', cp='" + datos[10] + "', estatus=" + Boolean.parseBoolean(datos[11]) + ""
                + " WHERE id_proveedor=" + datos[0] + ";";
        this.Update(sql, tabla, "PROVEEDOR ACTUALIZADO");

    }

    public void agregarUpdateProvedor(String[] datos) {
        this.actualizar_proveedor(datos);
    }

    public void agregarInsertProvedor(String[] datos) {
        this.insertar_proveedor(datos);
    }

    private void insertar_proveedor(String[] datos) {
        String sql = "INSERT INTO proveedor(\n"
                + "            nombre, colonia, calle, numero, ciudad, delegacion, \n"
                + "            telefono, email, rfc, cp, estatus)\n"
                + "    VALUES ('" + datos[0] + "', '" + datos[1] + "', '" + datos[2] + "', '" + datos[3] + "', '" + datos[4] + "', '" + datos[5] + "', \n"
                + "            '" + datos[6] + "', '" + datos[7] + "', '" + datos[8] + "', '" + datos[9] + "', " +  Boolean.parseBoolean(datos[10]) + ");";
        System.out.println(sql);
        this.Insert(sql, tabla, "PROVEEDOR REGISTRADO");

    }

}
