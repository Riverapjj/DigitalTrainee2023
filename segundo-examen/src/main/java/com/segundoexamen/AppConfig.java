package com.segundoexamen;

import com.segundoexamen.models.Categoria;
import com.segundoexamen.models.ItemFactura;
import com.segundoexamen.models.Procedencia;
import com.segundoexamen.models.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("creandoItemsFactura")
    public List<ItemFactura> crearItemsFactura(){

        /*Creando categorias*/
        Categoria cat1 = new Categoria("Cuidado bucal");
        Categoria cat2 = new Categoria("Cuidado corporal");

        /*Creando procedencias de productos*/
        Procedencia procedencia1 = new Procedencia("Distribuidor");
        Procedencia procedencia2 = new Procedencia("Farmacia");

        /*Creando 2 productos por categoria*/
        Producto producto1 = new Producto("Cepillo de dientes", 3, cat1, procedencia1);
        Producto producto2 = new Producto("Hilo dental", 1, cat1, procedencia2);

        Producto producto3 = new Producto("Crema corporal", 15, cat2, procedencia1);
        Producto producto4 = new Producto("Jabon corporal", 23, cat2, procedencia2);

        /*Creando lineas de factura por cada producto*/
        ItemFactura item1 = new ItemFactura(producto1, 3);
        ItemFactura item2 = new ItemFactura(producto2, 2);
        ItemFactura item3 = new ItemFactura(producto3, 5);
        ItemFactura item4 = new ItemFactura(producto4, 8);

        return Arrays.asList(item1, item2, item3, item4);
    }
}
