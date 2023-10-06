import modelo.Pelicula;

import java.util.List;

public interface CrudPelicula {

    List<Pelicula> listarPeliculas();
    void agregarPelicula(Pelicula p);
    void actualizarPelicula(Pelicula p);
    void eliminarPelicula(Pelicula p);
    Pelicula porNombre(Pelicula p);
}
