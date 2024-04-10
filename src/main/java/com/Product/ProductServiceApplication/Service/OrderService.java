package com.Product.ProductServiceApplication.Service;

import com.Product.ProductServiceApplication.DTO.OrderDTO;
import com.Product.ProductServiceApplication.Entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long orderId);
    Order createOrder(OrderDTO orderDTO);
    Order updateOrder(Long orderId, OrderDTO orderDTO);
    void deleteOrder(Long orderId);
}
