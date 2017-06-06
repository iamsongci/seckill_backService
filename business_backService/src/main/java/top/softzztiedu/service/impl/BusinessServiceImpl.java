package top.softzztiedu.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import top.softzztiedu.exception.ServiceException;
import top.softzztiedu.model.Order;
import top.softzztiedu.model.Shopppig;
import top.softzztiedu.result.ResultDO;
import top.softzztiedu.service.BusinessService;

public class BusinessServiceImpl implements BusinessService {

	public ResultDO addShoppingCart(Shopppig shopppig) throws ServiceException {
		// TODO Auto-generated method stub
		ResultDO resultDO = new ResultDO();
		// 加入购物车

		if (true) {
			resultDO.setSuccess(true);
			resultDO.setMessage("加入购物车成功");
		} else {
			resultDO.setSuccess(false);
			resultDO.setMessage("加入购物车失败");
		}
		return resultDO;
	}

	public ResultDO toPay(Integer id, Integer orderStats) throws ServiceException {
		// TODO Auto-generated method stub
		ResultDO resultDO = new ResultDO();
		// 改变订单状态

		if (true) {
			resultDO.setSuccess(true);
			resultDO.setMessage("改变订单状态成功");
		} else {
			resultDO.setSuccess(false);
			resultDO.setMessage("改变订单状态失败");
		}
		return resultDO;
	}

	public ResultDO getMyStoreOrder(Integer sellerId) {
		// TODO Auto-generated method stub
		ResultDO resultDO = new ResultDO();
		// 获取店铺订单
		List<Order> orders = new ArrayList<Order>();
		
		for(int i=0;i<=10;i++){
			Order order = new Order();
			order.setId(i);
			order.setCommodityid(i+i);
			order.setQuantum(i);
			order.setBuyersId(i);
			order.setSellerId(i);
			order.setCreate_time(new Date());
			BigDecimal b = new BigDecimal(100.2+i);
			order.setSum(b);
			order.setAddess("郑州市中原区"+i);
			orders.add(order);
		}
		
		if (true) {
			resultDO.setSuccess(true);
			resultDO.setMessage("获取店铺订单成功");
			resultDO.setResult(orders);
		} else {
			resultDO.setSuccess(false);
			resultDO.setMessage("获取店铺订单失败");
		}
		return resultDO;
	}

	public ResultDO addOrder(Order order) throws ServiceException {
		// TODO Auto-generated method stub
		ResultDO resultDO = new ResultDO();
		// 生成订单

		if (true) {
			resultDO.setSuccess(true);
			resultDO.setMessage("生成订单成功");
		} else {
			resultDO.setSuccess(false);
			resultDO.setMessage("生成订单失败");
		}
		return resultDO;
	}

	public ResultDO getMyOrderList(Integer buyersId) {
		// TODO Auto-generated method stub
		ResultDO resultDO = new ResultDO();
		// 获取我的订单
		List<Order> orders = new ArrayList<Order>();
		for(int i=0;i<=10;i++){
			Order order = new Order();
			order.setId(i);
			order.setCommodityid(i+i);
			order.setQuantum(i);
			order.setBuyersId(i);
			order.setSellerId(i);
			order.setCreate_time(new Date());
			BigDecimal b = new BigDecimal(100.2+i);
			order.setSum(b);
			order.setAddess("郑州市中原区"+i);
			orders.add(order);
		}

		if (true) {
			resultDO.setSuccess(true);
			resultDO.setMessage("获取我的订单成功");
			resultDO.setResult(orders);
		} else {
			resultDO.setSuccess(false);
			resultDO.setMessage("获取我的订单失败");
		}
		return resultDO;
	}

}
