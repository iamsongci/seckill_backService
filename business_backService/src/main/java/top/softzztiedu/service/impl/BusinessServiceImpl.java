package top.softzztiedu.service.impl;

import top.softzztiedu.exception.ServiceException;
import top.softzztiedu.model.Order;
import top.softzztiedu.model.Shopppig;
import top.softzztiedu.result.ResultDO;
import top.softzztiedu.service.BusinessService;

public class BusinessServiceImpl implements BusinessService{

	@Override
	public ResultDO addShoppingCart(Shopppig shopppig) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultDO toPay(Integer id, Integer orderStats) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultDO getMyStoreOrder(Integer sellerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultDO addOrder(Order order) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultDO getMyOrderList(Integer buyersId) {
		// TODO Auto-generated method stub
		return null;
	}

}
