package equals;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        /*valida que losobjetos sean del mimo tipo*/
        if (!(obj instanceof Persona )) {
            return false;
        }
        /*castear el objeto obj a tipo Automovil*/
        Persona persona = (Persona) obj;
        /*comprar que los atributos no seas nulos y que sean iguales,
         * si son iguales, retorna true*/
        return(this.nombre.equals(persona.nombre) && this.apellido.equals(persona.apellido));
    }
}
