package top.softzztiedu.model.base;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author SongCi
 *
 */
public class BaseDO implements Serializable{

	private Date create_time;   //创建时间
	private String creator;     //创建人
	private String modifier;    //修改人
	private Date modify_time;   //修改时间
	
	public Date getCreate_time() {
		return create_time;
	}
	@Override
	public String toString() {
		return "BaseDO [create_time=" + create_time + ", creator=" + creator + ", modifier=" + modifier
				+ ", modify_time=" + modify_time + "]";
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public Date getModify_time() {
		return modify_time;
	}
	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}
	
}
