package Mamiferos;

public class Lobo extends Canino{

    private int numCamada;
    private String especieLobo;

    public Lobo(String color, float tamanoColmillos, String habitat, float altura, float largo, float peso, String nombreCientifico, int numCamada, String especieLobo) {
        super(color, tamanoColmillos, habitat, altura, largo, peso, nombreCientifico);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    String comer() { return "Comida leon"; }
    int dormir() { return 8; }
    float correr() { return 38f; }
    String comunicarse() { return "Sonido leon"; }
}
