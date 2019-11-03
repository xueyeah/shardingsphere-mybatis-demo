package com.ljxie.shardingmybatis.controller;

import com.ljxie.shardingmybatis.entity.Order;
import com.ljxie.shardingmybatis.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("")
    public String order(@RequestBody Order order){
        orderService.insert(order);
        return "000";
    }

    @PostMapping("/selectAll")
    public List<Order> selectAll(){
        return orderService.selectAll();
    }

    @PostMapping("/delete")
    public int selectAll(Long orderId){
        orderService.delete(orderId);
        return 0;
    }

    @PostMapping("/selectAllByStatus")
    public List<Order> selectAllByStatus(@RequestParam(value="status") String status){
        return orderService.selectAllByStatus(status);
    }

    @PostMapping("/selectAllByOderId")
    public List<Order> selectAllByOderId(@RequestParam(value="orderId") long orderId){
        return orderService.selectAllByOderId(orderId);
    }

    @PostMapping("/selectAllByOderIdAndStatus")
    public List<Order> selectAllByOderIdAndStatus(@RequestParam(value="orderId") long orderId,@RequestParam(value="status") String status){
        return orderService.selectAllByOderIdAndStatus(orderId,status);
    }

    @PostMapping("/selectAllOrderByuserId")
    public List<Order> selectAllOrderByuserId(){
        return orderService.selectAllOrderByuserId();
    }

    @PostMapping("/selectAllPageing")
    public List<Order> selectAllOrderByuserId(@RequestParam(value="pages") int pages){
        return orderService.selectAllPageing(pages*2,2);
    }


}
