package articulosRepositorio;

import modelo.Articulo;
import modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ArticulosListRepositorio implements OrdenablePaginableCrudRepositorio{

    private List<Articulo> listaArticulos;

    public ArticulosListRepositorio() {
        this.listaArticulos = new ArrayList<>();
    }

    @Override
    public List<Articulo> listar() {
        return listaArticulos;
    }


}
