package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import com.hzit.dao.vo.OrderVo;
import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.Order;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface OrderMapper {

	void insertOrder(Order order);

	void deleteOrderByOrderId(Integer orderId);

	void updateOrder(Order order);

	Page<OrderVo> searchOrderByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Order> searchOrderByParams(@Param("map")Map<String, String> map);

} 
