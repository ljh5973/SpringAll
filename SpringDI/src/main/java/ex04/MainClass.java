package ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("application-context.xml");
		
		Car car= (Car)ctx.getBean("car");
		
		car.getBattery().energy();
		
		Airplane air=(Airplane)ctx.getBean("air");

		air.getBattery().energy();
	}
	
	
}
