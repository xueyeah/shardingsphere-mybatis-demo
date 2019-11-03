package com.ljxie.shardingmybatis.service;

import com.ljxie.shardingmybatis.entity.Order;
import com.ljxie.shardingmybatis.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    public void insert(Order order){
        orderMapper.insert(order);
    }
    public List<Order> selectAll(){
        return orderMapper.selectAll();
    }
    public void delete(Long orderId){
        orderMapper.delete(orderId);
    }
    public List<Order> selectAllByStatus(String status){
        return orderMapper.selectAllByStatus(status);
    }

    public List<Order> selectAllByOderId(long orderId) {
        return orderMapper.selectAllByOderId(orderId);
    }

    public List<Order> selectAllOrderByuserId() {
        return orderMapper.selectAllOrderByuserId();
    }

    public List<Order> selectAllPageing(int pages, int size) {
        return orderMapper.selectAllPageing(pages,size);
    }

    public List<Order> selectAllByOderIdAndStatus(long orderId, String status) {
        return orderMapper.selectAllByOderIdAndStatus(orderId,status);
    }
}
