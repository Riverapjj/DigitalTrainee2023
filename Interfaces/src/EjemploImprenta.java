import modelo.*;
import static modelo.Imprimible.*;
public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("Resumen laboral...", new Persona("John", "Doe"),
                "Ingeniero en sistemas");

       /* cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack: ")
                .addExperiencia("Angular");*/

        Libro libro = new Libro(new Persona("Erich", "Gamma"),
                "Patrones de diseños: Elem. Reusables POO", Genero.PROGRAMACION);

        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patron observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe("Estudio sobre microservicios",
                new Persona("Martin", "Fowler"),
                new Persona("James", "Gosling"));

        cv.imprimir();

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto generico de una clase anonima";
            }
        });

        System.out.println(Imprimible.TEXTO_DEFECTO);
    }
}
