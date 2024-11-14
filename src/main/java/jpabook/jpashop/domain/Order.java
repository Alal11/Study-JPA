//package jpabook.jpashop.domain;
//
//import jakarta.persistence.*;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "ORDERS")
//public class Order {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "ORDER_ID")
//    private Long id;
//    @Column(name = "MEMBER_ID")
//    private Long memberId;  // 테이블 설계에 맞춰 외래키 가져오는 방식
//
//    private Member member;  // 참조 값을 그대로 가져와야 객체지향적 설계 가능
//
//    public Member getMember() {
//        return member;
//    }
//    public void setMember(Member member) {
//        this.member = member;
//    }
//
//    private LocalDateTime orderDate;
//    @Enumerated(EnumType.STRING)
//    private OrderStatus status;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getMemberId() {
//        return memberId;
//    }
//
//    public void setMemberId(Long memberId) {
//        this.memberId = memberId;
//    }
//
//    public LocalDateTime getOrderDate() {
//        return orderDate;
//    }
//
//    public void setOrderDate(LocalDateTime orderDate) {
//        this.orderDate = orderDate;
//    }
//
//    public OrderStatus getStatus() {
//        return status;
//    }
//
//    public void setStatus(OrderStatus status) {
//        this.status = status;
//    }
//}
