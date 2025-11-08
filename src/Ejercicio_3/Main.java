package Ejercicio_3;


public class Main{
    public static void main(String[] args) {
        Usuario usuario = new Usuario("admin", "1234");
        Autenticacion autenticacion = new Autenticacion();
        validacion validacion = new validacion();

        System.out.println("¿Contraseña valida: " + validacion.validarcontraseña(usuario));
        System.out.println("Usuario Valido: " + autenticacion.autenticar(usuario, "1234"));
    }   
}