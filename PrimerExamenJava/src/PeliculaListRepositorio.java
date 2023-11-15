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
        listaPeliculas.remove(p);
    }

    @Override
    public Pelicula porNombre(String p) {
        Pelicula peli = new Pelicula();
        for (Pelicula pelicula : listaPeliculas) {
            if(pelicula.getNombrePelicula() == p) {
                peli = pelicula;
            }
        }

        return peli;
    }
}
