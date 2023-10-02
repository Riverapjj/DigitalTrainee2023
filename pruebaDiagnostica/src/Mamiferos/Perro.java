package Mamiferos;

public class Perro extends Canino{

    private int fuerzaMordida;

    public Perro(String color, float tamanoColmillos, String habitat, float altura, float largo, float peso, String nombreCientifico, int fuerzaMordida) {
        super(color, tamanoColmillos, habitat, altura, largo, peso, nombreCientifico);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    String comer() { return "Comida leon"; }
    int dormir() { return 8; }
    float correr() { return 38f; }
    String comunicarse() { return "Sonido leon"; }
}
