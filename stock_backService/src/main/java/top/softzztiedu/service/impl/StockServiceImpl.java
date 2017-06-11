package top.softzztiedu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topone.entry.Stock;
import com.topone.model.StockModel;

import top.softzztiedu.result.ResultDO;
import top.softzztiedu.service.StockService;
@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockModel stockModel;
	
	public ResultDO getCommodityStock(Integer id) {
		// TODO Auto-generated method stub
		ResultDO resultDO = new ResultDO();
		// 获取商品库存
		Stock stock =stockModel.getById(id);
		resultDO.setSuccess(true);
		resultDO.setMessage("获取商品库存成功");
		resultDO.setResult(stock);
		return resultDO;
	}

}
