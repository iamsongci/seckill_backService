package top.softzztiedu.service.impl;

import top.softzztiedu.result.ResultDO;
import top.softzztiedu.service.StockService;

public class StockServiceImpl implements StockService {

	public ResultDO getCommodityStock(Integer id) {
		// TODO Auto-generated method stub
		ResultDO resultDO = new ResultDO();
		// 获取商品库存

		resultDO.setSuccess(true);
		resultDO.setMessage("获取商品库存成功");
		resultDO.setResult(3453);
		return resultDO;
	}

}
