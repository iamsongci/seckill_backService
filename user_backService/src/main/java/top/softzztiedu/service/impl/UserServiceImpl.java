package top.softzztiedu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topone.entry.Member;
import com.topone.model.MemberModel;

import top.softzztiedu.exception.ServiceException;
import top.softzztiedu.result.ResultDO;
import top.softzztiedu.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private MemberModel memberModel;
	
	public ResultDO login(String name, String pwd) throws ServiceException {
		// TODO Auto-generated method stub
		ResultDO resultDO = new ResultDO();
		int login = memberModel.login(name, pwd);
		if(login!=0){
			resultDO.setSuccess(true);
			resultDO.setMessage("登陆成功");//登陆成功
			Member member = memberModel.getById(name);
			resultDO.setResult(member);//登陆成功带有用户对象
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
		int add = memberModel.add(member);
		if(add==1){
			resultDO.setSuccess(true);
			resultDO.setMessage("注册成功");//成功
		}else{
			resultDO.setSuccess(false);
			resultDO.setMessage("注册失败");//失败
		}
		return resultDO;
	}

}
