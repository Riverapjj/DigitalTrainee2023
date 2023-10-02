package Mamiferos;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Felino felinos[] = new Felino[3];
        Tigre tigre = new Tigre("Selva", 1.1f, 1.1f, 80f, "Tigre", 10f, 35, "Bengala");
        Leon leon = new Leon("Selva", 1.2f, 1.8f, 103f, "Leon", 12f, 30, 5, 200f);
        Guepardo guepardo = new Guepardo("Selva", 1.5f, 1.7f, 78f, "Guepardo", 9f, 39);
        felinos[0] = tigre;
        felinos[1] = leon;
        felinos[2] = guepardo;




    }
}