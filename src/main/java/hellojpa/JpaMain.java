package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        Member member = new Member();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        member.setId(1L);
        member.setName("helloA");
        em.persist(member);

        tx.commit();
        em.close();
        emf.close();

    }
}
