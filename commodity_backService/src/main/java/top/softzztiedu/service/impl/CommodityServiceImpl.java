package top.softzztiedu.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topone.entry.Commodity;
import com.topone.entry.Description;
import com.topone.model.CommodityModel;
import com.topone.model.DescriptionModel;

import top.softzztiedu.exception.ServiceException;
import top.softzztiedu.result.ResultDO;
import top.softzztiedu.service.CommodityService;
@Service
public class CommodityServiceImpl implements CommodityService {

	@Autowired
	private CommodityModel commodityModel;
	@Autowired
	private DescriptionModel descriptionModel;
	
	public ResultDO countAllCommodity(Boolean type) {
		// TODO Auto-generated method stub
		ResultDO resultDO = new ResultDO();
		// 得到数量
		if (type) {
			resultDO.setMessage("秒杀商品数量");
			resultDO.setResult(23);
		} else {
			resultDO.setMessage("普通商品数量");
			resultDO.setResult(256);
		}
		return resultDO;
	}

	public ResultDO getAllCommodityList(Integer start, Integer stop, Boolean type) {
		// TODO Auto-generated method stub
		ResultDO resultDO = new ResultDO();
		List<Commodity> commidities = new ArrayList<Commodity>();
		int typeint;
		if(type){
			typeint=0;
			resultDO.setMessage("秒杀商品");
		}else{
			typeint=1;
			resultDO.setMessage("普通商品");
		}
		commidities = commodityModel.getByType(start, stop, typeint);
		resultDO.setResult(commidities);
		return resultDO;
	}

	public ResultDO getMyStoreList(Integer id) {
		// TODO Auto-generated method stub
		ResultDO resultDO = new ResultDO();
		List<Commodity> commidities = new ArrayList<Commodity>();
		for (int i = 0; i <= 10; i++) {
			Commodity Commodity = new Commodity();
			Commodity.setId(i);
			Commodity.setSellerId(i);
			Commodity.setName("测试商品" + i);

			commidities.add(Commodity);
		}
		if (true) {
			resultDO.setSuccess(true);
			resultDO.setMessage("得到我的店铺商品列表");
			resultDO.setResult(commidities);
		} else {
			resultDO.setSuccess(false);
			resultDO.setMessage("未得到我的店铺商品列表");
		}
		return resultDO;
	}

	public ResultDO getMyShoppingCartList(Integer id) {
		// TODO Auto-generated method stub
		ResultDO resultDO = new ResultDO();
		List<Commodity> commidities = new ArrayList<Commodity>();
		for (int i = 0; i <= 10; i++) {
			Commodity Commodity = new Commodity();
			Commodity.setId(i);
			Commodity.setSellerId(i);
			Commodity.setName("测试商品" + i);

			commidities.add(Commodity);
		}
		if (true) {
			resultDO.setSuccess(true);
			resultDO.setMessage("得到我的购物车商品列表");
			resultDO.setResult(commidities);
		} else {
			resultDO.setSuccess(false);
			resultDO.setMessage("未得到我的购物车商品列表");
		}
		return resultDO;
	}

	public ResultDO addCommodity(Commodity commodity) throws ServiceException {
		// TODO Auto-generated method stub
		ResultDO resultDO = new ResultDO();
		// 商品添加
		int add = commodityModel.add(commodity);
		if (add==1) {
			resultDO.setSuccess(true);
			resultDO.setMessage("商品添加成功");
		} else {
			resultDO.setSuccess(false);
			resultDO.setMessage("商品添加失败");
		}
		return resultDO;
	}

	public ResultDO getcommodityInfo(Commodity commodity) {
		// TODO Auto-generated method stub
		ResultDO resultDO = new ResultDO();
		// 商品详情
		Description description = 
				descriptionModel.getById(commodity.getId());
		resultDO.setSuccess(true);
		resultDO.setMessage("商品详情获取成功");
		resultDO.setResult(description);
		return resultDO;
	}
	@Override
	public ResultDO getcommoditySeckill(Integer id) {
		// TODO Auto-generated method stub
		boolean success=false;
		ResultDO resultDO = new ResultDO();
		// 商品详情
		if(id!=null){
			Commodity commodity = commodityModel.getById(id);
			if((commodity.getStarttime()).after(new Date())){
				success=true;
			}
		}
		resultDO.setSuccess(success);
		resultDO.setMessage("秒杀时间已到");
		resultDO.setResult("1");
		
		return resultDO;
	}

}
