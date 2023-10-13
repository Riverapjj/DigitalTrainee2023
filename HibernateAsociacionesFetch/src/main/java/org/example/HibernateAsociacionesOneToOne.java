package org.example;

import jakarta.persistence.EntityManager;
import org.example.entity.Cliente;
import org.example.entity.ClienteDetalle;
import org.example.util.JpaUtil;

public class HibernateAsociacionesOneToOne {

    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();

        try {

            em.getTransaction().begin();

            Cliente cliente = new Cliente("Cata", "Edu");
            cliente.setFormaPago("Paypal");
            em.persist(cliente);

            ClienteDetalle detalle = new ClienteDetalle(true, 5000L);
            em.persist(detalle);

            cliente.setDetalle(detalle);
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
