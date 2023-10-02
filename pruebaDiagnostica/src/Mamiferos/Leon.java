package Mamiferos;

public class Leon extends Felino{
    private int numManada;
    private float potencialRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, int numManada, float potencialRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potencialRugidoDecibel = potencialRugidoDecibel;
    }

    String comer() { return "Comida leon"; }
    int dormir() { return 8; }
    float correr() { return 38f; }
    String comunicarse() { return "Sonido leon"; }
}
