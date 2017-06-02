package top.softzztiedu.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OpenService {
	
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"classpath*:dubbo/remote-provider.xml","classpath*:dubbo/spring-dubbo.xml"});  
        context.start();  
        System.out.println("start-service");
        System.in.read();
	}
}
