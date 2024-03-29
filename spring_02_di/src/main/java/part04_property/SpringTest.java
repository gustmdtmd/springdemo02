package part04_property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		String path = "part04_property/di.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		Service svc = null;

		svc = (Service) context.getBean("svc1");
		svc.prn1(); 
		
		svc = (Service) context.getBean("svc2");
		svc.prn2();

		//p:프로퍼티 = "값" 을 이용한 출력
		svc = (Service) context.getBean("svc3");
		svc.prn1();
		
		svc = (Service) context.getBean("svc4");
		svc.prn2();
	}

}
