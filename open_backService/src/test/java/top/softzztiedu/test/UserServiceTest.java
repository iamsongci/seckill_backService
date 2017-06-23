package top.softzztiedu.test;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.topone.entry.Member;
import com.topone.entry.Order;
import com.topone.model.MemberModel;

import top.softzztiedu.exception.ServiceException;
import top.softzztiedu.service.BusinessService;
import top.softzztiedu.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-consumer.xml","classpath:remote-provider.xml"})
public class UserServiceTest {
	@Autowired
	private MemberModel memberModel;
	@Autowired
	private UserService userService;
	@Autowired
	private BusinessService businessService;
//    @Test
//	public void addUser(){
//    	
//    	Member member=new Member();
//    	member.setName("中文乱码");
//    	member.setPasswd("123445");
//    	member.setSellerState(0);
//    	member.setBalance(BigDecimal.valueOf(0.48));
//    	member.setStatus(1);
//    	System.out.println(memberModel.add(member));
//    	System.out.println(member.getId());
//	}
    @Test
    public void loginTest(){
    	try {
    		System.out.println(userService.login("xiaolong", "123456"));
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("test_end");
    }
    @Test
    public void addOrderTest(){
    	try {
    		Order order = new Order();
    		order.setBuyersId(3);
    		order.setSellerId(3);
    		order.setCommodityId(1);
    		order.setQuantum(2);
    		System.out.println(businessService.addOrder(order).getResult());
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("test_end");
    }
}
