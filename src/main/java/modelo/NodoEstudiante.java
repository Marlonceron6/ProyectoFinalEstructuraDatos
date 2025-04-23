package modelo;

public class NodoEstudiante {
    public String usuario;
    public String contraseña;
    public String nombre;
    public String carrera;
    public NodoEstudiante siguiente;

    public NodoEstudiante(String usuario, String contraseña, String nombre, String carrera) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.carrera = carrera;
        this.siguiente = null;
    }
}