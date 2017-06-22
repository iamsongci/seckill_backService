package top.softzztiedu.openService;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Servlet implementation class openService
 */
public class openService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public openService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"classpath*:remote-provider.xml","classpath*:spring-consumer.xml"});  
        context.start();  
        System.out.println("start-Allservice");
        response.setContentType("test/html;charset=UTF-8");
        try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block\
			PrintWriter out =response.getWriter();
			out.println("<html><h1>服务开启失败---</h1></html>");
			out.close();
			e.printStackTrace();
			
		}
        PrintWriter out =response.getWriter();
		out.println("<html><h1>服务开启成功</h1></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
