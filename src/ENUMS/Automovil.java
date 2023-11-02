package ENUMS;

public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;

    /*CAMBIAR DE STRING A TIPO ENUM(Color)*/
    private Color color = Color.GRIS;
    private double cilindrada;

    private int capacidadEstanque = 4;

    /*ENUM*/
    private static Color colorPatente = Color.NARANJO;
    private static int ultimoId;

    /*TRAER EL VALORM ES EL MISMO NOMBRE DE LA CONSTANTE*/
    public Color getColor() {
        return color;
    }

    /*cada vez que se crea el objeto en el contructor, incrementa el ultimoId y se asiga alatributo id de la instancia*/
    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo) {
        this(); /*llama al constructor vacio*/
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    /*CAMBIAR DE STRING A TIPO ENUM(Color)*/
    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo);
        this.color = color;
        this.cilindrada = cilindrada;
    }

    /*CAMBIAR DE STRING A TIPO ENUM(Color)*/
    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilindrada);
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadEstanque = capacidadEstanque;
    }


    /*CAMBIAR DE STRING A TIPO ENUM(Color)*/
    public void setColor(Color color) {
        this.color = color;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }


    @Override
    public String toString() {
        String s = "id: " + id + "\n" +
                "fabricante: " + fabricante + "\n" +
                "modelo: " + modelo + "\n" +
                "color: " + color.getColorEnum() + "\n" +
                "cilindrada: " + cilindrada + "\n" +
                "capacidadEstanque: " + capacidadEstanque + "\n" +
                "colorPatente: " + Automovil.colorPatente.getColorEnum();
        return s;
    }

}
