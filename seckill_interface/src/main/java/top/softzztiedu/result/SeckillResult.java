package top.softzztiedu.result;

import java.math.BigDecimal;
/**
 * 
 * @author SongCi
 *
 */

public class SeckillResult {
	private Integer result_code;
	private Integer buyer_id;
	private Integer item_id;
	private Integer item_sku_id;
	private BigDecimal total_price;
	public Integer getResult_code() {
		return result_code;
	}
	public void setResult_code(Integer result_code) {
		this.result_code = result_code;
	}
	public Integer getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(Integer buyer_id) {
		this.buyer_id = buyer_id;
	}
	public Integer getItem_id() {
		return item_id;
	}
	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}
	public Integer getItem_sku_id() {
		return item_sku_id;
	}
	public void setItem_sku_id(Integer item_sku_id) {
		this.item_sku_id = item_sku_id;
	}
	public BigDecimal getTotal_price() {
		return total_price;
	}
	public void setTotal_price(BigDecimal total_price) {
		this.total_price = total_price;
	}
	
	public SeckillResult(Integer result_code, Integer buyer_id, Integer item_id, Integer item_sku_id,
			BigDecimal total_price) {
		super();
		this.result_code = result_code;
		this.buyer_id = buyer_id;
		this.item_id = item_id;
		this.item_sku_id = item_sku_id;
		this.total_price = total_price;
	}
	@Override
	public String toString() {
		return "SeckillResult [result_code=" + result_code + ", buyer_id=" + buyer_id + ", item_id=" + item_id
				+ ", item_sku_id=" + item_sku_id + ", total_price=" + total_price + "]";
	}
	
	
}
