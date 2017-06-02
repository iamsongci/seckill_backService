package top.softzztiedu.model;

import top.softzztiedu.model.base.BaseDO;

public class Shopppig extends BaseDO{
	private Integer id;
	private Integer sellerId;
	private Integer buyersId;
	private Integer commodityId;
	private Integer quantum;
	private String shopName;
	
	private Member seller;
	private Member buyers;
	private Commidity commodity;
	
	
	public Member getSeller() {
		return seller;
	}
	public void setSeller(Member seller) {
		this.seller = seller;
	}
	public Member getBuyers() {
		return buyers;
	}
	public void setBuyers(Member buyers) {
		this.buyers = buyers;
	}
	public Commidity getCommodity() {
		return commodity;
	}
	public void setCommodity(Commidity commodity) {
		this.commodity = commodity;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public Integer getBuyersId() {
		return buyersId;
	}
	public void setBuyersId(Integer buyersId) {
		this.buyersId = buyersId;
	}
	public Integer getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}
	public Integer getQuantum() {
		return quantum;
	}
	public void setQuantum(Integer quantum) {
		this.quantum = quantum;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	@Override
	public String toString() {
		return "Shopppig [id=" + id + ", sellerId=" + sellerId + ", buyersId=" + buyersId + ", commodityId="
				+ commodityId + ", quantum=" + quantum + ", shopName=" + shopName + "]";
	}
	
	

}
