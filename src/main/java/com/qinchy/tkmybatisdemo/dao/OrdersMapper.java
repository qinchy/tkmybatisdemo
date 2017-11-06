package com.qinchy.tkmybatisdemo.dao;

import com.qinchy.tkmybatisdemo.model.Orders;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface OrdersMapper extends Mapper<Orders> {

    /*
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    List<Orders> selectByExample(OrdersExample example);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);
    */
}