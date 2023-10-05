package repositorio;

import modelo.Cliente;
import modelo.Direccion;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);
}
