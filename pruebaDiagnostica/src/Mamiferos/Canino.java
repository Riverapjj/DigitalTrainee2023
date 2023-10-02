package Mamiferos;

abstract class Canino extends Mamifero{
    protected String color;
    protected float tamanoColmillos;

    public Canino(String color, float tamanoColmillos, String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }
}
