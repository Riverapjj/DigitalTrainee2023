import java.util.List;

public class Curriculo extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculo(String contenido, Persona persona, String carrera, List<String> experiencia) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = experiencia;
    }

    public Curriculo addExperiencia(String exp) {
        experiencia.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");

        for (String exp : this.experiencia) {
            sb.append("- ").append(exp).append("\n");
        }

        return sb.toString();
    }
}
