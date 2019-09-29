package cn.yunhe.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.yunhe.bean.OrderDetail;
import cn.yunhe.bean.Orders;
import cn.yunhe.dao.IOrdersDao;

public class UserTest {
	@Test
	public void selectueserorders() throws IOException {
		InputStream is = new FileInputStream("config/SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlsession = factory.openSession();
		IOrdersDao od = sqlsession.getMapper(IOrdersDao.class);
		List<OrderDetail> orderdetaillistod = od.selectorders();
		System.out.println(orderdetaillistod);
	}
	
	@Test
	public void selectitems() throws IOException {
		InputStream is = new FileInputStream("config/SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlsession = factory.openSession();
		IOrdersDao od = sqlsession.getMapper(IOrdersDao.class);
		List<Orders> orderslist = od.selectitems();
		System.out.println(orderslist);
	}
}
