package com.sample.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sample.beans.WishMessageGenerator;

public class SetterInjection {

	public static void main(String[] args) {
		
		
		System.out.println("SetterInjection.main()");
		
		Resource res = null;
		Object obj = null;
		WishMessageGenerator wmg = null;
		BeanFactory factory = null;
		
		res = new FileSystemResource("src/com/sample/cfgs/applicationContext.xml");
		
		factory = new XmlBeanFactory(res);
		
		obj = factory.getBean("wmg");
		
		wmg = (WishMessageGenerator)obj;
		
		
		System.out.println(wmg.wishMessage("Veer"));

	}

}
