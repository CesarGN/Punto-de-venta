package Controlador;

import Modelo.Modelo;

public class Usuario_controlador extends Modelo {
    public Usuario_controlador() {
        this.tabla="USUARIO";
    }
//id,nom,pat,mat.rfc.col,calle,num,cd,,estado,cp,id_tipo,estatus,telefono,email
    private void insertar_cliente(String[] datos) {

        String sql = "insert into usuario values (" + datos[0] + ",'" + datos[1] + "','" + datos[2] + "','"
                + datos[3] + "','" + datos[4] + "','" + datos[5] + "','"
                + datos[6] + "','" + datos[7] + "','" + datos[8] + "','"
                + datos[9] + "','" + (datos[10]) + "',"
                + Integer.parseInt(datos[11]) + "," + Boolean.parseBoolean(datos[12]) + ",'" + datos[13] +"','" + datos[14] + "');";
       
        this.Insert(sql, tabla, "Usuario registrado");

    }

    private void actualizar_usuario(String[] datos) {
        String sql = "UPDATE usuario\n"
                + "   SET nombre='" + datos[1] + "', ape_pat='" + datos[2] + "', ape_mat='" + datos[3] + "',rfc='" + datos[4] + "', \n"
                + "       colonia='" + datos[5] + "', calle='" + datos[6] + "', numero='" + datos[7] + "', ciudad='" + datos[8] 
                + "   ', delegacion='" + datos[9] + "', cp='" + datos[10] + "', id_tipo_usuario=" + datos[12] + ", \n"
                + "       telefono='" + datos[13] + "', email='" + datos[14] + "', estatus=" + Boolean.parseBoolean(datos[11]) + "\n"
                + " WHERE id_usuario=" + datos[0] + " ;";
        System.out.println(sql);
        this.Update(sql,tabla , "USUARIO ACTUALIZADO");

    }
    
        

    public void agregarInsert(String[] datos) {

        String[] data = new String[15];
        String[][] consul = this.Select("select * from usuario ;", 1);
        if (consul == null) {
            data[0] = "1";
        } else {
            consul = this.Select("select count(*) from usuario;", 1);
            data[0] = String.valueOf(Integer.parseInt(consul[0][0])+1);
        }


        data[1] = datos[0];
        data[2] = datos[1];
        data[3] = datos[2];
        data[4] = datos[3];
        data[5] = datos[4];
        data[6] = datos[5];
        data[7] = datos[6];
        data[8] = datos[7];
        data[9] = datos[8];
        data[10] = datos[9];
        data[11] = datos[10];
        data[12] = "true";
        data[13] = datos[11];
        data[14] = datos[12];
        

        this.insertar_cliente(data);

    }

    public void agregarUpdate(String[] datos) {
        //validar datos

        this.actualizar_usuario(datos);

    }

  

}
