package sobrecarga.de.constructores;

public class EjemploPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Jonatan");
        persona1.setApellido("Ortiz");
        persona1.setEdad(34);
        persona1.setDireccion("Lima");

        System.out.println(persona1.getNombre());
        System.out.println(persona1.getApellido());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getDireccion());
        System.out.println();

        Persona persona2 = new Persona("Jonathan");
        System.out.println(persona2.getNombre());

        Persona persona3 = new Persona("Jonathan", "ortiz");
        System.out.println(persona3.getNombre());
        System.out.println(persona3.getApellido());

        Persona persona4 = new Persona("Jonathan", "Ortiz", 34);
        System.out.println(persona4.getNombre());
        System.out.println(persona4.getApellido());
        System.out.println(persona4.getEdad());

    }
}
