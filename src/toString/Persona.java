package toString;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;

    public Persona() {

    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /*toString es para representar el objeto en una salida de cadena, en un string*/

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido;
    }
}
