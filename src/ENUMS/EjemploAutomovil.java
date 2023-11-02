package ENUMS;


public class EjemploAutomovil {
    public static void main(String[] args) {
        System.out.println("--subaru--");
        /*se puedem inicializar los datos con contructor o con metodos set*/
        Automovil subaru = new Automovil("Subaru", "Impresa");
        subaru.setCilindrada(2.0);
        /*COLOR CON ENUMS*/
        subaru.setColor(Color.BLANCO);
        /*color patente saldra null porque se da valor a la variable mas abajo*/
        System.out.println(subaru);


        System.out.println();
        System.out.println("--NISSAN--");
        /*COLOR CON ENUMS*/
        Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO, 3.5, 50);
        System.out.println(nissan);


        System.out.println();
        System.out.println("--MAZDA--");
        /*COLOR CON ENUMS*/
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.GRIS, 3.0);
        System.out.println(mazda);
        System.out.println(mazda.getColor());


    }
}
