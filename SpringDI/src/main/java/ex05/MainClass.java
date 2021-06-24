package ex05;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("collection-context.xml");
		
		Customer customer=(Customer)ctx.getBean("customer");
		
		List<String> list=customer.getLists();
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}
}
