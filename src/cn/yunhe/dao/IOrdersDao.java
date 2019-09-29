package cn.yunhe.dao;



import java.util.List;

import cn.yunhe.bean.OrderDetail;
import cn.yunhe.bean.Orders;


public interface IOrdersDao {
	//在orders表中查找某一用户的订单
	List<OrderDetail> selectorders();
	
	//查看所有商品对应的商品详情
	List<Orders> selectitems();
}
