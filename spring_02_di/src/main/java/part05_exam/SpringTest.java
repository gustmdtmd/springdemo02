package part05_exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		String path = "part05_exam/di.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		Service svc = (Service)context.getBean("svc");
		svc.prn();
		
		Service svc1 = (Service)context.getBean("svc1");
		svc1.prn1();
		
		/*
		 * [출력결과]
		 * 레코드 출력
		 */

	}//end main()

}//end class
