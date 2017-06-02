package top.softzztiedu.model;
/**
 * 商品描述
 * @author liliang
 *
 */
public class SeckDescription {

	private Integer commodityId;
	private String discription;
	public Integer getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "SeckDescription [commodityId=" + commodityId + ", discription=" + discription + "]";
	}
	
	
}
