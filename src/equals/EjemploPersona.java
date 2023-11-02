package equals;

public class EjemploPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Jonathan", "Ortiz");
        Persona persona2 = new Persona("Jonathan", "Ortiz");
        System.out.println(persona1.equals(persona2));
    }
}
