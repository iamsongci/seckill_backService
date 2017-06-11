package top.softzztiedu.result;

import java.io.Serializable;

/**
 * 
 * @author SongCi
 *
 * @param <T>
 */
public class ResultDO<T> implements Serializable{
	private boolean success= false;
	private String message = null;
	private T result = null;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "ResultDO [success=" + success + ", message=" + message + ", result=" + result + "]";
	}
	
	
}
