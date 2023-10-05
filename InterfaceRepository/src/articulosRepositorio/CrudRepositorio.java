package articulosRepositorio;

import modelo.Articulo;
import modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {

    List<Articulo> listar();
    Articulo porId(Integer id);
    void crear(Articulo articulo);
    void editar(Articulo articulo);
    void eliminar(Integer id);
}
