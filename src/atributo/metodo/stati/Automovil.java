package atributo.metodo.stati;

public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;

    private int capacidadEstanque = 4;

    /*STATIC, capacidadEstanqueEstatico*/
    private static int capacidadEstanqueEstatico = 30;

    /*STATIC, COLOR PATENTE*/
    private static String colorPatente;
    private static int ultimoId;

    /*cada vez que se crea el objeto en el contructor, incrementa el ultimoId y se asiga alatributo id de la instancia*/
    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo) {
        this(); /*llama al constructor vacio*/
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo);
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilindrada);
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadEstanque = capacidadEstanque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    /*no se puede usar dis en un cotextoestatico, porque colorPatente no es de la intancia, si no
     * de la clase*/
    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    /*metodo startico con varaible estatica*/
    public static float calcularConsumoEstatico(int km, int porcentajeBencina) {
        return km / (Automovil.capacidadEstanqueEstatico * (porcentajeBencina / 100f));
    }

    @Override
    public String toString() {
        String s = "id: " + id + "\n" +
                "fabricante: " + fabricante + "\n" +
                "modelo: " + modelo + "\n" +
                "color: " + color + "\n" +
                "cilindrada: " + cilindrada + "\n" +
                "capacidadEstanque: " + capacidadEstanque + "\n" +
                "colorPatente: " + Automovil.colorPatente;
        return s;
    }

}
