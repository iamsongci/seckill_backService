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
		boolean success = false;
		ResultDO resultDO = new ResultDO();
		if(name!=null && !name.equals("")&&pwd!=null&& !pwd.equals("")){
			Integer login = memberModel.login(name, pwd);
			if(login!=0){
				resultDO.setMessage("登陆成功");//登陆成功
				Member member = memberModel.getById(name);
				resultDO.setResult(member);//登陆成功带有用户对象
				success=true;
			}else{
				resultDO.setMessage("登陆失败");//登陆失败
			}
		}else{
			resultDO.setMessage("用户名或密码为空");
		}
		resultDO.setSuccess(success);
		return resultDO;
	}

	public ResultDO register(Object object) throws ServiceException {
		// TODO Auto-generated method stub
		boolean success = false;
		ResultDO resultDO = new ResultDO();
		if(object!=null){
			Member member = (Member) object;
			int add = memberModel.add(member);
			if(add==1){
				resultDO.setMessage("注册成功");//成功
				success = true;
			}else{
				resultDO.setMessage("注册失败");//失败
			}
		}else{
			resultDO.setMessage("传入空值对象！！");
		}
		resultDO.setSuccess(success);
		return resultDO;
	}

}
