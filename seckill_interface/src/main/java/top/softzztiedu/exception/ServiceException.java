package top.softzztiedu.exception;

/**
 * 
 * @author SongCi
 *
 */

public class ServiceException extends Exception{
	
	public ServiceException(){
		super();
	}
	
	public ServiceException(Throwable cause){
		super(cause);
	}
	
	public ServiceException(String message){
		super(message);
	}
	
	public ServiceException(String message,Throwable cause){
		super(message,cause);
	}
	
	public ServiceException(String message,Throwable cause,boolean enableSuppression,boolean writableStackTrace){
		super(message,cause,enableSuppression,writableStackTrace);
	}
}
