package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Member member1 = new Member();
            member1.setUsername("member1");
            em.persist(member1);

            em.flush();
            em.clear();

            Member refMember = em.getReference(Member.class, member1.getId());
            System.out.println("refMember = " + refMember.getClass());  // Proxy

            Member findMember = em.find(Member.class, member1.getId());
            System.out.println("findMember = " + findMember.getClass());  // Member

            System.out.println("refMember == findMember: " + (refMember == findMember));

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

}

