package com.sample.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sample.beans.WishMsgGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {

		
		System.out.println("ConstructorInjectionTest.main()");
		
		Resource res = null;
		Object obj = null;
		WishMsgGenerator wmg = null;
		BeanFactory factory = null;
		
		res = new FileSystemResource("src/com/sample/cfgs/applicationContext.xml");
		
		factory = new XmlBeanFactory(res);
		
		obj = factory.getBean("wmg");
		
		wmg = (WishMsgGenerator)obj;
		
		
		System.out.println(wmg + " "+wmg.wishMessage("Veer"));

	}

	

}
