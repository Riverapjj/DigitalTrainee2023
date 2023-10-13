package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NamedEntityGraph;
import org.example.entity.Cliente;
import org.example.entity.Direccion;
import org.example.util.JpaUtil;

public class HibernateAsociacionesOneToMany {

    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();

        try {
            em.getTransaction().begin();

            Cliente cliente = new Cliente("Cata", "Edu");
            cliente.setFormaPago("mercado pago");

            Direccion d1 = new Direccion("El Vergel", 123);
            Direccion d2 = new Direccion("Vasco de Gama", 456);

            cliente.getDirecciones().add(d1);
            cliente.getDirecciones().add(d2);
            em.persist(cliente);

            em.getTransaction().commit();
            System.out.println(cliente);

            em.getTransaction().begin();
            cliente = em.find(Cliente.class, cliente.getId());
            cliente.getDirecciones().remove(d1);
            em.getTransaction().commit();
            System.out.println(cliente);
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
