package org.example;

import jakarta.persistence.EntityManager;
import org.example.entity.Alumno;
import org.example.entity.Curso;
import org.example.util.JpaUtil;

import java.rmi.server.ExportException;

public class HibernateAsociacionesManyToManyFind {

    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();

        try {

            em.getTransaction().begin();

            Alumno alumno1 = em.find(Alumno.class, 1L);
            Alumno alumno2 = em.find(Alumno.class, 2L);

            Curso curso1 = em.find(Curso.class, 1L);
            Curso curso2 = em.find(Curso.class, 2L);

            alumno1.getCursos().add(curso1);
            alumno1.getCursos().add(curso2);

            alumno2.getCursos().add(curso1);

            em.getTransaction().commit();

            System.out.println(alumno1);
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}

