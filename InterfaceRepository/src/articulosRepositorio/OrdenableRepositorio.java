package articulosRepositorio;

import modelo.CategoriaArticulos;
import modelo.Cliente;
import modelo.Direccion;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, CategoriaArticulos categoria);
}
