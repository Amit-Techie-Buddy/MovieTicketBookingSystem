package com.xyz.moviebooking.repository.order;

import java.util.List;

import com.xyz.moviebooking.model.Customer;
import com.xyz.moviebooking.model.order.Order;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface OrderRepository extends MongoRepository<Order, Integer> {
    Order insert(Order order);

    List<Order> findByCustomer(Customer customer);

    Order findById(String orderId);

    Long deleteOrderById(String id);
}