package org.example;

import jakarta.persistence.EntityManager;
import org.example.entity.Cliente;
import org.example.util.JpaUtil;

public class HibernateFetchLazyOneToMany {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();

        Cliente cliente = em.find(Cliente.class, 1L);
        System.out.println(cliente.getNombre() + ", direcciones: " + cliente.getDirecciones());

        em.close();
    }
}
