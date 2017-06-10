package top.softzztiedu.service.impl;

import top.softzztiedu.exception.ServiceException;
import top.softzztiedu.model.Member;
import top.softzztiedu.result.ResultDO;
import top.softzztiedu.service.UserService;

public class UserServiceImpl implements UserService{

	public ResultDO login(String name, String pwd) throws ServiceException {
		// TODO Auto-generated method stub
		
		ResultDO resultDO = new ResultDO();
		if(name.equals(pwd)){
			resultDO.setSuccess(true);
			resultDO.setMessage("登陆成功");//登陆成功
			resultDO.setResult(new Member());//登陆成功带有用户对象
		}else{
			resultDO.setSuccess(false);
			resultDO.setMessage("登陆失败");//登陆失败
		}
		
		return resultDO;
	}

	public ResultDO register(Object object) throws ServiceException {
		// TODO Auto-generated method stub
		Member member = (Member) object;
		ResultDO resultDO = new ResultDO();
		if(member.getName().equals("王子鹏")){
			resultDO.setSuccess(true);
			resultDO.setMessage("注册成功");//成功
		}else{
			resultDO.setSuccess(false);
			resultDO.setMessage("注册失败");//失败
		}
		return resultDO;
	}

}
