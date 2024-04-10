package com.Product.ProductServiceApplication.Service;

import com.Product.ProductServiceApplication.DTO.OrderDTO;
import com.Product.ProductServiceApplication.Entity.Order;
import com.Product.ProductServiceApplication.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long orderId) {
        Optional<Order> optionalOrder = orderRepository.findById(orderId);
        return optionalOrder.orElse(null);
    }

    @Override
    public Order createOrder(OrderDTO orderDTO) {
        Order order = new Order(orderDTO.getCustomerName(), orderDTO.getProductName(), orderDTO.getQuantity());
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Long orderId, OrderDTO orderDTO) {
        Optional<Order> optionalOrder = orderRepository.findById(orderId);
        if (optionalOrder.isPresent()) {
            Order order = optionalOrder.get();
            order.setCustomerName(orderDTO.getCustomerName());
            order.setProductName(orderDTO.getProductName());
            order.setQuantity(orderDTO.getQuantity());
            return orderRepository.save(order);
        }
        return null;
    }

    @Override
    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}

