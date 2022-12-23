package hellojpa;

import javassist.bytecode.stackmap.BasicBlock;

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

        try{
            member.setId(2L);
            member.setName("helloB");
            em.persist(member);

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();



    }
}