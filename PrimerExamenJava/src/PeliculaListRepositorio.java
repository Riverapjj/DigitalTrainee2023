import modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class PeliculaListRepositorio implements CrudPelicula{

    List<Pelicula> listaPeliculas = new ArrayList<>();

    @Override
    public List<Pelicula> listarPeliculas() {
        return listaPeliculas;
    }

    @Override
    public void agregarPelicula(Pelicula p) {
        listaPeliculas.add(p);
    }

    @Override
    public void actualizarPelicula(Pelicula p) {
        Pelicula peli = this.porNombre(p.getNombrePelicula());

    }

    @Override
    public void eliminarPelicula(Pelicula p) {

    }

    @Override
    public Pelicula porId(Pelicula p) {
        return null;
    }
}
