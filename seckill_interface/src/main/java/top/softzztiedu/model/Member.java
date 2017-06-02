package top.softzztiedu.model;

import java.math.BigDecimal;

/**
 * 会员信息
 * @author liliang
 *
 */
public class Member {
	//id
	private Integer id;
	//会员名
	private String name;
	//密码
	private String passwd;
	//是否卖家
	private Integer sellerState;
	//店铺名称
	private String shopName;
	//余额
	private BigDecimal balance;
	//买家地址
	private String address;
	//状态
	private Integer status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Integer getSellerState() {
		return sellerState;
	}
	public void setSellerState(Integer sellerState) {
		this.sellerState = sellerState;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", passwd=" + passwd + ", sellerState=" + sellerState
				+ ", shopName=" + shopName + ", balance=" + balance + ", address=" + address + ", status=" + status
				+ "]";
	}
	
	
}
