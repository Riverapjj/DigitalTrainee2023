package Mamiferos;

public class Guepardo extends Felino{

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    String comer() { return "Comida leon"; }
    int dormir() { return 8; }
    float correr() { return 38f; }
    String comunicarse() { return "Sonido leon"; }
}
