package com.foodorder.order.mapper;

import com.foodorder.order.dto.OrderDTO;
import com.foodorder.order.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDTOToOrder(OrderDTO orderDTO);

    OrderDTO mapOrderToOrderDTO(Order order);

}
