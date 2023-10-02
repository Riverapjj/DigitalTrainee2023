package Mamiferos;

public class Tigre extends Felino{

    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    String comer() { return "Comida para tigre"; }
    int dormir() { return 10; }
    float correr() { return 35.3f; }
    String comunicarse() { return "Sonidos tigre"; }
}
