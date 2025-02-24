package com.aahar.daos;

import com.aahar.pojos.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderDao extends JpaRepository<Order, Long> {

    @Query("SELECT o FROM Order o WHERE o.mess.messOwner.id = :messOwnerId ORDER BY o.orderPlacedAt DESC")
    List<Order> findAllOrdersByMessOwnerId(Long messOwnerId);
    
//    @Query("SELECT o FROM Order o " +
//            "WHERE o.mess.messOwner.id = :messOwnerId " +
//            "AND o.orderPlacedAt >= :startDate " +
//            "ORDER BY CASE WHEN o.orderStatus = 'PENDING' THEN 1 ELSE 2 END, o.orderPlacedAt DESC")
//    List<Order> findRecentOrdersByMessOwner(
//            @Param("messOwnerId") Long messOwnerId,
//            @Param("startDate") LocalDateTime startDate
//    );
    
    
    @Query("SELECT DISTINCT o FROM Order o " +
    	       "JOIN FETCH o.orderItems oi " +
    	       "JOIN FETCH oi.menuItem mi " +
    	       "WHERE o.mess.messOwner.id = :messOwnerId " +
    	       "AND o.orderPlacedAt >= :startDate " +
    	       "ORDER BY CASE WHEN o.orderStatus = 'PENDING' THEN 1 ELSE 2 END, o.orderPlacedAt DESC")
    	List<Order> findRecentOrdersByMessOwner(
    	        @Param("messOwnerId") Long messOwnerId,
    	        @Param("startDate") LocalDateTime startDate
    	);

    
    
}
