package com.qinchy.tkmybatisdemo.controller;

import com.qinchy.tkmybatisdemo.model.Orders;
import com.qinchy.tkmybatisdemo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping(path = "/orders/findAll")
    public List<Orders> findAll(){
        return ordersService.findAll();
    }
}
