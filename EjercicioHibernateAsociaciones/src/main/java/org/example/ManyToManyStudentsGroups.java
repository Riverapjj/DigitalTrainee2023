package org.example;

import jakarta.persistence.EntityManager;

import org.example.entity.Students;
import org.example.entity.Groups;
import org.example.util.JpaUtil;

public class ManyToManyStudentsGroups {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();

        em.getTransaction().begin();

        Students student1 = new Students("Josue", "Rivera");
        Students student2 = new Students("Alexander", "Palacios");

        Groups group1 = new Groups("Curso backend");
        Groups group2 = new Groups("Curso frontend");

        student1.addGroup(group1);
        student1.addGroup(group2);
        student2.addGroup(group1);

        em.persist(student1);
        em.persist(student2);

        em.getTransaction().commit();

    }
}
