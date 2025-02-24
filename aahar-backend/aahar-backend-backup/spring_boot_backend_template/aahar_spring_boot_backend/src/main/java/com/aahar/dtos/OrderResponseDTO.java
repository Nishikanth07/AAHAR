package com.aahar.dtos;

import java.time.LocalDateTime;
import java.util.List;

import com.aahar.pojos.OrderStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderResponseDTO {
    private Long orderId;
    private Long userId;
    private String username;
    private LocalDateTime orderPlacedAt;
    private OrderStatus orderStatus;
    private List<OrderItemDTO> orderItems;
    private LocationDTO location; // ✅ Add LocationDTO

    public OrderResponseDTO(Long orderId, Long userId, String username, LocalDateTime orderPlacedAt, OrderStatus orderStatus, List<OrderItemDTO> orderItems, LocationDTO location) {
        this.orderId = orderId;
        this.userId = userId;
        this.username = username;
        this.orderPlacedAt = orderPlacedAt;
        this.orderStatus = orderStatus;
        this.orderItems = orderItems;
        this.location = location;
    }
}
