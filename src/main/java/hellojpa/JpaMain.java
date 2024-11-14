package hellojpa;

import jakarta.persistence.*;

import java.util.List;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            // 영속

            Member member = new Member(200L, "member200");
            em.persist(member);

            em.flush();  // 쓰기 지연 SQL 저장소에 있는 쿼리들을 DB에 반영시킴 (원래는 커밋할 때 한꺼번에 반영됨)

            System.out.println("====================");
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}

