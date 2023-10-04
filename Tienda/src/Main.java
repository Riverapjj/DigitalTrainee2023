import java.util.Date;

public class Main {
    public static void main(String[] args) {

        IPhone iphone = new IPhone(599, "Apple", "11 PRO MAX", "Rose Gold");
        TvLcd tv = new TvLcd(790, "Samsung", 50);

        Comics comic = new Comics(15, new Date(1999, 10, 5),
                "Stan Lee", "Superman II", "Marvel", "Superman");


        imprimirCel(iphone);
        imprimirTv(tv);
        imprimirComic(comic);

        }

        static void imprimirCel(IPhone i) {
            System.out.println("\t\t-----------" + i.getClass().getSimpleName() + " " + i.getModelo() + "-----------" +
                    "\nFabricante: " + i.getFabricante() +
                    "\nColor: " + i.getColor() +
                    "\nPrecio: " + i.getPrecio() +
                    "\nPrecio de venta: " + i.getPrecioVenta(i.getPrecio()));
        }

    static void imprimirTv(TvLcd t) {
        System.out.println("\t\t-----------" + t.getClass().getSimpleName() + "-----------" +
                "\nFabricante: " + t.getFabricante() +
                "\nPulgadas: " + t.getPulgada() +
                "\nPrecio: " + t.getPrecio() +
                "\nPrecio de venta: " + t.getPrecioVenta(t.getPrecio()));
    }

    static void imprimirComic(Comics c) {
        System.out.println("\t\t-----------" + c.getClass().getSimpleName() + "-----------" +
                "\nTitulo: " + c.getTitulo() +
                "\nAutor: " + c.getAutor() +
                "\nPersonaje: " + c.getPersonaje() +
                "\nEditorial: " + c.getEditorial() +
                "\nFecha de publicacion: " + c.getFechaPublicacion() +
                "\nPrecio: " + c.getPrecio() +
                "\nPrecio de venta: " + c.getPrecioVenta(c.getPrecio()));
    }

    }
