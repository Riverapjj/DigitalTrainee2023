import java.util.Arrays;
import java.util.Objects;

public class EjemploAutomovilArreglo {

    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Martínez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO,
                new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);

        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS,
                new Motor(1.6, TipoMotor.GASOLINA), new Estanque(50));
        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Jano", "Perez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        for (Automovil auto : autos) {
            imprimirDetalles(auto);
        }

        /*
        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto.getConductor());
        }
        */
    }

    public static void imprimirDetalles(Automovil a) {

        System.out.println("\n\n\t\t\t----------------" + a.getFabricante() + " "  + a.getModelo() + "----------------");
        System.out.println("Conductor: \n\t" + a.getConductor());
        System.out.println("\nDatos del automovil: \n\t" +
                "Fabricante: " + a.getFabricante() +
                "\n\tModelo: " + a.getModelo() +
                "\n\tColor: " + a.getColor());

        if(a.getTipo() != null) {
            System.out.println("\tTipo: " + a.getTipo());
        }else {
            System.out.println("\tTipo: Informacion no disponible.");
        }

        System.out.println("\nDatos del motor: ");

        if(a.getMotor() != null) {
            System.out.println("\tCilindrada: " + a.getMotor().getCilindrada() +
                    "\n\tTipo de motor: " + a.getMotor().getTipo());
        }else {
            System.out.println("\tInformacion no disponible.");
        }

        System.out.println("\nColor de patente: " + Automovil.getColorPatente());
        System.out.println("Capacidad del tanque: " + a.getEstanque().getCapacidad());


    }

}
