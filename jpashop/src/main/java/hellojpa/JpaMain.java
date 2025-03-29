package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        jakarta.persistence.EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        jakarta.persistence.EntityManager em = emf.createEntityManager();

        Member member = new Member();

        em.persist(member);

        em.close();
        emf.close();
    }
}