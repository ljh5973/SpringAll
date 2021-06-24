package ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("application-context.xml");
		
		SpringTest t =(SpringTest)ctx.getBean("test");
			t.test();
			
			SpringTest t2=(SpringTest)ctx.getBean("test");
			t2.test();
			
			System.out.println(t==t2);
	}
}
