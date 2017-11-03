package com.qinchy.tkmybatisdemo.service.impl;

import com.qinchy.tkmybatisdemo.dao.OrdersMapper;
import com.qinchy.tkmybatisdemo.model.Orders;
import com.qinchy.tkmybatisdemo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> findAll() {
        return ordersMapper.selectAll();
    }
}
