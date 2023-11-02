package atributos.constantes;


import java.sql.SQLOutput;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueEstatico(45);

        System.out.println("--subaru--");
        /*se puedem inicializar los datos con contructor o con metodos set*/
        Automovil subaru = new Automovil("Subaru", "Impresa");
        subaru.setCilindrada(2.0);
        subaru.setColor(Automovil.COLOR_BLANCO);
        /*color patente saldra null porque se da valor a la variable mas abajo*/
        System.out.println(subaru);


        /*STATIC, COLOR PATENTE*/
        Automovil.setColorPatente("Verde");
/*-------------------------------------------------*/

        System.out.println();
        System.out.println("--NISSAN--");
        Automovil nissan = new Automovil("Nissan", "Navara", Automovil.COLOR_GRIS_OSCURO, 3.5, 50);
        nissan.setColor("Amarillo");
        System.out.println(nissan);

        System.out.println();
        System.out.println("--MAZDA--");
        Automovil mazda = new Automovil("Mazda", "BT-50", Automovil.COLOR_ROJO, 3.0);
        System.out.println(mazda);

        /*IMPRIMIR EL METODO ESTATICO CALCULARCONSUMOESTATICO*/
        System.out.println("kilometros por litros: " + Automovil.calcularConsumoEstatico(300, 60));

        /*ATRIBUTOS CONSTANTES: SIEMPRE SON PUBLICAS Y ESTATICAS (FINAL ES CONSTANTE)*/
        System.out.println();
        System.out.println("--ATRIBUTOS CONSTANTES--");
        System.out.println("Velocidad maxima en carretera: "+ Automovil.VELOCIDAD_MAXIMA_CARRETERA + "k/h");
        System.out.println("Velocidad maxima en ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD+"k/h");

    }
}
