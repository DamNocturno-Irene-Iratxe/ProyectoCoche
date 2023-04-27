public class Coche {

    //Propiedades
    private String marca;
    private String modelo;
    private int color;
    //Asociaciones
    private Rueda[] ruedas = new Rueda[4];
    
    //Constructores
    public Coche(String marca, String modelo, int color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //Getters y settters

    //Utilidades
    //otros métodos


}
