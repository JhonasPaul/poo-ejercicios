package atributo.metodo.stati;


public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueEstatico(45);

        System.out.println("--subaru--");
        /*se puedem inicializar los datos con contructor o con metodos set*/
        Automovil subaru = new Automovil("Subaru", "Impresa");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");
        /*color patente saldra null porque se da valor a la variable mas abajo*/
        System.out.println(subaru);


        /*STATIC, COLOR PATENTE*/
        Automovil.setColorPatente("Verde");
/*-------------------------------------------------*/

        System.out.println();
        System.out.println("--NISSAN--");
        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        nissan.setColor("Amarillo");
        System.out.println(nissan);

        System.out.println();
        System.out.println("--MAZDA--");
        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        System.out.println(mazda);

        /*IMPRIMIR EL METODO ESTATICO CALCULARCONSUMOESTATICO*/
        System.out.println("kilometros por litros: " + Automovil.calcularConsumoEstatico(300, 60));
    }
}
