package ex02;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
//		Chef c= new Chef();
//		Hotel h= new Hotel(c);
		
		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("application-context.xml");
		
		Hotel h =(Hotel)ctx.getBean("hotel");
		Chef c=h.getChef();
		c.coocking();
		
	}

}
