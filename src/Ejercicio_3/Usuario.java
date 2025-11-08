package Ejercicio_3;
/// separar la logica de autenticacion
public class Usuario {
    private String nombreUsuario;
    private String contraseña;
    public Usuario(String nombreUsuario, String contraseña){
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    public String getContraseña(){
        return contraseña;
    }

}
class Autenticacion {
    public boolean autenticar(Usuario usuario, String contraseñaIngresada){
        return usuario.getNombreUsuario().equals("admin") && usuario.getContraseña().equals(contraseñaIngresada);
    }
}
class validacion {
    public boolean validarcontraseña(Usuario usuario){
        return usuario.getContraseña().length() >= 8;
    }
}

