package top.softzztiedu.service;

import top.softzztiedu.exception.ServiceException;
import top.softzztiedu.model.Commidity;
import top.softzztiedu.result.ResultDO;
/**
 * 商品服务
 * @author SongCi
 *
 */
public interface CommodityService {
	/**
	 * 计算秒杀/普通商品数量
	 * type为true是秒杀商品
	 * @param type
	 * @return
	 */
	ResultDO countAllCommodity(Boolean type);
	/**
	 * 得到秒杀/普通商品
	 * type为true是秒杀商品
	 * @param start
	 * @param stop
	 * @param type
	 * @return
	 */
	ResultDO getAllCommodityList(Integer start,Integer stop,Boolean type);
	/**
	 * 我的店铺商品列表
	 * @param id
	 * @return
	 */
	ResultDO getMyStoreList(Integer id);
	/**
	 * 得到我的购物车商品列表
	 * @param id
	 * @return
	 */
	ResultDO getMyShoppingCartList(Integer id);
	/**
	 * 商品添加
	 * @param commidity
	 * @return
	 */
	ResultDO addCommodity(Commidity commidity) throws ServiceException;;
	/**
	 * 查看商品详情
	 * @param commidity
	 * @return
	 */
	ResultDO getcommodityInfo(Commidity commidity);
	
	/**
	 * 通过秒杀商品id判断是否到了秒杀时间
	 * （0：未到，1：已到）
	 * @param id
	 * @return
	 */
	ResultDO getcommoditySeckill(Integer id);
	

}
