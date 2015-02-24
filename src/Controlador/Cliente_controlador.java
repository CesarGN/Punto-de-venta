package Controlador;

import Modelo.Modelo;

public class Cliente_controlador extends Modelo {

    public Cliente_controlador() {
        this.tabla="CLIENTE";
    }

    private void insertar_cliente(String[] datos) {

        String sql = "insert into cliente values ('" + datos[0] + "','" + datos[1] + "','" + datos[2] + "','"
                + datos[3] + "'," + Integer.parseInt(datos[4]) + ",'" + datos[5] + "','"
                + datos[6] + "','" + datos[7] + "','" + datos[8] + "','"
                + datos[9] + "','" + datos[10] + "','" + datos[11] + "',"
                + Integer.parseInt(datos[12]) + ",'" + datos[13] + "','" + datos[14] + "',"
                + Boolean.parseBoolean(datos[15]) + ");";
        this.Insert(sql, tabla, "Cliente registrado");

    }

    private void actualizar_cliente(String[] datos) {
        String sql = "UPDATE cliente\n"
                + "   SET nombre='" + datos[1] + "', ape_pat='" + datos[2] + "', ape_mat='" + datos[3] + "', puntos=" + datos[4] + ", rfc='" + datos[5] + "', \n"
                + "       colonia='" + datos[6] + "', calle='" + datos[7] + "', numero='" + datos[8] + "', ciudad='" + datos[9] + "', delegacion='" + datos[10] + "', cp='" + datos[11] + "', id_tipo_cliente=" + datos[12] + ", \n"
                + "       telefono='" + datos[13] + "', email='" + datos[14] + "', estatus=" + Boolean.parseBoolean(datos[15]) + "\n"
                + " WHERE id_cliente ='" + datos[0] + "' ;";
        this.Update(sql,tabla , "CLIENTE ACTUALIZADO");

    }

    public void agregarInsert(String[] datos) {

        String[] data = new String[16];
        String[][] consul = this.Select("select * from cliente ;", 1);
        if (consul == null) {
            data[0] = "CAA00";
        } else {
            consul = this.Select("select id_cliente from cliente order by id_cliente desc limit 1;", 1);

            data[0] = this.idNuevo(consul[0][0], 'C');
        }

        data[1] = datos[1];
        data[2] = datos[2];
        data[3] = datos[3];
        data[4] = "0";
        data[5] = datos[4];
        data[6] = datos[7];
        data[7] = datos[8];
        data[8] = datos[9];
        data[9] = datos[6];
        data[10] = datos[5];
        data[11] = datos[10];
        data[12] = datos[0];
        data[13] = datos[11];
        data[14] = datos[12];
        data[15] = "true";

        this.insertar_cliente(data);

    }

    public void agregarUpdate(String[] datos) {
        //validar datos

        this.actualizar_cliente(datos);

    }

    private String idNuevo(String id, char opc) {
        id = id.substring(1);
        int pos = id.length();
        char x;
        boolean ban = true;
        for (int i = (pos - 1); ban; --i) {
            x = id.charAt(i);
            if (x == '9' || x == 'Z') {
                if (x == '9') {
                    id = remplaza(id, '0', i);
                } else {
                    id = remplaza(id, 'A', i);
                }
            } else {
                ++x;
                id = remplaza(id, x, i);
                ban = false;
            }
        }
        return opc + id;
    }

    private String remplaza(String cadena, char caracter, int pos) {
        String cadena_aux = "";
        int i = 0;
        while (i < cadena.length()) {
            if (i == pos) {
                cadena_aux += caracter;
            } else {
                cadena_aux += cadena.charAt(i);
            }
            i++;
        }
        return cadena_aux;
    }

}
