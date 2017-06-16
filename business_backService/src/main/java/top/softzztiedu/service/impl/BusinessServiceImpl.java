package top.softzztiedu.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topone.entry.*;
import com.topone.model.OrderModel;
import com.topone.model.ShoppingModel;

import top.softzztiedu.exception.ServiceException;
import top.softzztiedu.result.ResultDO;
import top.softzztiedu.service.BusinessService;
@Service
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private ShoppingModel shoppingModel;
	@Autowired
	private OrderModel orderModel;

	public ResultDO addShoppingCart(Shopping shopppig) throws ServiceException {
		// TODO Auto-generated method stub
		boolean success = false;
		ResultDO resultDO = new ResultDO();
		if(shopppig!=null){
			int add = shoppingModel.add(shopppig);
			if (add ==1) {
				resultDO.setMessage("加入购物车成功");
			} else {
				resultDO.setMessage("加入购物车失败");
			}
		}else{
			resultDO.setMessage("shopppig为空值");
		}
		resultDO.setSuccess(success);
		return resultDO;
	}

	public ResultDO toPay(Integer id, Integer orderStats) throws ServiceException {
		// TODO Auto-generated method stub
		boolean success = false;
		ResultDO resultDO = new ResultDO();
		// 改变订单状态
		if(id!=null&&orderStats!=null){
			int update = orderModel.update(id, orderStats);
			if (update==1) {
				resultDO.setMessage("改变订单状态成功");
			} else {
				resultDO.setMessage("改变订单状态失败");
			}
		}else{
			resultDO.setMessage("id空值");
		}
		resultDO.setSuccess(success);
		return resultDO;
	}

	public ResultDO getMyStoreOrder(Integer sellerId) {
		// TODO Auto-generated method stub
		boolean success = false;
		ResultDO resultDO = new ResultDO();
		if(sellerId!=null){
			// 获取店铺订单
			List<Order> orders = new ArrayList<Order>();
			int count = orderModel.countByShellerId(sellerId);
			orders = orderModel.getAllBySheller(0, count, sellerId);
			if (orders!=null) {
				resultDO.setMessage("获取店铺订单成功");
				resultDO.setResult(orders);
			} else {
				resultDO.setMessage("获取店铺订单失败");
			}
		}else{
			resultDO.setMessage("sellerId为空！！");
		}
		resultDO.setSuccess(success);
		return resultDO;
	}

	public ResultDO addOrder(Order order) throws ServiceException {
		// TODO Auto-generated method stub
		boolean success = false;
		ResultDO resultDO = new ResultDO();
		// 生成订单
		if(order!=null){
			int add = orderModel.add(order);
			if (add==1) {
				resultDO.setMessage("生成订单成功");
			} else {
				resultDO.setMessage("生成订单失败");
			}
		}else{
			resultDO.setMessage("传入空值！！");
		}
		resultDO.setSuccess(success);
		return resultDO;
	}

	public ResultDO getMyOrderList(Integer buyersId) {
		// TODO Auto-generated method stub
		boolean success = false;
		ResultDO resultDO = new ResultDO();
		if(buyersId!=null){
			// 获取店铺订单
			List<Order> orders = new ArrayList<Order>();
			int count = orderModel.countByBuyId(buyersId);
			orders = orderModel.getAll(0, count, buyersId);
			if (orders!=null) {
				resultDO.setMessage("获取我的订单成功");
				resultDO.setResult(orders);
			} else {
				resultDO.setMessage("获取我的订单失败");
			}
		}else{
			resultDO.setMessage("buyersId为空！！");
		}
		resultDO.setSuccess(success);
		return resultDO;
	}

}
