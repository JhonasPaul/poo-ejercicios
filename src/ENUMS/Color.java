package ENUMS;

/*UN ENUM, ES UNA COLECCION DE VALORES O atributros CONSTANTES*/
public enum Color {
    /*EL VALORM ES EL MISMO NOMBRE DE LA CONSTANTE*/
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris"),
    NARANJO("Naranjo");

    /*personalizar las constantes para que salgan en minusculas*/
    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColorEnum() {
        return color;
    }
}
