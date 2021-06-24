package ex03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	
	public static void main(String[] args) {
		
	
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("application-context.xml");
		
		DatabaseDev dev=(DatabaseDev)ctx.getBean("dev");
		
		System.out.println(dev.getUrl());
		System.out.println(dev.getUid());
		System.out.println(dev.getUpw());
		
		System.out.println("------------------------");
		
		MemberDAO dao=(MemberDAO)ctx.getBean("memberDAO");
		System.out.println(dao.getDev().getUrl());
		System.out.println(dao.getDev().getUid());
		System.out.println(dao.getDev().getUpw());
	}
}
