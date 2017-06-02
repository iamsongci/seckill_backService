package top.softzztiedu.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单
 * 
 * @author liliang
 *
 */
public class Order {

	// ID
	private Integer id;
	// 商品ID
	private Integer commodityid;
	// 商品數量
	private Integer quantum;
	// 卖家ID
	private Integer sellerId;
	// 买家ID
	private Integer buyersId;
	// 订单创建日期
	private Date createTime;
	// 订单状态
	private Integer orderStats;
	// 总金额
	private BigDecimal sum;
	// 发货地址
	private String addess;
	// 状态
	private Integer status;
	// 卖家
	private Member seller;
	// 买家
	private Member buyer;

	public Member getBuyer() {
		return buyer;
	}

	public Member getSeller() {
		return seller;
	}

	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

	public void setSeller(Member seller) {
		this.seller = seller;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCommodityid() {
		return commodityid;
	}

	public void setCommodityid(Integer commodityid) {
		this.commodityid = commodityid;
	}

	public Integer getQuantum() {
		return quantum;
	}

	public void setQuantum(Integer quantum) {
		this.quantum = quantum;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getOrderStats() {
		return orderStats;
	}

	public void setOrderStats(Integer orderStats) {
		this.orderStats = orderStats;
	}

	public BigDecimal getSum() {
		return sum;
	}

	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}

	public String getAddess() {
		return addess;
	}

	public void setAddess(String addess) {
		this.addess = addess;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", commodityid=" + commodityid + ", quantum=" + quantum + ", sellerId=" + sellerId
				+ ", buyersId=" + buyersId + ", createTime=" + createTime + ", orderStats=" + orderStats + ", sum="
				+ sum + ", addess=" + addess + ", status=" + status + "]";
	}

}
