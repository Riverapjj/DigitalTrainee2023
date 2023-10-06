import modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio implements TransaccionesReservas{

    private List<Usuario> listaUsuarios;

    public UsuarioRepositorio() {
        this.listaUsuarios = new ArrayList<>();
    }

    public static String iniciarSesion() {
        return "Sesion iniciada!";
    }

    public static String cerrarSesion() {
        return "Sesion cerrada!";
    }

    @Override
    public int reservarBilletes(Integer asientos) {
        return numeroEntradasDisponibles - asientos;
    }

    @Override
    public int cancelarBillete(Integer asientos) {
        return numeroEntradasDisponibles + asientos;
    }

    @Override
    public String confirmarTransaccion() {
        return "Pago realizado!";
    }

    @Override
    public String devolucionDineroCasoCancelacion() {
        return "Reserva cancelada!";
    }
}
