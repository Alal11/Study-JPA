//package jpabook.jpashop;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//import jpabook.jpashop.domain.Member;
//import jpabook.jpashop.domain.Order;
//
//public class JpaMain {
//    public static void main(String[] args) {
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        try {
//            // 객체지향이 아닐뿐더러 member 정보를 찾기 위해선 비효율적인 과정 필요
//            Order order = em.find(Order.class, 1L);
//            Long memberId = order.getMemberId();
//            Member member = em.find(Member.class, memberId);
//
//            // domain에서 참조값을 추가하면?
//            Member findMember = order.getMember();
//            findMember.getId();  // 훨씬 효율적임!
//
//
//
//
//            tx.commit();
//        } catch (Exception e) {
//            tx.rollback();
//        } finally {
//            em.close();
//        }
//
//        emf.close();
//    }
//}
