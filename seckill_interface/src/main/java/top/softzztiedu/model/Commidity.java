package top.softzztiedu.model;

import java.math.BigDecimal;
import java.util.Date;

public class Commidity {
	// 商品ID
	private Integer id;
	// 卖家ID
	private Integer sellerId;
	// 主图
	private String pictture;
	// 名称
	private String name;
	// 开始秒杀时间
	private Date starttime;
	// 邮费
	private BigDecimal postage;
	// 价格
	private BigDecimal price;
	// 商品描述
	private String text;
	// 状态
	private Integer status;
	// 库存
	private SeckStock stock;

	public SeckStock getStock() {
		return stock;
	}

	public void setStock(SeckStock stock) {
		this.stock = stock;
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

	public String getPictture() {
		return pictture;
	}

	public void setPictture(String pictture) {
		this.pictture = pictture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public BigDecimal getPostage() {
		return postage;
	}

	public void setPostage(BigDecimal postage) {
		this.postage = postage;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
