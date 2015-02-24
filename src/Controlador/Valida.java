package Controlador;

public class Valida {

    private boolean Caracter(String cadena) {
        cadena = cadena.replace(" ", "");
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean Numerico(String cadena) {
        cadena = cadena.replace(" ", "");
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLetter(cadena.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
