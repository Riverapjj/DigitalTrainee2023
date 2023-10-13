package org.example;

import jakarta.persistence.EntityManager;

import org.example.entity.Student;
import org.example.entity.Course;
import org.example.util.JpaUtil;

public class OneToManyCourseStudent {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();

        try {
            em.getTransaction().begin();

            Course course1 = new Course("Curso backend");
            Course course2 = new Course("Curso frontend");

            Student student1 = new Student("Josue", "Rivera");
            Student student2 = new Student("Alexander", "Palacios");

            course1.addStudent(student1);
            course1.addStudent(student2);
            course2.addStudent(student1);

            em.persist(course1);
            em.persist(course2);

            em.getTransaction().commit();

            System.out.println(course1);
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

    }
}
